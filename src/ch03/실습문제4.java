package ch03;

import java.util.Scanner;

public class �ǽ�����4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 3�� �Է�>> ");
	
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a<b && a>c) {
				System.out.println("�߰� ����: "+a);
			}
		
			if(b<a && b>c) {
				System.out.println("�߰� ����: "+b);
			}
			
			if(c<b && c>a) {
				System.out.println("�߰� ����: "+c);
			}
		
	}
	
}
