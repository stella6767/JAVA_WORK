package ch02;

public class Oper01 {
	public static void main(String[] args) {
		System.out.println(1 + 1);
		System.out.println(1 + "1");
		// ���۷��� Ÿ�� string�� int�� ���ϸ� ���۷���Ÿ������ ��ȯ, ������ �ƴ� ������ �ȴ�. 11

		int num = 10;
		String s = "5";

		String sum = num + s; // Ÿ���� String���� ��
		System.out.println(sum);

		System.out.println(10 - 5);
		System.out.println(10 / 3); // Ÿ���� int�� ��
		System.out.println(10.0 / 3); // Ÿ���� double�� ��
		// �ٸ� Ÿ�Գ��� ������ �ϸ� �׻� Ÿ���� ū ������

		System.out.println(10 % 3);// ������ ���ϱ�
		System.out.println(10 * 3);// ���ϱ�

	}
}
