package ch06;



public class Object02{
	
	static void test(Object num) {
		int money = 10000;
		int sum = money + (int)num;
		
	}
	
	
	public static void main(String[] args) {
		//Object num = 10;
		//test(num);
		String str = "È«±æµ¿";
		System.out.println(str.hashCode());
		
		String str2 = "È«±æµ¿";
		System.out.println(str.hashCode());
		
		str = "ÀÓ²©Á¤";
		System.out.println(str.hashCode());
	}
}
