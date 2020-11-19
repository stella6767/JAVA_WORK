package ch03;

public class Star01 {

	static void starPrint1() {

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void starPrint2() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}	
			System.out.println();
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 2; j > i; j--) {
				System.out.print("*");
			}	
			System.out.println();
		}		
		
	}
	
	
	
	static void starPrint3() {

		for (int i = 0; i < 2; i++) {
			for (int j = 2; j > i+1; j=j-2) {
				System.out.print(" ");
			}	    
				
			
			for (int s = 0; s<=i*2 ; s++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		for (int i = 0; i < 1; i++) {
			for (int j = 2; j > i+1; j=j-2) {
				System.out.print(" ");
			}	    
				
			
			for (int s = 0; s<=i*2 ; s++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	
	}
	
	
	

	public static void main(String[] args) {

		starPrint1();
		
		System.out.println();
		
		starPrint2();
		
		System.out.println();
		
		starPrint3();

	}
}
