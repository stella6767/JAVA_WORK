package ch06;

public class Object03 {
	
	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		
		
		int num = 10; // int ���� ���� �ٷ� 
		// ==�� ���� �������� �޸� ������ ������ ��, Ÿ�Կ� ���� �о���̴� ����Ʈ ������ �ٸ�
		//���۷��� ���� ��� �ּ����� ���ϱ� ������, ��Ȯ�� �񱳰� �ȵ�!
		System.out.println(str1 == str2);
		

		String str3 = "�Ӳ���"; //Heap ������ Constant Pool
		String str4 = new String("�Ӳ���");//Heap
		//String str5 = new String("�Ӳ���");		
		//Strig�� Hash�Լ��� �������̵��Ǽ�
		//���� ���ڿ��̸� ���� �ؽ��� �̾Ƴ���.
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(str3==str4);
		
		// == ���� ���� �� ������ true
		// == ���� ���ߴµ� false �� ������ ���������� ���� �� �ι� ��!
		System.out.println(str3.equals(str4));
		
		str2 = "�Ӳ���"; //�ڵ����� �ٸ� �ּ����� ����
		str3 = "�ּ���";
		
		System.out.println(str2 == str1);

	}

}
