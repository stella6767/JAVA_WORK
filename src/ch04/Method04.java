package ch04;



public class Method04 {

	
	void abc() {
		//void def() {} 불가능!/ 메서드안에 메서드를 정의할 수 없다.
	}
	
	
//	int a = int xxx() {   //메서드에 변수를 담을 수 없다. 자바스크립트와 차이점
//		return 3;
//	}
	
	
	
	
	
	int money = 1000;//heap
	
	int add(int num) { //int num stack, add() heap
	//money = money + num; //값을 유지하고 싶을 때, heap 변수를 사용하는 방법과, 
		
		
		//return을 활용한 방법이 있다.
		//둘의 차이점은 return을 활용하면 상태(여기선 heap 변수)를 변화시키지 않는다.
		//이런걸 순수홤수라고 부르며, 이런 프로그래밍 트렌드를 함수형 프로그래밍이라고 한다.
		int money2 = money + num; 
		return money2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Method04 m = new Method04();
		m.add(50000);
		System.out.println(m.money);
		
	}
}
