package ch05;


//1. ����� ���� �޴� �ǹ�(���������� �ؾ���) //�̷��Դ� �� �� ��
//����: �ƹ����� �ڽ��� �ƴϰ�, �ڽ��� �ƹ����� �ƴϹǷ� �̷��Դ� �� �� ��
class Father{
	int money = 10000;
		
}

class Son extends Father{
	int money = 20000;
}

public class Inherit01 {
	
	public static void main(String[] args) {
		Son s =new Son(); //heap�� 2���� �߹Ƿ�, Father�� ����ų ���� �ְ�, Son�� ����ų ���� ����, �� father s ������
		
		//1�� ������ ã�� �� ������ ������ �� ������ ���
		//������ ������ �θ� ã�� �ö�
		System.out.println(s.money);//heap ������ ���� son�� �ؿ� �ְ� father�� ���� ����. �ؿ� ������ ���� Ÿ��ö�
		
		//2�� new�� �ϸ� Father�� Son�� heap�� ���.
		//�����ڴ� Son()�� ȣ���� �ȴ�
		//����Ű�� �޸� �ּҴ� Ÿ���� ���󰣴�.
		Father f = new Son();
		System.out.println(f.money);
	}
}
