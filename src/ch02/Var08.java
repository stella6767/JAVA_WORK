package ch02;

//heap
class Zealot{
	String name = "zealot";
	
	//static은 한번밖에 못 만듬
	//static int attack = 10;//static 공간 첨부터 메모리에 올려져있다.
	int attack =10;
	int armor = 5;

	static int hp = 15;
	
}

//static으로 질럿들을 만들면 내가 만든 질럿 하나가 피가 깍이면 다른 질럿들도 똑같이 피가 깍인다.

public class Var08 {
	public static void main(String[] args) { 
		//
		//커스텀 자료형
		Zealot z = new Zealot();//new로 힙 메모리에 데이터들을 올려놓을 수 있다.
		System.out.println(z.name);
		System.out.println(z.armor);
		//System.out.println(Zealot.attack);
		System.out.println(z.attack);
		
		Zealot z2 = new Zealot();//20번 라인에서 똑같은 질럿 생성됨
		System.out.println(z2.name);
		System.out.println(z2.armor);
		System.out.println(z2.attack);
		
		z.attack=50;
		
		System.out.println("변화 관찰");
		System.out.println(z.attack);
		System.out.println(z2.attack);
		
		z.hp =50;
		z2.hp = 10; //하나의 공간에 값만 바뀜, 새로 메모리가 공간이 생기는 게 아니라서..
		
		System.out.println("static 변화 관찰");
		System.out.println(z.hp);
		System.out.println(z2.hp);
		
		//포지
		z.attack =11;
		
		System.out.println(z.attack);
		System.out.println(z2.attack);
		
	}
}
