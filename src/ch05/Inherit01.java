package ch05;


//1. 재산을 물려 받는 의미(콤포지션을 해야함) //이렇게는 잘 안 씀
//이유: 아버지는 자식이 아니고, 자식이 아버지도 아니므로 이렇게는 잘 안 씀
class Father{
	int money = 10000;
		
}

class Son extends Father{
	int money = 20000;
}

public class Inherit01 {
	
	public static void main(String[] args) {
		Son s =new Son(); //heap이 2개가 뜨므로, Father을 가리킬 수도 있고, Son을 가리킬 수도 있음, 즉 father s 가능함
		
		//1번 변수를 찾을 때 변수가 있으면 그 변수를 사용
		//변수가 없으면 부모를 찾아 올라감
		System.out.println(s.money);//heap 구조로 볼때 son이 밑에 있고 father이 위에 있음. 밑에 없으면 위로 타고올라감
		
		//2번 new를 하면 Father과 Son이 heap에 뜬다.
		//생성자는 Son()만 호출이 된다
		//가르키는 메모리 주소는 타입을 따라간다.
		Father f = new Son();
		System.out.println(f.money);
	}
}
