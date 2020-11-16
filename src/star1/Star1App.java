package star1;

//오버로딩은 함수의 이름이 같아도 매개변수의 타입이나, 위치, 개수가 다르면
//디른 함수로 인식한다.(과적재) - 경우의 수가 제한되어있을 때
//장점: 함수의 이름 통일 
public class Star1App {

	// 질럿 -> 드라군
	static void attack(Zealot u1, Dragoon u2) {
		System.out.println(u1.name + " -> " + u2.name + " 공격");
		u2.hp = u2.hp - u1.attack;// 90
		System.out.println(u2.name + " 체력: " + u2.hp);

	}

	static void attack(Dragoon u1, Zealot u2) {
		System.out.println(u1.name + " -> " + u2.name + " 공격");
		u2.hp = u2.hp - u1.attack;// 90
		System.out.println(u2.name + " 체력: " + u2.hp);

	}

	static void attack(Dragoon u1, Dragoon u2) {
		System.out.println(u1.name + " -> " + u2.name + " 공격");
		u2.hp = u2.hp - u1.attack;// 90
		System.out.println(u2.name + " 체력: " + u2.hp);

	}

	static void attack(DarkTemplot u1, Zealot u2) {
		System.out.println(u1.name + " -> " + u2.name + " 공격");
		u2.hp = u2.hp - u1.attack;// 90
		System.out.println(u2.name + " 체력: " + u2.hp);

	}

	static void attack(DarkTemplot u1, Dragoon u2) {
		System.out.println(u1.name + " -> " + u2.name + " 공격");
		u2.hp = u2.hp - u1.attack;// 90
		System.out.println(u2.name + " 체력: " + u2.hp);

	}

	public static void main(String[] args) {
		Zealot z1 = new Zealot("질럿1", 100, 10); // z1,d1 자체는 stack(지역변수)이다.
		Dragoon d1 = new Dragoon("드라군1", 100, 20);// heap 변수는
		// new로 뜬 string name = 질럿1, hp =100 ,attack = 10 등
		Dragoon d2 = new Dragoon("드라군2", 100, 20);
		DarkTemplot da1 = new DarkTemplot("다크템플럿1", 100, 50);
		DarkTemplot da2 = new DarkTemplot("다크템플럿2", 100, 50);

		// 1. 질럿1 -> 드라군1 공격
		attack(z1, d1);
		// 2. 드라군1 -> 질럿1 공격
		attack(d1, z1);
		// 3.드라군1 -> 드라군2 공격
		attack(d1, d2);
		// 4.다크템플러1 ->질럿1 공격(다크템플러,100,50)
		attack(da1, z1);
		// 5.다크템플러2 -> 드라군1 공격
		attack(da2, d1);

	}
}
