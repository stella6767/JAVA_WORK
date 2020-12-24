package ch04;

class Car{
	
	String desc="소나타의 부모입니다.";
	
	public Car() {
		System.out.println("자동차");
	}
	
	public void move() {};
}


class Sonata extends Car{
	public Sonata() {
		super();
		System.out.println(super.desc);//함수도 super 가능? 오버라이딩 무시?
		System.out.println("소나타");
	}
	
	public void move() {
		super.move();
	}
}


public class Super01 {
	
	public static void main(String[] args) {
		new Sonata();
	}
}
