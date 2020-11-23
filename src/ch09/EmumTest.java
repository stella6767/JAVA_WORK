package ch09;

public class EmumTest {
	public static void main(String[] args) {
		
		System.out.println(MyLayout.West);
		System.out.println(MyLayout.West.name());
		System.out.println(MyLayout.West.ordinal());
		System.out.println();
		System.out.println(MyLayout.West.getValue());
		System.out.println(MyLayout.West.getValue2());
		System.out.println();
		System.out.println(SMSCode.FAIL.code);
		System.out.println(SMSCode.FAIL.msg);
		
	}
}
