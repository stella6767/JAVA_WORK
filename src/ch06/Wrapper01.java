package ch06;

public class Wrapper01 {
	
	public static void main(String[] args) {
		int num = 10;
		Integer num2 = 20; //함수를 쓰기 위해서 클래스형으로?
		
		String num3 = num2.toString();//숫자를 문자로 바꾸는 법
		System.out.println(num3);		
		String num4 = num +""; // 숫자에 "" 더하면 문자로 변환
		System.out.println(num4+10);
		
		
		String num5 = "10"; //문자를 숫자로 바꾸는 법
		//int num6 = (int)num5; //객체(래퍼런스형)와 기본자료형 간의 형변환이 안된다.
		int num6 = Integer.parseInt(num5);
		System.out.println(num6);
		
		
		
	}
}
