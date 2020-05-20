package java_20200520;

public class SubDemo {
	public static void main(String[] args) {
		
		
		Super s1 = new Super();
		System.out.println(s1.age);
		s1.playBadook();
		s1.work();
		
		System.out.println("==================");
		Sub s2 = new Sub();
		System.out.println(s2.height);
		s2.playGame();
		s2.work();
		s2.age =20;
		System.out.println(s2.age);
		s2.playBadook();
		System.out.println("==================");
		
		
		//Super s3 = new Sub();
		//추상클래스는 객체를 못만듬**
		//추상 클래스는 반드시 자식이 있어야함.
		
		//=(s2)얘가 가르치는 객체를 얘(s3)가 가르켜라
		Super s3 = s2;
		System.out.println(s3.age);
		s3.playBadook();
		s3.work();
		
		
		//자식꺼는 호출을 못함 그래서 오류
		//s3.height = 20;
		//s3.playGame();
		
		
		
		
		
		
		
		
		
		
		
	}

}
