package java_20200525;

public class ExceptionSampleDemo {
	public static void main(String[] args) {
		//유명한 에러들 설명 나열
		
		//String msg = null;
		//NullPointerException 예외 발생
		//int msgLength = msg.length();
		//System.err.println(msgLength);
		
		//int[] array = {1,2,3}; 
		//ArrayIndexOutoOfBoundsException 예외 발생
		//int temp = array[3]; <= 이런 실수는 개발자들이 잘안함.
		
		//ArithmeticException 예외 발생 => 0으로 나눴을 때.
		//int result = 3/0;
		//System.err.println(result);
		
		//Error는 하드웨어라 개발자가 관리 못함.
		//RuntimeException 하위 객체 클레스는 해도 되고 안해도 되고.
		//안하면 프로그램 중지 and 하면 코드가 지저분해짐.
		
		//숫자는 가능한데 문자가 들어오면 에러남. 보통 밑에 설명 남겨둠.
		int first = Integer.parseInt("a");
		//넘버 포멧임. 그냥 놔두면 에러 표시 안되지만 실행하다 에러남. 보통 개발자가 넣는게 아니라 사용자가 넣는 경우에 에러가 남.
		System.err.println(first);
		
		
		
		
		
		
		
		
	}
	

}
