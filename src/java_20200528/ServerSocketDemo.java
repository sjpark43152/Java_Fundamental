package java_20200528;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketDemo {
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		for(int i=1;i<6500;i++) {
			try {
				serverSocket = new ServerSocket(i);
				System.out.println(i+"포트를 사용할 수 있습니다.");
			} catch (IOException e) {
				System.err.println(i+"포트를 사용하고 있습니다.");
			}		
		}
		
	}
	

}
