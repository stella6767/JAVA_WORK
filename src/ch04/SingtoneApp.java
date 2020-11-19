package ch04;

class President{
	//main이 실행되기 전에 힙공간이 생김!
	private static President instance =new President();
	
	public static President getInstance() {
		return instance;
	}
	
	private President() {
		
	}
	
}




public class SingtoneApp {
	
	public static void main(String[] args) {
		//heap도 싱글톤으로 관리하면 공유가능!
		President p =President.getInstance();
		
	
	
	}	
}
