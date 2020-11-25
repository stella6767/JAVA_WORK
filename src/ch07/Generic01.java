package ch07;

import lombok.Data;

@Data
class ResponseDto<T>{ //알파벳 뭐든 상관없지만, 대문자는 지켜야함.
	private int statusCode;//200(성공),300(다시요청해),400(잘못된 요청)
	//private Object data;
	//private String statusCode;
	private T data; //타입은 new로 생성할 때 사용자가 동적으로 결정
}


class Dog{
	String name="안녕";
}


public class Generic01 {
	
	public static void main(String[] args) {
		ResponseDto<Integer> dto = new ResponseDto();
		//ResponseDto<Integer> dto = new ResponseDto<Integer>(); //원래는 이렇게인데 생략가능
		//클래스의 타입변수에 들어갈 타입은 integer로 제한. 
		//즉, data 변수에는 integer 타입만 들어갈 수 있게 만듬.
		
		
		//dto.setStatusCode("200");
		dto.setStatusCode(200);
		dto.setData(1); //자동으로 int-> integer->int   오토박싱 언박싱
				
		Object b = new Dog();
		Dog dd = (Dog)b;
		
		
		
		System.out.println(dto.getStatusCode());
		//System.out.println(dd.name);
		
		if(dto.getStatusCode() == 200) {
			System.out.println(dto.getData());
		}
	}
}
