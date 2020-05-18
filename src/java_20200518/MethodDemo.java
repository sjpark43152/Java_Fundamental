package java_20200518;

public class MethodDemo {
	//8-16라인까지 메서드를 정의
	//boolean 메서드의 반환값
	//instance 매서드
	//int year => 매개변수(parameter)
	public boolean isLeafYear(int year) {
		//매서드의 반환값이 boolean이기 때문에 return value의
		//value도 boolean 이어야 한다.
		
		boolean isLeaf =
				year%4 == 0 &&
				year%100. != 0 ||
				year%400==0;
		return isLeaf;
		
	}
    public long plus(int first, int second) {
    	return (long)first + (long)second;
    	
    }
    
    public double divide(int first, int second) {
    	return (double)first/(double)second;
    }
    
    public void println(String message) {
    	System.out.println(message);
    
    }
    
    public int[] ascending(int[] array) {
    	for(int i = 0; i < array.length; i++) {
			for(int j = 0 ; j < array.length -(i + 1) ; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
					
				}
			}
		}
    	return array;
    }
    public static void main(String[] args) {
    	MethodDemo m = new MethodDemo();
    	boolean test = m.isLeafYear(2000);//아규먼트(Argument)
    	if(test) {
    		System.out.println("윤년입니다");
    	}else {
    		System.out.println("윤년이 아닙니다.");
    	}
    	
    	long result = m.plus(1000000, 12312331);
    	System.out.println(result);
    	
    	double result2 = m.divide(12,5);
    	System.out.println(result2);
    	
    	int[] temp = {1, 34,9,2,40,5,45};
    	
    	for(int value : temp) {
    		System.out.println(value +"\t");
    		
    	}
    	int[] result3 = m.ascending(temp);
    	
    	for(int value :result3) {
    		System.out.println(value +"\t");
    		
    	}
    	
    	
    	
    	
    }
    
    
}
