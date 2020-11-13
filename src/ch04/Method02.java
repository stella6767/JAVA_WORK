package ch04;

class Dog{
	int 배고픔 = 100; //상태
	
	void eat() { //행위
		배고픔 = 10;
	}
}

public class Method02 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		//d1.배고픔 = 10; 이렇게 변수를 직접적으로 바꾸는 것은 가능한 하지 마셈.
		
		d1.eat();//권장사항 
		
		System.out.println("강아지의 배고픔: " + d1.배고픔);
	}
}
