package ch03;

import java.util.Scanner;

public class ����2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>> ");
		final int money = sc.nextInt();
		int rMoney = money;
		int rCount = 0;
		
		int[] arr = {50000,10000,1000,100,10,1};
		
		for (int i = 0; i < arr.length; i++) {
			rCount = rMoney / arr[i];
			rMoney =rMoney%arr[i];
			if(rCount!=0) {
			System.out.println(arr[i]+"����: " + rCount);
			}
		}
		
		
		
		
	}
}
