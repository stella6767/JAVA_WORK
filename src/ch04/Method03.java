package ch04;

class Cal {// 계산기

	static void add(int n1, int n2) {// 안의 매개변수는 stack영역 이름: add stack-지역변수
		System.out.println(n1 + n2);
	}

	static int minus(int n3, int n4) {
		return n3 - n4;

	}

	practice a = new practice();
	// a.xxx();

}

public class Method03 {
	public static void main(String[] args) {
		practice a = new practice();
		a.xxx();

		practice2 b = new practice2();
		b.yyy();

		Cal.add(5, 6);

		// minus함수는 return타입이 int이기 때문에
		// cal.minus(10,4)가 호출된 후 메서드가 종료되면
		// Cal.minus(10,4) --> 6으로 변경된다.
		int result = Cal.minus(10, 4);
		System.out.println(result);

		// System.out.println(Cal.minus(4, 10));

	}
}
