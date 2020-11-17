package star1;

import lombok.SneakyThrows;

//1.Zealot, Drgoon, Tank, Scv, DarkTempler => StarUnit 타입 일치



public class Star3App {
	
	public static void attack(StarUnit u1, StarUnit u2) {
		System.out.println(u1.getName() + " -> " + u2.getName() + " 공격");
		u2.setHp(u2.getHp() - u1.getAttack());
		System.out.println(u2.getName() + " 체력: " + u2.getHp());

	}
	
	public static void grandchild(StarUnit u1) {
		System.out.println(u1.getName2());

	}
	
	public static void main(String[] args) {
		
		Zealot z1 = new Zealot("질럿1", 100, 10); //zealot starunit heap에 뜨고 zealot을 가리킴
		Dragoon d1 = new Dragoon("드라군1", 100, 20);
		Dragoon d2 = new Dragoon("드라군2", 100, 20);
		DarkTempler da1 = new DarkTempler("다크템플럿1", 100, 50);
		DarkTempler da2 = new DarkTempler("다크템플럿2", 100, 50);
		
		StarUnit n = new Grandchild(); //ss,zealot,starunit heap 포인터 Ss
		grandchild(n); //오바리이딩 된 함수를 통해 변수를 접근할 때, 오버라이딩 된 함수가 여러개 이상일 때, 
		//그 중 어떤 자식계층의 함수를 특정하고 싶을 때, new를 통해서 heap에 떠 있는 메모리를 조절하는 방법과
		//아예 함수명을 새로 만들어서 접근하는 방법이 있다. 물론 참조변수의 타입에는 오버라이딩 할 수 있게, 
		//접근하고 싶은 특정계층의 함수, 참조변수 타입 클래스의 함수는 둘 다 만들어야 한다.
		
		
		
		attack(z1,d1);
		attack(d1, z1);
		// 3.드라군1 -> 드라군2 공격
		attack(d1, d2);
		// 4.다크템플러1 ->질럿1 공격(다크템플러,100,50)
		attack(da1, z1);
		// 5.다크템플러2 -> 드라군1 공격
		attack(da2, d1);
		
	
		
	}
}
