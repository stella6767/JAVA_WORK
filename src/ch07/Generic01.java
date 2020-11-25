package ch07;

import lombok.Data;

@Data
class ResponseDto<T>{ //���ĺ� ���� ���������, �빮�ڴ� ���Ѿ���.
	private int statusCode;//200(����),300(�ٽÿ�û��),400(�߸��� ��û)
	//private Object data;
	//private String statusCode;
	private T data; //Ÿ���� new�� ������ �� ����ڰ� �������� ����
}


class Dog{
	String name="�ȳ�";
}


public class Generic01 {
	
	public static void main(String[] args) {
		ResponseDto<Integer> dto = new ResponseDto();
		//ResponseDto<Integer> dto = new ResponseDto<Integer>(); //������ �̷����ε� ��������
		//Ŭ������ Ÿ�Ժ����� �� Ÿ���� integer�� ����. 
		//��, data �������� integer Ÿ�Ը� �� �� �ְ� ����.
		
		
		//dto.setStatusCode("200");
		dto.setStatusCode(200);
		dto.setData(1); //�ڵ����� int-> integer->int   ����ڽ� ��ڽ�
				
		Object b = new Dog();
		Dog dd = (Dog)b;
		
		
		
		System.out.println(dto.getStatusCode());
		//System.out.println(dd.name);
		
		if(dto.getStatusCode() == 200) {
			System.out.println(dto.getData());
		}
	}
}
