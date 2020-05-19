package java_20200519;

public class Child extends Parent {
	String chicken;
	int money;
	public void gotoSchool() {
		System.out.println("Child gotoSchool()");
	}//play ctrl + space
	
	//playMyself로 만들지말아라(재정의해라)
	public void play(String starcraft) {
		//super.play(starcraft);
		//완전 재정의하고 다시함. 
		System.out.println("Child play()");
	}
	
	
	
	
	public void setParentMoney(int money) {
		super.money = money;
	}
	
	public int getParentMoney() {
		return super.money;
	}

}
