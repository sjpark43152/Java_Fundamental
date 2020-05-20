package java_20200520;

public class ShapeDemo {
	//추상 클래스의 다형성 - 면접때 설명가능하면 100 / OOP를 설명할 줄 아는게 중요.overloading/override
	//Shape를 넣어주면 한번에 끝남.
	//어떻게 운용되나 그림한번 그려볼것
	
	public static void run(Shape s) {
		s.draw();
	}
	/*
	public static void run(Triangle t) {
		t.draw();
	}
	public static void run(Circle c) {
		c.draw();
	}
	
	public static void run(Rectangle r) {
		r.draw();
	}
	*/
	public static void main(String[] args) {
		//추상클래스는 객체를 생성할 수 없다.
		//Shape s1 = new Shape();
		
		Rectangle r1 = new Rectangle();
		run(r1);
		
		Circle c1 = new Circle();
		run(c1);
		
		Triangle t1 = new Triangle();
		run(t1);
		
	}

}
