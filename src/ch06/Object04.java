package ch06;

class User2{
	private int id;
	private String username;
	private String password;
	
//	@Override
//	public String toString() {
//		return "안녕";
//	}
	
	public User2() {
		
	}

	@Override
	public String toString() { //오버라이딩해서 내 객체의 필드값들을 예쁘게 보여주는 용도
		return "User2 [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

	public User2(int id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}
		
}

public class Object04 {
	
	public static void main(String[] args) {
		User2 user = new User2(1,"ssar","1234");
		System.out.println(user); //자바에서 래퍼런스를 출력하면 object가 들고있는 tostring을 자동으로 출력
		
		String s = "안녕";
		System.out.println(s.toString());
	}
}
