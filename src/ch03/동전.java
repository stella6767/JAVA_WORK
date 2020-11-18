package ch03;

import java.util.Scanner;

public class 동전 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오>> ");
		final int money = sc.nextInt();
		int rmoney = money;
		
		
		if(rmoney>=50000) {
			int five = rmoney/50000;
			rmoney = rmoney%50000;
			System.out.println("오만원권: " + five);
		}
		if(rmoney>=10000) {
			int man = rmoney/10000;
			rmoney = rmoney%10000;
			System.out.println("만원권: " + man);
		}
		if(rmoney>=1000) {
			int cheon = rmoney/1000;
			rmoney = rmoney%1000;
			System.out.println("천원권: " + cheon);
		}
		if(rmoney>=100) {
			int bak = rmoney/100;
			rmoney = rmoney%100;
			System.out.println("백원: " + bak);
		}
		if(rmoney>=50) {
			int osh = rmoney/50;
			rmoney = rmoney%50;
			System.out.println("오십원: " + osh);
		}
		if(rmoney>=10) {
			int shib = rmoney/10;
			rmoney = rmoney%10;
			System.out.println("십원: " + shib);
		}
		if(rmoney>=1) {
			int one = rmoney/1;
			rmoney = rmoney%1;
			System.out.println("일원: " + one);
		}
		
		
	}
}
