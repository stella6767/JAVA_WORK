package ch02;

public class Var04 {
	public static void main(String[] args) { // 4byte
		//숫자 여러개 1,2,3 군데 군데 저장
		int n1 =1;
		int n2 =2;
		int n3 =3;
		
		//숫자 여러개 1,2,3 //0번지부터
		int[] n = {1,2,3}; //배열은 첫번째 주소지부터 연속적으로 저장. 첫번재 주소지만 알면 배열 안의 모든 데이터
		//를 알아낼 수 있다. 넣을 때는 번거롭지만 뺄 때(검색) 엄청 쉽다.
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n);
		
		//문자 여러개 가,나,다
		char[] m = {'가','나','다'};
		System.out.println(m[0]);
		System.out.println(m[1]);
		System.out.println(m[2]);
		System.out.println(m);		
			
	}
}
