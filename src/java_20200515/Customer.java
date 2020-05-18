package java_20200515;
//Customer 클래스
public class Customer {
	//클래서의 멤버 변수 - instance 변수, static 변수, final 변수
	//인스턴스 변수(name, email, phone, balance, isReleased)
	//앞에 붙이면 달라짐, instance / static 변수만 이해
	//객체가 생성될 때만 만들어지는 변수
	
	public String name;
	public String email;
	public String phone;
	public double balance;
	public boolean isReleased;
	public static double interestRate;
	//상수는 대문자로 쓰는 것이 관례
	//상주는 한번 정해지면 값을 변경할 수 없음으로 일반적으로 static final로
	//사용한다.
	
	public static final String BANKNAME = "신한은행";
	
	//하나만 바꾸면 다바낌 static c.f) public static 이냐 그냥 public 이냐 차이
	//일일이 다바꾸는 것 instance
	//이메일 이름 핸드폰 등등은 각자 / 이자율, 상품명, 은행이름 공통 ->  구분하면 편하게 코딩가능.
}
