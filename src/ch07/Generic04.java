package ch07;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class Error {
	private String msg;
}

@AllArgsConstructor
@Data
class User {
	private int id; 
	private String username;
}

@AllArgsConstructor
@Data
class RespDto<T> { //new�� �� Ÿ���� ����
	private int code; // 200(����), 400(����) //int���ٴ� enum
	private T data; //data�� � Ÿ���� ���� �𸣴�, ���׸� T
}

public class Generic04 {
	
	static RespDto<?> getData(String username) { //� Ÿ������ ��ȯ���� �𸣴�, ? =�Լ��� ȣ���� �� ���� Ÿ�� ����,�Լ�����
		if(username.equals("ssar")) {   //?= ���ϵ�ī�带 �Ƚᵵ �ȴ�.                      
			RespDto<User> dto = new RespDto(200, new User(1, "ssar")); //user Ŭ������ ��밡���ϵ��� ��� �ȵǴµ�?
			return dto;
		}else {
			RespDto<Error> dto = new RespDto(400, new Error("���̵� Ʋ�Ƚ��ϴ�."));
			return dto;
		}
	}
	
	public static void main(String[] args) {
		//RespDto<User> dto = getData("ssar"); // <?> ���ϵ�ī�带 �� ���� UserŸ�Ը� ��ȯ����
		RespDto<?> dto = getData("ssar"); //�ƿ� <>���׸��� �����ϸ� ������ ������, �Ǽ��� �� ���ɼ��� ����Ƿ� <>������ ����
		//� Ŭ���� Ÿ������ ������ �𸣴�, 
		
		
		System.out.println(dto.getCode());
		System.out.println(dto.getData());
	}
}










class Generic�߰����� {
	
	List<?> getData(){ //?:����Ÿ���� �̸� ������ �ʰ� �������� �Ҵ�
		//return new ArrayList<>();
		//return new Vector<>();		
		return new ArrayList<String>();		
	}
}
