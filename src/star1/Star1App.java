package star1;

//�����ε��� �Լ��� �̸��� ���Ƶ� �Ű������� Ÿ���̳�, ��ġ, ������ �ٸ���
//�� �Լ��� �ν��Ѵ�.(������) - ����� ���� ���ѵǾ����� ��
//����: �Լ��� �̸� ���� 
public class Star1App {

	// ���� -> ���
	static void attack(Zealot u1, Dragoon u2) {
		System.out.println(u1.name + " -> " + u2.name + " ����");
		u2.hp = u2.hp - u1.attack;// 90
		System.out.println(u2.name + " ü��: " + u2.hp);

	}

	static void attack(Dragoon u1, Zealot u2) {
		System.out.println(u1.name + " -> " + u2.name + " ����");
		u2.hp = u2.hp - u1.attack;// 90
		System.out.println(u2.name + " ü��: " + u2.hp);

	}

	static void attack(Dragoon u1, Dragoon u2) {
		System.out.println(u1.name + " -> " + u2.name + " ����");
		u2.hp = u2.hp - u1.attack;// 90
		System.out.println(u2.name + " ü��: " + u2.hp);

	}

	static void attack(DarkTemplot u1, Zealot u2) {
		System.out.println(u1.name + " -> " + u2.name + " ����");
		u2.hp = u2.hp - u1.attack;// 90
		System.out.println(u2.name + " ü��: " + u2.hp);

	}

	static void attack(DarkTemplot u1, Dragoon u2) {
		System.out.println(u1.name + " -> " + u2.name + " ����");
		u2.hp = u2.hp - u1.attack;// 90
		System.out.println(u2.name + " ü��: " + u2.hp);

	}

	public static void main(String[] args) {
		Zealot z1 = new Zealot("����1", 100, 10); // z1,d1 ��ü�� stack(��������)�̴�.
		Dragoon d1 = new Dragoon("���1", 100, 20);// heap ������
		// new�� �� string name = ����1, hp =100 ,attack = 10 ��
		Dragoon d2 = new Dragoon("���2", 100, 20);
		DarkTemplot da1 = new DarkTemplot("��ũ���÷�1", 100, 50);
		DarkTemplot da2 = new DarkTemplot("��ũ���÷�2", 100, 50);

		// 1. ����1 -> ���1 ����
		attack(z1, d1);
		// 2. ���1 -> ����1 ����
		attack(d1, z1);
		// 3.���1 -> ���2 ����
		attack(d1, d2);
		// 4.��ũ���÷�1 ->����1 ����(��ũ���÷�,100,50)
		attack(da1, z1);
		// 5.��ũ���÷�2 -> ���1 ����
		attack(da2, d1);

	}
}
