package ch04;

//java���� Ư¡ : ��� �ڵ�� class ���ο� �־� �Ѵ�.
public class Method01 {
	// class�ٷ� �� Main �� ������ �����ʹ� heap�� ����. int num = 10;

	static void add() {
		System.out.println("add�Լ� ȣ���");
	}

	void sound() {
		System.out.println("sound�Լ� ȣ���");
	}

	public static void main(String[] args) {
		Method01.add();

		Method01 m = new Method01();
		m.sound();
	}
}
