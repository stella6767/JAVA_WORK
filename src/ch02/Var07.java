package ch02;


class Car { //class �ڷ���
	static int power = 2000; 
	static String color = "�Ͼ�";
	static String name = "�ҳ�Ÿ";
	static String type = "�¿���";
	
}


//int,long,double,char,boolean,[]�迭,String
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
