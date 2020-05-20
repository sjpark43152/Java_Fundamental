package java_20200519;

import java.lang.*;

public class SuperDemo extends Object {
	public SuperDemo() {
		super();
	}

}
//에러가 왜 나는지 꼭 이해하도록
//디폴트랑 자동으로 만들어주고 안만들어주고 등등 이해해야함.
class A extends Object{
	A(int a){
		
	}
	A(){
}

class B extends A{
	B(){
		//super();
	}
}
}








/*
class A extends Object{
	}
}

class B extends A{
		
	}
}
*/