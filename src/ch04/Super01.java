package ch04;

class Car{
	
	String desc="�ҳ�Ÿ�� �θ��Դϴ�.";
	
	public Car() {
		System.out.println("�ڵ���");
	}
	
	public void move() {};
}


class Sonata extends Car{
	public Sonata() {
		super();
		System.out.println(super.desc);//�Լ��� super ����? �������̵� ����?
		System.out.println("�ҳ�Ÿ");
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
