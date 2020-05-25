package java_20200525;

public class ThrowsDemo {
	//Throw 관련된 부분 second 값 관련해서
	public static int getDivide(int first, int second)
			//throw 나오면 긴장하고 판단할 준비 NumberFormatException 이게 뭔지 알아야함.**
			//ArithmeticException을 Exception으로 오면 에러 나는 이유를 알아야함.
			throws ArithmeticException {//어쩔수 없이 ArithmeticException을 씀.
		//예외처리를 할 수 없는 구간임.
		int result = first / second;//예외가 발생하는 코드
		//이구간은 Try catch 잡을 수 없음. 그래서 메인에서 예외를 만들고 각각 클래스에서 던지기함(throw)
		return result;
	}
	public static void main(String[] args) {
		//System.out.println(3/0);
		try {
			  int first = Integer.parseInt(args[0]);//예외가 발생하는 코드
		      int second = Integer.parseInt(args[1]);//예외가 발생하는 코드
				
			  int result = getDivide(first, second);//Exception 놓으면 이쪽이 에러발생 
			  //=> 이부분을 꼭알아함.**
			  System.out.println(result);
			  System.out.printf("결과 : %d%n", result);
		  }catch(ArrayIndexOutOfBoundsException e) {
			  System.err.println("인자를 2개 입력하셔야 합니다.");
		  }catch(NumberFormatException e) {
			  System.err.println("인자에는 숫자를 넣어야 합니다.");
		  }catch(ArithmeticException e){	//이부분은 캐취를 해줘야함 파이널로 놔두면 에러.
			  System.out.println("0으로 나눌수 없습니다.");
		  }finally {
			  System.out.println("finally");
		  }
		  
		  System.out.println("끝");
		  //이런 현상이 절대 발생하지 않게끔 개발을 해주어야함.(?) throw랑 throws는 다름.
		
	}

}
