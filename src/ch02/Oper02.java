package ch02;

import ch04.practice;

public class Oper02 {
	public static void main(String[] args) {
		int num = 10;
		num++;// 시퀀스 = 2이상 증가 못시킴 = 1만 되는 걸 시퀀스라 한다.
		System.out.println(num);

		// num ++ 은 아래와 같다.
		num = num + 1;
		System.out.println(num);

		practice a = new practice();
		a.xxx();
		
		//practice2 m = new practice2();
	}
}
