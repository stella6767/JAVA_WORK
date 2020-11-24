package 시험;

import java.util.Scanner;

public class 홀짝판별 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요:");
		int x = sc.nextInt();
		
		if(x%2 == 0) {
			System.out.println("짝수입니다.");
		}
		
		else {
			System.out.println("홀수입니다.");
		}
		
	}
}
