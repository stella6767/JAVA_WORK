package ch02;

public class Oper01 {
	public static void main(String[] args) {
		System.out.println(1 + 1);
		System.out.println(1 + "1");
		// 래퍼런스 타입 string과 int를 더하면 래퍼런스타입으로 변환, 연산이 아닌 결합이 된다. 11

		int num = 10;
		String s = "5";

		String sum = num + s; // 타입이 String으로 됨
		System.out.println(sum);

		System.out.println(10 - 5);
		System.out.println(10 / 3); // 타입이 int로 됨
		System.out.println(10.0 / 3); // 타입이 double이 됨
		// 다른 타입끼리 연산을 하면 항상 타입이 큰 쪽으로

		System.out.println(10 % 3);// 나머지 구하기
		System.out.println(10 * 3);// 곱하기

	}
}
