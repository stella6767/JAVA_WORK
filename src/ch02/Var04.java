package ch02;

public class Var04 {
	public static void main(String[] args) { // 4byte
		//���� ������ 1,2,3 ���� ���� ����
		int n1 =1;
		int n2 =2;
		int n3 =3;
		
		//���� ������ 1,2,3 //0��������
		int[] n = {1,2,3}; //�迭�� ù��° �ּ������� ���������� ����. ù���� �ּ����� �˸� �迭 ���� ��� ������
		//�� �˾Ƴ� �� �ִ�. ���� ���� ���ŷ����� �� ��(�˻�) ��û ����.
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n);
		
		//���� ������ ��,��,��
		char[] m = {'��','��','��'};
		System.out.println(m[0]);
		System.out.println(m[1]);
		System.out.println(m[2]);
		System.out.println(m);		
			
	}
}
