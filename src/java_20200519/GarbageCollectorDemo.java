package java_20200519;

public class GarbageCollectorDemo {
	public static void main(String[] args) {
		Admin a1 = new Admin(); // Admin 오브젝트가 새로 두개 만들어짐.
		a1 = new Admin();
		a1 = null;
		
		a1 = new Admin();
		Admin a2 = a1;
		a1 = null;
		a2 = null;
		//null을 양쪽에 다 넣어줘야함.
		//참조해줘야함 바뀌는 부분마다 모두
		//레퍼런스 카운트가 0일때 쓸모없는 것으로 판단
	}

}
