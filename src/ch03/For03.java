package ch03;

public class For03 {
	
	static void starPrint() {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		starPrint();
		
		
	}
}
