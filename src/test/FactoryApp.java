package test;

import ch05.BlueCloth;
import ch05.Factory;

//protected�� ���� ��Ű��+�ڽĸ� ���
public class FactoryApp {
	
	public static void main(String[] args) {
		Factory f1 =new BlueCloth();
		
		//��ĥ ���Ŀ� ���� ������ �ݵ�� ������� �ؾ��ϴ� ���μ����� �ִٰ�ġ��.
		//�̷��� �ۼ��� ��� �Ǽ��� ������ �ʹ� ũ�Ƿ�, protected�� �ٿ��� �ٸ� ��Ű������ ���� ��ĥ,���� �Լ��� ���ٺҰ� �����ϰ�
		//factory �߻�Ŭ������ public �����̶�� �Լ��� �ϳ� ���� ���뿡 ���������� ��������ָ�, ���� �Ǽ��� ������ ����.
//		f1.��ĥ();//�������ε�
//		f1.����();
		
		f1.����();
	}
}
