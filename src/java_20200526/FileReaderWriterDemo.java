package java_20200526;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("c:\\dev\\");
			fw = new FileWriter("c:\\dev\\");
			/*//한문자씩 읽어서 한문자를 출력
			int readChar = 0;
			while((readChar = fr.read())!= -1) {
				System.out.print((char)readChar);//표준 출력장치 출력
				fw.write(readChar);//파일로 출력
			}*///밑에는 캐릭터 배열만큼 쭉읽어서
			
			int readCharCount = 0;
			char[] readChars = new char[1024];
			while((readCharCount = fr.read(readChars))!= -1) {
				System.out.print(new String(readChars,0,readCharCount));
				//fw.write(readChars,0,readCharCount);
				fw.write(new String(readChars,0,readCharCount));
				//stream chain으로 감싸서 다른 걸로 만드는 걸 할것
				
			}
			
			
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try{
				if(fr != null) fr.close();
				if(fw != null) fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
