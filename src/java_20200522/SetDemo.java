package java_20200522;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
	public static void main(String[] args) {
		//ctl + shift + o(영문자) 자동 임폴트
		//Hashset 객체의 중복을 허용하지 않고, 순서 없음.
		HashSet set = new HashSet();
		set.add(1);//auto boxing
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(1);
		//배열하고 똑같음
		System.out.println(set.size());
		
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Integer number = (Integer)i.next();
			System.out.println(number);
		}
		
		
		
	}

}
