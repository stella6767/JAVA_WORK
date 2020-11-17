package login;

interface OAuth { //인터페이스는 따로 함수를 추가해서 오버라이딩해주지 않아도 된다!!
	public abstract String oauthProvider();
	public abstract String oauthId();
	public abstract String oauthPassword();
	public abstract String oauthNick();
	
}
