package ch03;

import java.util.Scanner;

public class ���� {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>> ");
		final int money = sc.nextInt();
		int rmoney = money;
		
		
		if(rmoney>=50000) {
			int five = rmoney/50000;
			rmoney = rmoney%50000;
			System.out.println("��������: " + five);
		}
		if(rmoney>=10000) {
			int man = rmoney/10000;
			rmoney = rmoney%10000;
			System.out.println("������: " + man);
		}
		if(rmoney>=1000) {
			int cheon = rmoney/1000;
			rmoney = rmoney%1000;
			System.out.println("õ����: " + cheon);
		}
		if(rmoney>=100) {
			int bak = rmoney/100;
			rmoney = rmoney%100;
			System.out.println("���: " + bak);
		}
		if(rmoney>=50) {
			int osh = rmoney/50;
			rmoney = rmoney%50;
			System.out.println("���ʿ�: " + osh);
		}
		if(rmoney>=10) {
			int shib = rmoney/10;
			rmoney = rmoney%10;
			System.out.println("�ʿ�: " + shib);
		}
		if(rmoney>=1) {
			int one = rmoney/1;
			rmoney = rmoney%1;
			System.out.println("�Ͽ�: " + one);
		}
		
		
	}
}
