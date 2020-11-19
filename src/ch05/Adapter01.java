package ch05;

interface Nife{
	void 요리();
	//default void 상해() {}; //default로 해도 되는데, 강제성이 없으므로 실수의 여지가 큼!
	
}

//어댑터 용도
abstract class 요리사Adapter implements Nife{//어차피 추상메소드니 구현안해도 된다.
	public void 상해() { //인터페이스를 걸러낸다.
		
	}	
}


//어댑터패턴
class 백종원 extends 요리사Adapter{

	@Override
	public void 요리() {
		// TODO Auto-generated method stub
		
	}

	
}

public class Adapter01 {
	public static void main(String[] args) {
		
	}

}
