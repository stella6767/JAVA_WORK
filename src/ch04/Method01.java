package ch04;

//java만의 특징 : 모든 코드는 class 내부에 둬야 한다.
public class Method01 {
	// class바로 밑 Main 위 공간의 데이터는 heap에 들어간다. int num = 10;

	static void add() {
		System.out.println("add함수 호출됨");
	}

	void sound() {
		System.out.println("sound함수 호출됨");
	}

	public static void main(String[] args) {
		Method01.add();

		Method01 m = new Method01();
		m.sound();
	}
}
