package java_20200526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) {

		InputStream in = System.in;//표준 입력장치와 연결(키보드)
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		
		try {
			//in.read(b) : 입력을 기다리고 있고, 키보드입력중에 enter치면
			//키보드에 입력한 데이터를 b에 저장시킨다.
			/*
			byte[] b = new byte[10000];
			System.out.println("입력하세요>");
			
			int readByteCount = 0;
			
			while((readByteCount = in.read(b))!= -1) {
				String str = new String(b,0,readByteCount);
				System.out.println(str);
				System.out.print("입력하세요>");
			}
			*/
			//훨씬더 직관적이고 효율적인 키보드 입력 클래스
			//isr 투바이트로 변경하고 버퍼드 리더에 넣으면 엄청난 효율
			isr = new InputStreamReader(in);
			//원바이트를 투바이트로 바꿔버린것(in)은 키보드로 연결되있는 것
			br = new BufferedReader(isr);
			String readLine = null;//왜 눌이냐 -1이 아니고?
			System.out.println("입력하세요>");
			while((readLine = br.readLine())!= null) {
				System.out.println(readLine);
				System.out.println("입력하세요>");
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
