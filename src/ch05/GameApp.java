package ch05;

public class GameApp {
	
	//���̽�ƽ
	static void start(Control c) {
		c.����();
		c.�극��ũ();
	}
	
	
	public static void main(String[] args) {
		Sonata s = new Sonata();
		start(s);
		
		Genesis g = new Genesis();
		start(g);
		
		Ferari f = new Ferari();
		f.����(); //�������̽��� ����� ����, ���߻���� �̿��ؼ�, Ư�� Ŭ������ Ư�� �Լ��� ������ �߰�
		//�θ� Ŭ���� �������̵�ó�� ���� �� �� ���� �ȴ�.
		
		
	}
}
