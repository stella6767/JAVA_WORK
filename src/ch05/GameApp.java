package ch05;

public class GameApp {
	
	//조이스틱
	static void start(Control c) {
		c.엑셀();
		c.브레이크();
	}
	
	
	public static void main(String[] args) {
		Sonata s = new Sonata();
		start(s);
		
		Genesis g = new Genesis();
		start(g);
		
		Ferari f = new Ferari();
		f.질주(); //인터페이스를 만드는 이유, 다중상속을 이용해서, 특정 클래스에 특정 함수를 간편히 추가
		//부모 클래스 오버라이딩처럼 전부 다 안 만들어도 된다.
		
		
	}
}
