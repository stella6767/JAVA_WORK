package ch04;

class Cal {// ����

	static void add(int n1, int n2) {// ���� �Ű������� stack���� �̸�: add stack-��������
		System.out.println(n1 + n2);
	}

	static int minus(int n3, int n4) {
		return n3 - n4;

	}

	practice a = new practice();
	// a.xxx();

}

public class Method03 {
	public static void main(String[] args) {
		practice a = new practice();
		a.xxx();

		practice2 b = new practice2();
		b.yyy();

		Cal.add(5, 6);

		// minus�Լ��� returnŸ���� int�̱� ������
		// cal.minus(10,4)�� ȣ��� �� �޼��尡 ����Ǹ�
		// Cal.minus(10,4) --> 6���� ����ȴ�.
		int result = Cal.minus(10, 4);
		System.out.println(result);

		// System.out.println(Cal.minus(4, 10));

	}
}
