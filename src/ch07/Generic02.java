package ch07;

import java.util.ArrayList;
import java.util.List; 

public class Generic02 {
	
	public static void main(String[] args) {
		List<String> list1= new ArrayList<>();
		 //자식의 데이터타입이 바뀔 수 있으므로 부모타입으로 잡는 게 유리
		list1.add("사과");
		list1.add("딸기");
		
//		//배열의 길이는 length, 컬렉션의 길이는 size
//		for (int i = 0; i < list1.size(); i++) {
//			//이런 식으로 코드를 짜면 좋은 코드가 아니다. 한번 찾을 때마다 size()함수를 계속 호출
//		}
//		
		
		int size = list1.size();
		
		for (int i = 0; i < size; i++) {
			System.out.println(list1.get(i));
		}
		
		
		list1.add("바나나");//추가
		System.out.println(list1.get(2));
		
		list1.add(1,"참외");
		System.out.println(list1.get(1));
		
		list1.remove(1);
		System.out.println(list1.get(1));
		
		list1.clear();
		System.out.println(list1.size());
		
		
	}
}
