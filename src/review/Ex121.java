package review;

//�ڹٴ� �Լ��� ������� ����.
//���ϱ� �Լ��� ����� ����.->���ϱ� �Լ� ������� Ŭ������ �ʿ���
//���°� �ʿ�����Ƿ� �������̽��� ����
interface A{
	void add();
}


public class Ex121 {
	
	public static void main(String[] args) {
		
		//�������̽��� �͸�Ŭ����(�Լ� �����Ǿ����)�� ���� �� �ִ�.
		new  A() {			
			@Override
			public void add() {
				System.out.println("���ϱ�");
				
			}
		}.add();
		
		
		
		
		
	}
}
