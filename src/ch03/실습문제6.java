package ch03;

import java.util.Scanner;

public class �ǽ�����6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>> ");
		int num = sc.nextInt();
		
		int f = num/10;
		int s = num%10;
		
		if (f%3==0 && s%3 == 0) {
			System.out.println("�ڼ�¦¦");
		}
		
		
		else if (f%3==0 || s%3 == 0) {
			System.out.println("�ڼ�¦");
		}
		
		
		
	}
	
}
