package ch13;

class NewThread extends Thread{
	@Override
	public void run() {
		System.out.println("새로운 스레드");
	}
}

public class Thread02 {
	
	public static void main(String[] args) {
		//1.스레드 객체 생성
		//2.타겟 설정
		//3.실행
		Thread t1 = new Thread(new NewThread());
		t1.start();
		
		//이렇게도 쓸 수 있다. 타겟 자체가 명시되어있으므로 타겟을 따로 명시하지 않아도 된다.
		NewThread t2 = new NewThread();
		t2.start();
		
	}
}
