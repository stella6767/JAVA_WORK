package jsonex;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //만들어줘야 함
@AllArgsConstructor
@NoArgsConstructor
class Comment{
	private int id;
	private String content;
	
}


public class Json01 {
	
	public static void main(String[] args) {
		Comment ct1 = new Comment(1,"댓글1");
		//자바 -> JSON(String) 통신은 무조건 string 이라고 생각하자
		Gson gson = new Gson();
		String ct1Json = gson.toJson(ct1);
		System.out.println(ct1Json);
		
		//JSON(String) -> 자바
		Comment ct2 = gson.fromJson(ct1Json, Comment.class);
		System.out.println(ct2.getId()); //getter setter 이용!
		System.out.println(ct2.getContent());
	}

}
