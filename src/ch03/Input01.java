package ch03;

import java.util.Scanner;

public class Input01 {
	
	public static void main(String[] args) {//동기적 프로그래밍
		//Scanner을 이용하면 i/O 장치에 접근 가능!!
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt(); //블락킹
		
		System.out.println("입력받은 값: " + num);
	}
}
