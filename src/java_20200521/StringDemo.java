package java_20200521;

public class StringDemo {
	public static void main(String[] args) {
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		System.out.println(s1 == s2);
		//equals() 메서드가 true가 나오는 이유는 Object 클래스의 equals()
		//메서드를 오버라이딩(객체의 안의 문자열 비교)했기 때문이다.
		System.out.println(s1.contentEquals(s2));
		
		String s3 = "world";
		String s4 = "world";
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
	}

}
 
