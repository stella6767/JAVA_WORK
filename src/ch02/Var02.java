package ch02;

public class Var02 {
	public static void main(String[] args) { // 4byte
		// 4byte
		int num = 10;// 4byte - 32bit - 42��9õ - ���̳ʽ��� �����ϹǷ�(-20�� ~ +20��)
		long num2 = 100;// 8byte �����

		char s = 'A'; // 2byte

		double d = 7.5;// 8byte ǥ���� �� �ִ� ������ ������ int�� ����. �߰� �Ҽ�������

		boolean b = true; // 1bit

		num = (int) d; // 7! �Ҽ��� ǥ���Ұ�(�ٿ� ĳ���� - �ڷ�����)

		// num = num2; �Ұ���! ������Ÿ���� �����ϴ� byte ũ�Ⱑ num2�� �� Ŀ��
		num = (int) num2;// ����� ����ȯ(�ٿ� ĳ����)

		num2 = num; // ������ ����ȯ(�� ĳ����)

	}
}
