package ch02;

//heap
class Zealot{
	String name = "zealot";
	
	//static�� �ѹ��ۿ� �� ����
	//static int attack = 10;//static ���� ÷���� �޸𸮿� �÷����ִ�.
	int attack =10;
	int armor = 5;

	static int hp = 15;
	
}

//static���� �������� ����� ���� ���� ���� �ϳ��� �ǰ� ���̸� �ٸ� �����鵵 �Ȱ��� �ǰ� ���δ�.

public class Var08 {
	public static void main(String[] args) { 
		//
		//Ŀ���� �ڷ���
		Zealot z = new Zealot();//new�� �� �޸𸮿� �����͵��� �÷����� �� �ִ�.
		System.out.println(z.name);
		System.out.println(z.armor);
		//System.out.println(Zealot.attack);
		System.out.println(z.attack);
		
		Zealot z2 = new Zealot();//20�� ���ο��� �Ȱ��� ���� ������
		System.out.println(z2.name);
		System.out.println(z2.armor);
		System.out.println(z2.attack);
		
		z.attack=50;
		
		System.out.println("��ȭ ����");
		System.out.println(z.attack);
		System.out.println(z2.attack);
		
		z.hp =50;
		z2.hp = 10; //�ϳ��� ������ ���� �ٲ�, ���� �޸𸮰� ������ ����� �� �ƴ϶�..
		
		System.out.println("static ��ȭ ����");
		System.out.println(z.hp);
		System.out.println(z2.hp);
		
		//����
		z.attack =11;
		
		System.out.println(z.attack);
		System.out.println(z2.attack);
		
	}
}
