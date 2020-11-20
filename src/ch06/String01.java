package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
//DTO�� Data Transfer Object = ��ſ��� ���� ����
class UserDto{
	private int id;
	private String name;
}


public class String01 {
	
	public static void main(String[] args) {
		String data = "id:1,name:ȫ�浿";
		
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
		
		//�Ľ� parsing(���� �м�) - �ǹ��ִ� ������ �̾Ƴ�
		UserDto dto = new UserDto();
		dto.setId(1);
		dto.setName("ȫ�浿");
		System.out.println(dto);
	}
}
