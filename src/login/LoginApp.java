package login;

//����ڰ� �α����� �� -> ���̽���,���̹�
public class LoginApp {
	
	static void userInfo(OAuth o) {
		System.out.println(o.oauthProvider() +"�� �α����� ����ڴ�...");
		System.out.println(o.oauthId());
		System.out.println(o.oauthPassword());
		System.out.println(o.oauthNick());
	}
	

	
	public static void main(String[] args) {
		Facebook f = new Facebook(); //�α����ϸ� �ڵ����� �������
		userInfo(f);
		
		Naver n = new Naver();
		userInfo(n);
		
		Kakao k = new Kakao();
		userInfo(k);
	}
}
