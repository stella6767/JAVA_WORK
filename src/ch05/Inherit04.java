package ch05;

//�������̽� ����: ����� ����� ��
//�ڵ��� ����
//�������̽��� new �� �� ����. �ֳĸ� �߻�޼ҵ带 ������ ����!!!
//�ڽ��� new �ϸ� ���� ��
interface Animal2 {
	void sound(); // �߻�޼ҵ�(�Լ��� ��ü({ })�� ����)
}

class Dog2 implements Animal2 {

	@Override // ������ ���� f2 ����Ű
	public void sound() {
		System.out.println("�۸�");

	}

}

class Cat2 implements Animal2 {
	@Override
	public void sound() {
		System.out.println("�߿�");

	}
}

class Bird2 implements Animal2 {
	@Override
	public void sound() {
		System.out.println("±±");

	}

}

class Tiger2 implements Animal2 {
	@Override //�������̵��� ��Ÿ�� ������ üũ
	public void sound() {
		System.out.println("����");

	}
}

class Monkey2 implements Animal2 {
	@Override
	public void sound() {
		System.out.println("����");
	}
}

//monkey Ŭ������ ����� (����) ����ϰ�
//�ݵ�� animal2�� �����Ͻÿ�

public class Inherit04 {

	static void start(Animal2 a) {
		a.sound();
	}

	public static void main(String[] args) {
		// �ڱ� �ڽ��� Ŭ������ static�� ȣ���� ���� Ŭ������ ���� ����
		start(new Dog2());
		start(new Cat2());
		start(new Bird2());
		start(new Tiger2());
		start(new Monkey2());

	}

}
