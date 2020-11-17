package login;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Kakao implements OAuth{
	private String provider;
	private String id;
	private String pass;
	private String name;
	
	public Kakao() {
		this("Kakao","ssar@nate.com","1234","±úºÀ");
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
		return pass;
	}

	@Override
	public String oauthNick() {
		// TODO Auto-generated method stub
		return name;
	}
	
	

}
