package java_20200525;

import java.text.SimpleDateFormat;
import java.util.Calendar;
//자바를 이용한 달력. 
public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		//인마일밀스안에 특정 날짜 넣으면 바꿀 수 있음
		cal.setTimeInMillis(0);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year+"년"+month+"월"+day+"일");
		System.out.println(hour+","+minute+","+second);
		//패턴을 넣을 수 있음 - 이패턴 하나 외우면 모든 문서에 나와있음.
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E요일");
		
		String date = sdf.format(cal.getTime());
		System.out.println(date);
		
		
		
	}

}
