package ch09;

public enum SMSCode {
	SUCCESS(200,"성공"),FAIL(400,"실패"), middle(333);
	
	int code;
	String msg;
	
	private SMSCode(int code) {
		this.code = code;
	}
	
	private SMSCode(int code,String msg) {
		this.code = code;
		this.msg = msg;
	}
}
