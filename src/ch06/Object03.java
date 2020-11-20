package ch06;

public class Object03 {
	
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";
		
		
		int num = 10; // int 같은 경우는 바로 
		// ==은 최초 엑세스한 메모리 공간의 내용을 비교, 타입에 따라 읽어들이는 바이트 단위가 다름
		//래퍼런스 같은 경우 주소지를 비교하기 때문에, 정확한 비교가 안됨!
		System.out.println(str1 == str2);
		

		String str3 = "임꺽정"; //Heap 내부의 Constant Pool
		String str4 = new String("임꺽정");//Heap
		//String str5 = new String("임꺽정");		
		//Strig의 Hash함수는 오버라이딩되서
		//같은 문자열이면 같은 해쉬를 뽑아낸다.
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(str3==str4);
		
		// == 으로 먼저 비교 같으면 true
		// == 으로 비교했는데 false 가 나오면 최종목적지 값을 비교 두번 비교!
		System.out.println(str3.equals(str4));
		
		str2 = "임꺽정"; //자동으로 다른 주소지에 배정
		str3 = "최성군";
		
		System.out.println(str2 == str1);

	}

}
