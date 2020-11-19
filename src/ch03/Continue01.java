package ch03;

import java.util.Scanner;

public class Continue01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 5개 입력하세요.");
		
		int sum=0;
		
		for (int i = 0; i < 5; i++) {
			int n=sc.nextInt();
			
			if(n<=0) { //음수이거나 0이면
				//continue; //즉시 다음 반복문으로 넘어가는 명령어
				break;
			}else {
				sum=sum+n;
			}//end of for
		}
		System.out.println("양수의 합: "+sum);
		sc.close(); //강제로 가비지 컬렉션 시킨다.
		//지금 딱히 필요는 없지만 나중에 복잡한 로직 짜면 필요.
		
	}
}
