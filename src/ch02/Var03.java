package ch02;

public class Var03 {
	public static void main(String[] args) { // 4byte
		String str="안녕하세요"; //String은 기본 자료형이 아닌 class
		//문자열이 어디까지 이어질지 모르기 때문에 데이터타입의 크기가 지정되어있지 않다.
		//따라서 주소로 저장하고 이런 타입을 래퍼런스 타입이라고 한다.
		//크기가 정해져있는 타입은 원시 자료형(primative type)
		//해퍼런스 타입은 참조를 두 번 한다 (주소가 저장되있는데 그 주소로 한번 더 찾는다).
		
		System.out.println(str);

	}
}
