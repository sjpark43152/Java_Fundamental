package java_20200525;
//사용자 정의 예외 클래스
//자바에서 제공하는  예외 클래스가 없기 떄문에 새로 만들어서 사용해야 함.
public class InsufficientBalaceException extends Exception {
	public InsufficientBalaceException(String message) {
		super(message);
	
	}

}
