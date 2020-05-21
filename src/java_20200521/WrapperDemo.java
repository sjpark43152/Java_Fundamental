package java_20200521;
import java.util.ArrayList;
public class WrapperDemo {
	public static void main(String[] args) {
		String s1 = "10";
		String s2 = "20";
		
		
		
		/*
		 * 자바 1.4이전 버전에서는 primitive data type를 Collection에 저장
		 * 할 수 없었기 때문에 primitive data type를 객체화 할 수 있는 
		 * Wrapper class가 필요함. 아래와 같이 1을 추가할 수 없음.
		 * Collection에 1을 저장하기 위해서는 primitive data type를 객체화 
		 * 하는 Integer 클래스로 변환해야 함.
		 */
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(new Integer(1));
		
		/*int[] temp = {1,2,3,4,};
		
		Interger i1 = new Integer(1);
		Interger i2 = new Integer(2);
		interger i3 = i1.intValue() + i2.intValue();
		//이게 무슨뜻인가 졸아서 따로 공부해야함..
		
		
		ArrayList list = new ArrayList();
		list.add(new Integer(1));
		*/
		
		
		//레포를 크리티컬로 어떻게바ㅃㄲ느냐.\
		
		//1. primitive data type => wrapper class( new integer(1))
		
	    Integer i1 = new Integer(10);
	    integer i2 = new Integer(20);
	    
	    //2. wrapper class => primitive data type( xxxValue())
	    
	    int i3 = i1.intValue() + i2.inValue();
	    
	    //3. String => primitive data type
	    
	    String s1 = "10.20";
	    String s2 = "20.34";
	    
	    double i4 =Integer.parseDouble(s1) + Integer.parseDouble(s2);
	    
	    //4. primitive data type = String
	    
	    String s3 = 10+"";
	    String s3 = String.valueOf(10);
	    //이부분들 크리미티브데이터가 자동으로 성전환 하는 걸 오토빡싱
	    //primitive data type 자동으로 wrapper class 
	    //변환하는 것을 auto boxing
	    Integer i5 = 10;
	    Integer i6 = 20;
	    
	    
	    //레퍼클래스가 자동으로 크리미티브로 된거 => 오토 언빡식
	    //wrapper class가 자동으로 primitive data type 변환하는 것을
	    //auto un-boxing
	    int i7 = i5 + i6;
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
