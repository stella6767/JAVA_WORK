package ch13;

class Another implements Runnable{ //Runnable Ÿ���� �Ǿ�� �� run() ������ ���߻�Ӌ����� �� ����� ��õ
	//������� �ڵ��=stack(������) //��� implements�� �ʵ带 �� ����.
	@Override
	public void run() { //Ÿ��
		System.out.println("���ο� ������ �����");
		for (int i = 1; i < 11; i++) {
			try {
				System.out.println("run:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("���ο� ������ ����");
	}
	
}


class Another2 extends Thread{
	
	
	
}


//�����带 ���� ����Ŭ������ ��κ� �����. 


public class Thread01 {
	
	public static void main(String[] args) {
		System.out.println("main ������ �����");
		
		//���ο� ������ ���� 1.������ ��ü ���� 2.Ÿ�� ���� 3.����
		Thread t1 =new Thread(new Another(),"������ �̸�����"); //���� �� ���� ������ ������ UX ������ �� ���� ���� �� ����,
		t1.start(); //�������� ������ ����
		System.out.println(t1.getName());
		
		Thread t2 =new Thread(new Runnable() {//�� �� ���� �����Ÿ� �͸�Ŭ������			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		for (int i = 1; i < 11; i++) {
			try {
				System.out.println("main:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("main ������ ����");
	}//end of main()
}
