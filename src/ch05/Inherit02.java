package ch05;

class ������ {
	String name ="������";
}

class �ѱ��� extends ������{
	String name ="�ѱ���";
}

class �λ��� extends �ѱ���{
	String name ="�λ���";
}



public class Inherit02 {

	public static void main(String[] args) {
		//�λ��� b = new �ѱ���(); �λ����� �޸𸮿� �� ��, new �ѱ����̸� �ѱ��κ��� ������ �޸𸮿� ���!
		
		//heap(�ѱ���, ������) -> ������(������)
		������ b = new �ѱ���();
		
		//1.b�� �ѱ���, �������� �޸𸮿� �� ���ֱ� ������ �ٿ�ĳ���� ����
		�ѱ��� h = (�ѱ���)b;
		
		try {
			�λ��� busan = (�λ���)b; //�����Ϸ��� ������ ��Ƴ��� ����, �޸𸮿� �λ����� �� �� �����Ƿ� ��������� ��.
			
		} catch (Exception e) {
			//�����ڰ� �ڵ鸵 �� �� ����.(�α� ����)
			System.out.println("���� �߻��ߴµ� �����ص� ��");
		}
		
		
	}

}
