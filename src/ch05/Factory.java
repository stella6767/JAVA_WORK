package ch05;

public abstract class Factory {
	
	protected abstract void ��ĥ(); //�ϴ°� ������ ������ �� �ٸ���
	protected void ����() { //������ ��� �ڽ��� �Ȱ��� ������ ����
		System.out.println("�����Ϸ�");
	}
	
	public void ����() {
		��ĥ();
		����();
	}
	
}
