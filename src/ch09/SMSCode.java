package ch09;

public enum SMSCode {
	SUCCESS(200,"����"),FAIL(400,"����");
	
	int code;
	String msg;
	
	private SMSCode(int code,String msg) {
		this.code = code;
		this.msg = msg;
	}
}
