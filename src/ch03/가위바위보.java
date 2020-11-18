package ch03;

import java.util.Scanner;

public class 가위바위보 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String str[]= {"가위","바위","보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while (true) {
			
			System.out.print("가위 바위 보!>>");
			String input = sc.nextLine();
			
			int n = (int)(Math.random()*3);
			
			if (input.equals("가위") && str[n].equals("바위")) {
				System.out.println("사용자 = "+input+", 컴퓨터 = " + str[n] + ", 사용자가 졌습니다.");
			}else if (input.equals("바위") && str[n].equals("보")) {
				System.out.println("사용자 = "+input+", 컴퓨터 = " + str[n] + ", 사용자가 졌습니다.");
			}else if (input.equals("가위") && str[n].equals("보")) {
				System.out.println("사용자 = "+input+", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
			}else if (input.equals("바위") && str[n].equals("가위")) {
				System.out.println("사용자 = "+input+", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
			}
			
			
			
			
			if(input.equals("그만")) break; //문자열 비교는 equals?
			

			
			
		}
		
		
		
	}
}
