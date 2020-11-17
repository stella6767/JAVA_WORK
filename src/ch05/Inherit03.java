package ch05;

class Animal{
	void sound() {}//함수는 타고 내려간다. 힙에 떠 있는 자식, 동적바인딩
}

class Dog extends Animal{
	//오버라이딩(무효화하다 - 부모의 함수)
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	//오버라이딩(무효화하다 - 부모의 함수)
	void sound() {
		System.out.println("야옹");
	}
}

class Bird extends Animal{
	//오버라이딩(무효화하다 - 부모의 함수)
	void sound() {
		System.out.println("짹짹");
	}
}

public class Inherit03 {
	
	static void start(Animal a) {
		a.sound();
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();//dog와 animal이 heap에 뜨고, 포인터는 dog를 가리킨다.
		Inherit03.start(d);
		
		Cat c = new Cat();
		Inherit03.start(c);
	}

}
