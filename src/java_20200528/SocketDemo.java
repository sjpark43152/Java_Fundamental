package java_20200528;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketDemo {//예전엔 불법이 아니였음. 요즘엔 이걸 신고해서 불법이됨. 특정 아이피에서 스캔하고 있다. 이게 왜 불법인지 궁금
	public static void main(String[] args) {
		Socket socket = null;
		for(int i=22;i<=80;i++) {
			try {
				socket = new Socket("13.209.180.253",i);//80,443,22 열려있음.
				
				System.out.println(i + "번 포트가 열려 있습니다.");
				
			} catch (UnknownHostException e) {
				System.err.println("호스트가 없습니다.");
			} catch (IOException e) {
				System.err.println(i+"번 포트가 닫혀 있습니다.");
			}
		}
	}

}
