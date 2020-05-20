package java_20200520.step3;

public class StopWatchDemo {
	
	public static void run(StopMilliWatch s1) {
		s1.start();
		for(long i=0;i<2000_000_000l;i++) {
			
		}
		s1.stop();
		
		double elapsedTime = s1.getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}
	public static void run(StopNanoWatch s1) {
		s1.start();
		for(long i=0;i<2000_000_000l;i++) {
			
		}
		s1.stop();
		
		double elapsedTime = s1.getElapsedTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}
	public static void main(String[] args) {
		//나머지 코드 변화없게 하기위해.
		//계산을 해주는 놈은 Method화 시킴.// 코드들이 제자리를 찾게하기위해.
		//StopNanoWatch s1 = new StopNanoWatch();
		StopMilliWatch s1 = new StopMilliWatch();
		run(s1);
	}
}
	