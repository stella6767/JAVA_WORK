package ch07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Hash02 {
	
	public static void main(String[] args) {
		//�������� ���ڸ� ����
		Random r = new Random();
		HashSet<Integer> lotto = new HashSet<>(6);
		//�ߺ��� ���� �� ��
		
		while(true) {
			int num = r.nextInt(45)+1;//0���� ����
			System.out.println(num);
			
			lotto.add(num);
			
			if(lotto.size() == 6)
				break;
		}
		
		
		Iterator<Integer> it = lotto.iterator(); //lotto�� ��� �����Ͱ� iterator�� ���
		
		while(it.hasNext()) {//���� ������ true, ������ flase
			System.out.print(it.next()+" ");//���� �ε����� ���� ���� + �ε����� ����
		}
		 
	}
}
