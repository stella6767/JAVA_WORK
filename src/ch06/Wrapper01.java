package ch06;

public class Wrapper01 {
	
	public static void main(String[] args) {
		int num = 10;
		Integer num2 = 20; //�Լ��� ���� ���ؼ� Ŭ����������?
		
		String num3 = num2.toString();//���ڸ� ���ڷ� �ٲٴ� ��
		System.out.println(num3);		
		String num4 = num +""; // ���ڿ� "" ���ϸ� ���ڷ� ��ȯ
		System.out.println(num4+10);
		
		
		String num5 = "10"; //���ڸ� ���ڷ� �ٲٴ� ��
		//int num6 = (int)num5; //��ü(���۷�����)�� �⺻�ڷ��� ���� ����ȯ�� �ȵȴ�.
		int num6 = Integer.parseInt(num5);
		System.out.println(num6);
		
		
		
	}
}
