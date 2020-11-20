package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
//DTO는 Data Transfer Object = 통신에서 많이 사용됨
class UserDto{
	private int id;
	private String name;
}


public class String01 {
	
	public static void main(String[] args) {
		String data = "id:1,name:홍길동";
		
		String[] parse1 = data.split(",");
		for (int i = 0; i < parse1.length; i++) {
			System.out.println(i+"  "+parse1[i]);
		}
		
		System.out.println();
		
		String[] parse2 = parse1[0].split(":");
		String[] parse3 = parse1[1].split(":");
		
		for (int i = 0; i < parse2.length; i++) {
			System.out.println(parse2[i]);
		}
		
		for (int i = 0; i < parse3.length; i++) {
			System.out.println(parse3[i]);
		}
		
		
		
		
		System.out.println();
		
		//파싱 parsing(구문 분석) - 의미있는 데이터 뽑아냄
		UserDto dto = new UserDto();
		dto.setId(1);
		dto.setName("홍길동");
		System.out.println(dto);
	}
}
