package ch05;

class Animal{
	void sound() {}//�Լ��� Ÿ�� ��������. ���� �� �ִ� �ڽ�, �������ε�
}

class Dog extends Animal{
	//�������̵�(��ȿȭ�ϴ� - �θ��� �Լ�)
	void sound() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal{
	//�������̵�(��ȿȭ�ϴ� - �θ��� �Լ�)
	void sound() {
		System.out.println("�߿�");
	}
}

class Bird extends Animal{
	//�������̵�(��ȿȭ�ϴ� - �θ��� �Լ�)
	void sound() {
		System.out.println("±±");
	}
}

public class Inherit03 {
	
	static void start(Animal a) {
		a.sound();
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();//dog�� animal�� heap�� �߰�, �����ʹ� dog�� ����Ų��.
		Inherit03.start(d);
		
		Cat c = new Cat();
		Inherit03.start(c);
	}

}