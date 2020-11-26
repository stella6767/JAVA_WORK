package ch13;

public class Thread03 {
	
	static int sum = 0;
	
	static class NewThread implements Runnable{ //���� Ŭ������ static���� ����� ��찡 ����
		@Override
		public void run() {
			System.out.println("���ο� ������ ����");
			for (int i = 1; i < 11; i++) {
				sum=sum+10;
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					return;
				}
			}
			System.out.println("���ο� ������ ��");
		}
	}
	
	
	
	//���ο� �����忡�� ������ ���� ���� �����忡�� �޾Ƽ� �����ϰ� ���� ��
	//�ΰ��� ��� �ݹ�(�񵿱���) or join(������)
	public static void main(String[] args) {
		System.out.println("���� ������ ����");
		Thread t1 = new Thread(new NewThread());
		//Thread t1 = new Thread(new NewThread().new NewThread());//���� Ŭ���� static�� �ƴҋ�
		
		t1.start();
		
//		try {
//			Thread.sleep(3000); //�� �����尡 ���� ������ ���� ���ϴ� ��Ȳ�� ���� �־��� �ڵ�
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		try {
			t1.join(); //t1�� ���������� ���
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(sum);
		
		System.out.println("���� ������ ����");
	}
}
