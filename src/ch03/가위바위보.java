package ch03;

import java.util.Scanner;

public class ���������� {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String str[]= {"����","����","��"};
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while (true) {
			
			System.out.print("���� ���� ��!>>");
			String input = sc.nextLine();
			
			int n = (int)(Math.random()*3);
			
			if (input.equals("����") && str[n].equals("����")) {
				System.out.println("����� = "+input+", ��ǻ�� = " + str[n] + ", ����ڰ� �����ϴ�.");
			}else if (input.equals("����") && str[n].equals("��")) {
				System.out.println("����� = "+input+", ��ǻ�� = " + str[n] + ", ����ڰ� �����ϴ�.");
			}else if (input.equals("����") && str[n].equals("��")) {
				System.out.println("����� = "+input+", ��ǻ�� = " + str[n] + ", ����ڰ� �̰���ϴ�.");
			}else if (input.equals("����") && str[n].equals("����")) {
				System.out.println("����� = "+input+", ��ǻ�� = " + str[n] + ", ����ڰ� �̰���ϴ�.");
			}
			
			
			
			
			if(input.equals("�׸�")) break; //���ڿ� �񱳴� equals?
			

			
			
		}
		
		
		
	}
}
