package test;

import ch05.BlueCloth;
import ch05.Factory;

//protected는 같은 패키지+자식만 상속
public class FactoryApp {
	
	public static void main(String[] args) {
		Factory f1 =new BlueCloth();
		
		//색칠 이후에 건조 순으로 반드시 순서대로 해야하는 프로세스가 있다고치자.
		//이렇게 작성할 경우 실수의 여지가 너무 크므로, protected를 붙여서 다른 패키지에서 직접 색칠,건조 함수에 접근불가 설정하고
		//factory 추상클래스에 public 가동이라는 함수를 하나 만들어서 내용에 순차적으로 시행시켜주면, 절대 실수할 여지가 없다.
//		f1.색칠();//동적바인딩
//		f1.건조();
		
		f1.가동();
	}
}
