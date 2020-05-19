package java_20200519;

public class AdminDemo {
	public static void main(String[] args) {
		Admin a = new Admin("syh1011","1111","syh@hbilab.org",1);
		//a.id = "syh1011"; //id가 private 이기 때문에 접근 불가
		//a.setId("syh1011");
		//a.setPwd("1111");
		//a.setEmail("syh@hbilab.org");
		//a.setLevel(1);
		
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
		
		//생성자도 오버로딩이 가능하다
		//복사해서 옮기는 법 
	
		Admin a1 = new Admin("syh2022","2222","test@test.com");
		
		System.out.println(a1.getId());
		System.out.println(a1.getPwd());
		System.out.println(a1.getEmail());
		System.out.println(a1.getLevel());
		
		
		
		
		
	}

}
