package login;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
//OAuth -> Open Auth
public class Naver implements OAuth{
	private String provider;
	private String id; //º¯¼ö´Â Ä¿¸á Ç¥±â¹ý
	private String password;
	private String nickName;
	
	public Naver() {
		this("Naver","ssar@nate.com","1234","±úºÀ");
	}

	@Override
	public String oauthProvider() {
		// TODO Auto-generated method stub
		return provider;
	}

	@Override
	public String oauthId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String oauthPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String oauthNick() {
		// TODO Auto-generated method stub
		return nickName;
	}



	
	
}
