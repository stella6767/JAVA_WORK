package �ǽ�;

public class String1 {
	
	public static void main(String[] args) {
		String java= "java";
		String cpp = "C++";
		
		//���� ���ڿ��� ���� ������ ��, ������ 0, ���繮�ڿ�(java)�� �������� ���������� ����
		int res = java.compareTo(cpp); 
		if(res == 0)
			System.out.println("same");
		else if (res<0) {
			System.out.println(java + " < " + cpp);
		}
		else {
			System.out.println(java + " > " + cpp);
		}
		
		
		
		
		
		
		
	}
}
