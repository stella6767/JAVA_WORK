package star1;

import lombok.SneakyThrows;

//1.Zealot, Drgoon, Tank, Scv, DarkTempler => StarUnit Ÿ�� ��ġ



public class Star3App {
	
	public static void attack(StarUnit u1, StarUnit u2) {
		System.out.println(u1.getName() + " -> " + u2.getName() + " ����");
		u2.setHp(u2.getHp() - u1.getAttack());
		System.out.println(u2.getName() + " ü��: " + u2.getHp());

	}
	
	public static void grandchild(StarUnit u1) {
		System.out.println(u1.getName2());

	}
	
	public static void main(String[] args) {
		
		Zealot z1 = new Zealot("����1", 100, 10); //zealot starunit heap�� �߰� zealot�� ����Ŵ
		Dragoon d1 = new Dragoon("���1", 100, 20);
		Dragoon d2 = new Dragoon("���2", 100, 20);
		DarkTempler da1 = new DarkTempler("��ũ���÷�1", 100, 50);
		DarkTempler da2 = new DarkTempler("��ũ���÷�2", 100, 50);
		
		StarUnit n = new Grandchild(); //ss,zealot,starunit heap ������ Ss
		grandchild(n); //���ٸ��̵� �� �Լ��� ���� ������ ������ ��, �������̵� �� �Լ��� ������ �̻��� ��, 
		//�� �� � �ڽİ����� �Լ��� Ư���ϰ� ���� ��, new�� ���ؼ� heap�� �� �ִ� �޸𸮸� �����ϴ� �����
		//�ƿ� �Լ����� ���� ���� �����ϴ� ����� �ִ�. ���� ���������� Ÿ�Կ��� �������̵� �� �� �ְ�, 
		//�����ϰ� ���� Ư�������� �Լ�, �������� Ÿ�� Ŭ������ �Լ��� �� �� ������ �Ѵ�.
		
		
		
		attack(z1,d1);
		attack(d1, z1);
		// 3.���1 -> ���2 ����
		attack(d1, d2);
		// 4.��ũ���÷�1 ->����1 ����(��ũ���÷�,100,50)
		attack(da1, z1);
		// 5.��ũ���÷�2 -> ���1 ����
		attack(da2, d1);
		
	
		
	}
}
