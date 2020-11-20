package ch07;

import lombok.Data;

@Data
class ResponseDto<T>{ //���ĺ� ���� ���������, �빮�ڴ� ���Ѿ���.
	private int statusCode;//200(����),300(�ٽÿ�û��),400(�߸��� ��û)
	//private Object data;
	private T data;
}


class Dog{
	String name="�ȳ�";
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
