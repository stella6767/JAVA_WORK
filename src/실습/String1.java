package 실습;

public class String1 {
	
	public static void main(String[] args) {
		String java= "java";
		String cpp = "C++";
		
		//현재 문자열을 사전 순으로 비교, 같으면 0, 현재문자열(java)이 사전에서 먼저나오면 음수
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
