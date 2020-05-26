package java_20200526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class DaumScanDemo {
	
	public static void main(String[] args) 
			throws IOException {
		URL url = new URL("https://www.daum.net/");
		InputStream in = url.openStream();
		//문자데이터는 투바이트로 처리하는게 좋음.
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		
		/*FileWriter fw = new FileWriter("c:\\dev\\daum.html");
		
		while((readLine = br.readLine())!= null) {
			System.out.println(readLine);
			fw.write(readLine+"\n");
		*/
		
		//더 좋은 방법.. 아직 어떤 개념으로 돌아가는지 모르겠음. 틀은 알겠음.(throws랑 try&catch차이)
		FileWriter fw = new FileWriter("c:\\dev\\daum.html");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw,true);
		
		while((readLine = br.readLine())!= null) {
			System.out.println(readLine);
			pw.println(readLine);
		}
		//bw.flush();
	
		
		
		
	}

}
