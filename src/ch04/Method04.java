package ch04;



public class Method04 {

	
	void abc() {
		//void def() {} �Ұ���!/ �޼���ȿ� �޼��带 ������ �� ����.
	}
	
	
//	int a = int xxx() {   //�޼��忡 ������ ���� �� ����. �ڹٽ�ũ��Ʈ�� ������
//		return 3;
//	}
	
	
	
	
	
	int money = 1000;//heap
	
	int add(int num) { //int num stack, add() heap
	//money = money + num; //���� �����ϰ� ���� ��, heap ������ ����ϴ� �����, 
		
		
		//return�� Ȱ���� ����� �ִ�.
		//���� �������� return�� Ȱ���ϸ� ����(���⼱ heap ����)�� ��ȭ��Ű�� �ʴ´�.
		//�̷��� �����c����� �θ���, �̷� ���α׷��� Ʈ���带 �Լ��� ���α׷����̶�� �Ѵ�.
		int money2 = money + num; 
		return money2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Method04 m = new Method04();
		m.add(50000);
		System.out.println(m.money);
		
	}
}
