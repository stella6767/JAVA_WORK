package ch02;

public class Var02 {
	public static void main(String[] args) { // 4byte
		// 4byte
		int num = 10;// 4byte - 32bit - 42억9천 - 마이너스도 포함하므로(-20억 ~ +20억)
		long num2 = 100;// 8byte 경까지

		char s = 'A'; // 2byte

		double d = 7.5;// 8byte 표현할 수 있는 정수의 범위는 int와 같다. 추가 소수점까지

		boolean b = true; // 1bit

		num = (int) d; // 7! 소수점 표현불가(다운 캐스팅 - 자료유실)

		// num = num2; 불가능! 데이터타입이 차지하는 byte 크기가 num2가 더 커서
		num = (int) num2;// 명시적 형변환(다운 캐스팅)

		num2 = num; // 묵시적 형변환(업 캐스팅)

	}
}
