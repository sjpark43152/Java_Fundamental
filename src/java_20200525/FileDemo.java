package java_20200525;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//자바로 폴더 만드는 법.. 엄청 신기하다. mkdirs인가 mkdir의 차이가 있음.
public class FileDemo {//생성자를 알아야 반환값을 알아야 메소드를 알아야 
	public static void main(String[] args) {
		//File 클래스 - (V)는 많이 쓴다는 거
		//1. 디렉토리 생성(V)
		//2. 파일 크기(V)length, 파일 이름, 파일 경로, 날짜<-쉽지않음.
		//3. 파일 생성, 삭제(V)delete
		//4. 파일 이름 바꾸기(V)rename
		File f1 = new File("C:\\dev\\2020\\05\\25");
		boolean success = f1.mkdirs();
		if(success) {
			System.out.println("디렉토리를 생성했습니다.");
		}else {
			System.out.println("이미 디렉토리가 있습니다.");
		}
		
		File f2 = new File("C :\\dev\\jdk-11.0.7_windows-x64_bin.exe");
		long fileSize = f2.length()/1024;//byte고
		System.out.println(fileSize+"KB");
		//이름을 알아보는 Name
		String fileName = f2.getName();//getPath
		System.out.println(fileName);
		//경로Path
		String path = f2.getPath();
		System.out.println(path);
		
		if(fileName.endsWith("exe")) {
			System.out.println("응용 프로그램");
		}else if(fileName.endsWith("pdf")) {
			System.out.println("pdf 파일");
		}else if(fileName.endsWith("zip")) {
			System.out.println("압축 파일");
		}
		//1970년1월 1일 부터 마지막 수정한 날짜까지의 시간을 밀리세컨드로 반환
		long lastModified = f2.lastModified();
		System.out.println(lastModified);
				
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(lastModified);
		
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		
		String date = sdf.format(c.getTime());
		System.out.println(date);
		
		
		File f3 = new File("c\\dev\\Hello.java");
		try{
			f3.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//f3.delete();
		File f4 = new File("c\\dev\\HelloWorld.java");
		f3.renameTo(f4);
		
	}

}
