package ch07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Hash02 {
	
	public static void main(String[] args) {
		//랜덤으로 숫자를 지정
		Random r = new Random();
		HashSet<Integer> lotto = new HashSet<>(6);
		//중복된 값이 안 들어감
		
		while(true) {
			int num = r.nextInt(45)+1;//0부터 시작
			System.out.println(num);
			
			lotto.add(num);
			
			if(lotto.size() == 6)
				break;
		}
		
		
		Iterator<Integer> it = lotto.iterator(); //lotto의 모든 데이터가 iterator에 담김
		
		while(it.hasNext()) {//값이 있으면 true, 없으면 flase
			System.out.print(it.next()+" ");//현재 인덱스의 값을 리턴 + 인덱스가 증가
		}
		 
	}
}
