package ch07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Hash03 {
	
	public static void main(String[] args) {
		//�������� ���ڸ� ����
		Random r = new Random();
		ArrayList<Integer> lotto = new ArrayList<>();
		//�ߺ��� ���� �� ��
		
		//�ǽ�: ���������� ���� ���� ������ �ߺ��� ������ ���� �ʱ�
		while(true) {
			boolean isSame =false;
			int num = r.nextInt(45)+1;//0���� ����
			System.out.println(num);
			
//			//���� ���� �������� add�ϱ� ���1
//			if (!lotto.contains(num)) {
//				lotto.add(num);	
//			}
			
			for (int i = 0; i < lotto.size(); i++) {
				if (lotto.get(i)==num) {
					isSame = true;
				}
			}
			
			if(isSame == false) {
				lotto.add(num);
			}
			
			
					
			if(lotto.size() == 6)
				break;
		}
		
		
//		for (int i = 0; i < lotto.size(); i++) {
//			int check = 1;
//			if(lotto.get(i)==lotto.get(check)) {
//				lotto.remove(check);
//			}
//			check++;
//		}
		
		
		Iterator<Integer> it = lotto.iterator(); //lotto�� ��� �����Ͱ� iterator�� ���
		
		while(it.hasNext()) {//���� ������ true, ������ flase
			System.out.print(it.next()+" ");//���� �ε����� ���� ���� + �ε����� ����
		}
		 
	}
}
