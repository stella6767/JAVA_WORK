package ch03;

public class If01 {
	
	public static void main(String[] args) {
		
		//표현식
		//그 라인에 걸리면 stack이 바로 실행(호출할 필요없음)
		if (true) {
			System.out.println("트루입니다.");
		}
		
		
		if (false) {
			System.out.println("dd");
		}
		
		int num = 0;
		if(num>1) {
			System.out.println("num은 1보다 큽니다");
		}else { //그게 아니라면!!
			System.out.println("num은 1보다 작습니다.");
		}
		
		int sum= 20;
		
		if (sum == 10) {
			System.out.println("sum은 10입니다.");
		}else if(sum==20) {
			System.out.println("sum은 20입니다.");
		}else {
			System.out.println("sum은 30입니다.");
		}
		
	}
	
}
