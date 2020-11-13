package ch02;


class Car { //class 자료형
	static int power = 2000; 
	static String color = "하양";
	static String name = "소나타";
	static String type = "승용차";
	
}


//int,long,double,char,boolean,[]배열,String
public class Var07 {
	static int power = 2000;
	public static void main(String[] args) { 
		System.out.println(Car.power);
		System.out.println(Car.color);
		System.out.println(Car.name);
		System.out.println(Car.type);
		
		System.out.println(Zealot.hp);
	}
}
