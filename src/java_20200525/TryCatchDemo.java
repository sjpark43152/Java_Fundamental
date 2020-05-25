package java_20200525;

public class TryCatchDemo {
	// 이걸 만들어야 작동함
	// 이거 만드는 법이랑 이유를 알아야함.
	
	public static double getAvg(int first, int second) {
		int sum = first + second;
		double avg = (double) sum / 2;
		return avg;
		
	}
	
	// 왜 스테틱 보이드 메인인지. 보이드가 뭔지. 리턴값을 왜 안넣는지?
	// 인덱스 ParseInt에러가 나는 경우 => 사용자가 집어 넣을 때 에러가 남.
	// 사용자로 부터 입력을 받으면 언제든 에러가 남.
	// 참고해서 프로그램을 짜야함.
	public static void main(String[] args) {
		// 이 두개의 평균을 구하려고함. 인자값이 안들어가서 에러남
	  try {
		int korean = Integer.parseInt(args[0]);
		int english = Integer.parseInt(args[1]);
		
		double average = getAvg(korean, english);
		System.out.printf("평균 : %f", average);
	  }catch(ArrayIndexOutOfBoundsException e) {
		  //System.out.println("예외 메세지 : "+e.getMessage());
		  //System.out.println("2개 너!");
		  e.printStackTrace();
		  /*
		   * 일반 출력 : System.out
		   * 에러 출력 : System.err
		   */
	  // 파이날리 블럭은 에러가 나도 실행함. 에러가 안나도 실행함.
      // 만약 예외처리 안하면 바로 종료
	  // 개발자가 잡아야할 최상위 클레스 Exception이 다잡음.  
	  }catch(NumberFormatException e){
		  //System.err.println("예외 메세지 : "+e.getMessage());
		  System.err.println("문자말고 숫자 너!");
		  
	  }finally {
		  System.out.println("finally");
	  }
	  
	  //catch 블럭이 여러 있을 경우 위에서 부터 하위 클래스 순으로 => 상위클래스순으로 정한다.
	  //이걸 어기면 에러남.
	  //throws는 이해가 필요 / TryCatch는 외무면 됨.
	  //4개 나눈건 그때 그때 공부.
	  //Error클래스랑 런타임빼고 다 예외해야함.
	  //호출하는 쪽에선 반드시 해야함. => 음.
	  //Integer.parseInt에서 손댈게 없었던 이유.
	  //API를 알려면 Throws를 무조건 외워야함.
	  
	  
	
	}
	
	

}
