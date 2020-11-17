package login;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
//OAuth -> Open Auth
public class Facebook implements OAuth {
	private String provider;
	private String email;
	private String password;
	private String username;
	
	public Facebook() {
		this("facebook","ssar@nate.com","1234","����");
	}

	@Override
	public String oauthProvider() {
		return provider;
	}

	@Override
	public String oauthId() {
		// TODO Auto-generated method stub
		return email;
	}

	@Override
	public String oauthPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String oauthNick() {
		// TODO Auto-generated method stub
		return username;
	}



	
	
	
}
