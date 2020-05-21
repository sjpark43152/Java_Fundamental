package java_20200521;

public class EqualsDemo {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		//문자열 비교할 때 ==쓰면 안됨
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		//내역이 같으면 true가 나오게 override로 함.
		
		Customer c1 = new Customer("성영한","제주도");
		Customer c2 = new Customer("성영한","제주도");
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1);//오브젝트껄 써서 그럼
		System.out.println(s1);//오버라이딩 되서 안에 있는게 나옴.
		
		
		
		
		
	}

}
