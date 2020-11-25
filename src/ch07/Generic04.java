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
class RespDto<T> { //new할 때 타입을 결정
	private int code; // 200(정상), 400(실패) //int보다는 enum
	private T data; //data에 어떤 타입이 올지 모르니, 제네릭 T
}

public class Generic04 {
	
	static RespDto<?> getData(String username) { //어떤 타입으로 반환될지 모르니, ? =함수를 호출할 때 리턴 타입 결정,함수에만
		if(username.equals("ssar")) {   //?= 와일드카드를 안써도 된다.                      
			RespDto<User> dto = new RespDto(200, new User(1, "ssar")); //user 클래스만 사용가능하도록 명시 안되는데?
			return dto;
		}else {
			RespDto<Error> dto = new RespDto(400, new Error("아이디가 틀렸습니다."));
			return dto;
		}
	}
	
	public static void main(String[] args) {
		//RespDto<User> dto = getData("ssar"); // <?> 와일드카드를 안 쓰면 User타입만 반환가능
		RespDto<?> dto = getData("ssar"); //아예 <>지네릭을 생략하면 오류는 없지만, 실수를 할 가능성이 생기므로 <>선언이 좋음
		//어떤 클래스 타입으로 변할지 모르니, 
		
		
		System.out.println(dto.getCode());
		System.out.println(dto.getData());
	}
}










class Generic추가설명 {
	
	List<?> getData(){ //?:리턴타입을 미리 정하지 않고 동적으로 할당
		//return new ArrayList<>();
		//return new Vector<>();		
		return new ArrayList<String>();		
	}
}
