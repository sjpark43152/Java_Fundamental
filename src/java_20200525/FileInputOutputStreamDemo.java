package java_20200525;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
	
	public FileInputOutputStreamDemo() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(
					"c:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
			fos = new FileOutputStream("c:\\dev\\jdk.exe");
			
			int readByte = 0;
			//fis.read() : 한바이트 읽어 반환한다. 더이상 읽을 바이트가 없으면
			// -1을 반환한다.
			//while패턴은 외워야함.
			while((readByte = fis.read())!= -1) {
				//fors.write(~) : 한 바이트 쓰기
				fos.write(readByte);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();	
				
		} finally {
			try{
				if(fis !=null) fis.close();
				if(fos !=null) fos.close();	
			} catch (IOException e) {
			e.printStackTrace();
			}
		
		}
     }
}
