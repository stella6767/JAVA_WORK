package ch07;

import java.util.ArrayList;
import java.util.List; 

public class Generic02 {
	
	public static void main(String[] args) {
		List<String> list1= new ArrayList<>();
		 //�ڽ��� ������Ÿ���� �ٲ� �� �����Ƿ� �θ�Ÿ������ ��� �� ����
		list1.add("���");
		list1.add("����");
		
//		//�迭�� ���̴� length, �÷����� ���̴� size
//		for (int i = 0; i < list1.size(); i++) {
//			//�̷� ������ �ڵ带 ¥�� ���� �ڵ尡 �ƴϴ�. �ѹ� ã�� ������ size()�Լ��� ��� ȣ��
//		}
//		
		
		int size = list1.size();
		
		for (int i = 0; i < size; i++) {
			System.out.println(list1.get(i));
		}
		
		
		list1.add("�ٳ���");//�߰�
		System.out.println(list1.get(2));
		
		list1.add(1,"����");
		System.out.println(list1.get(1));
		
		list1.remove(1);
		System.out.println(list1.get(1));
		
		list1.clear();
		System.out.println(list1.size());
		
		
	}
}
