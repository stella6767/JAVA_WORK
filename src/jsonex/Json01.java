package jsonex;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //�������� ��
@AllArgsConstructor
@NoArgsConstructor
class Comment{
	private int id;
	private String content;
	
}


public class Json01 {
	
	public static void main(String[] args) {
		Comment ct1 = new Comment(1,"���1");
		//�ڹ� -> JSON(String) ����� ������ string �̶�� ��������
		Gson gson = new Gson();
		String ct1Json = gson.toJson(ct1);
		System.out.println(ct1Json);
		
		//JSON(String) -> �ڹ�
		Comment ct2 = gson.fromJson(ct1Json, Comment.class);
		System.out.println(ct2.getId()); //getter setter �̿�!
		System.out.println(ct2.getContent());
	}

}
