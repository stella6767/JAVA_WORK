package ch13;

public class Thread03 {
	
	static int sum = 0;
	
	static class NewThread implements Runnable{ //내부 클래스는 static으로 만드는 경우가 많음
		@Override
		public void run() {
			System.out.println("새로운 쓰레드 시작");
			for (int i = 1; i < 11; i++) {
				sum=sum+10;
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					return;
				}
			}
			System.out.println("새로운 쓰레드 끝");
		}
	}
	
	
	
	//새로운 쓰레드에서 실행한 값을 메인 쓰레드에서 받아서 실행하고 싶을 때
	//두가지 방법 콜백(비동기적) or join(동기적)
	public static void main(String[] args) {
		System.out.println("메인 쓰레드 시작");
		Thread t1 = new Thread(new NewThread());
		//Thread t1 = new Thread(new NewThread().new NewThread());//내부 클래스 static이 아닐떄
		
		t1.start();
		
//		try {
//			Thread.sleep(3000); //이 쓰레드가 언제 끝날지 예측 못하는 상황일 때는 최악의 코드
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		try {
			t1.join(); //t1이 끝날때까지 대기
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(sum);
		
		System.out.println("메인 쓰레드 종료");
	}
}
