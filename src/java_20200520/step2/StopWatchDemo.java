package java_20200520.step2;

public class StopWatchDemo {
	public static void main(String[] args) {
		StopWatch s1 = new StopWatch();
		s1.startNano();
		
		for(long i=0;i<20000_000_000l;i++) {
	}
	s1.stopNano();
				
	double elapsedTime = s1.getElapsedNanoTime();
	System.out.printf("경과시간: %.9f",elapsedTime);
	}
}
