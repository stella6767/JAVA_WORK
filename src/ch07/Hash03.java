package ch07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Hash03 {
	
	public static void main(String[] args) {
		//랜덤으로 숫자를 지정
		Random r = new Random();
		ArrayList<Integer> lotto = new ArrayList<>();
		//중복된 값이 안 들어감
		
		//실습: 이전번지에 같은 값이 있으면 중복된 데이터 넣지 않기
		while(true) {
			boolean isSame =false;
			int num = r.nextInt(45)+1;//0부터 시작
			System.out.println(num);
			
//			//같은 값이 없을때만 add하기 방법1
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
		
		
		Iterator<Integer> it = lotto.iterator(); //lotto의 모든 데이터가 iterator에 담김
		
		while(it.hasNext()) {//값이 있으면 true, 없으면 flase
			System.out.print(it.next()+" ");//현재 인덱스의 값을 리턴 + 인덱스가 증가
		}
		 
	}
}
