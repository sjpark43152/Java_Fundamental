package java_20200514;

public class ArrayCopyDemo {
	public static void main(String[] args) {
		String[] fruits = {"apple","banana",
				"watermelon","bluedberry"};
		
		String[] temp = new String[6];
		// fruits => 원본배열
		// 0 => 원본배열의 위치
		// temp => 복사할 배열
		// 2 => 복사할 배열의 위치
		// 4 => 원본배열의 4개 요소를 복사
	
		System.arraycopy(fruits, 0, temp, 2, 4);;
		
		temp[0] = "peach";
		temp[1] = "pear";
		
		//인덱스도 출력하고 싶을 때
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
		
		//싹다출력
		for(String value : temp) {
			System.out.println(value);
		}
	}

}
