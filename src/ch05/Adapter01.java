package ch05;

interface Nife{
	void �丮();
	//default void ����() {}; //default�� �ص� �Ǵµ�, �������� �����Ƿ� �Ǽ��� ������ ŭ!
	
}

//����� �뵵
abstract class �丮��Adapter implements Nife{//������ �߻�޼ҵ�� �������ص� �ȴ�.
	public void ����() { //�������̽��� �ɷ�����.
		
	}	
}


//���������
class ������ extends �丮��Adapter{

	@Override
	public void �丮() {
		// TODO Auto-generated method stub
		
	}

	
}

public class Adapter01 {
	public static void main(String[] args) {
		
	}

}
