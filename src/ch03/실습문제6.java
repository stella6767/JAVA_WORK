package ch03;

import java.util.Scanner;

public class 실습문제6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~99 사이의 정수를 입력하시오>> ");
		int num = sc.nextInt();
		
		int f = num/10;
		int s = num%10;
		
		if (f%3==0 && s%3 == 0) {
			System.out.println("박수짝짝");
		}
		
		
		else if (f%3==0 || s%3 == 0) {
			System.out.println("박수짝");
		}
		
		
		
	}
	
}
