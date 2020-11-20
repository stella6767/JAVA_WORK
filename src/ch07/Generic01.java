package ch07;

import lombok.Data;

@Data
class ResponseDto<T>{ //알파벳 뭐든 상관없지만, 대문자는 지켜야함.
	private int statusCode;//200(성공),300(다시요청해),400(잘못된 요청)
	//private Object data;
	private T data;
}


class Dog{
	String name="안녕";
}


public class Generic01 {
	
	public static void main(String[] args) {
		ResponseDto<Integer> dto = new ResponseDto();
		dto.setStatusCode(200);
		dto.setData(1);
				
		Object b = new Dog();
		Dog dd = (Dog)b;
		
		
		
		System.out.println(dto.getStatusCode());
		//System.out.println(dd.name);
		
		if(dto.getStatusCode() == 200) {
			System.out.println(dto.getData());
		}
	}
}
