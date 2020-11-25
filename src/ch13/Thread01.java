package ch13;

class Another implements Runnable{ //Runnable 타입이 되어야 함 run() 때문에 다중상속떄문에 이 방법을 추천
	//실행단위 코드블럭=stack(스레드) //대신 implements는 필드를 못 쓴다.
	@Override
	public void run() { //타겟
		System.out.println("새로운 쓰레드 실행됨");
		for (int i = 1; i < 11; i++) {
			try {
				System.out.println("run:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("새로운 스레드 종료");
	}
	
}


class Another2 extends Thread{
	
	
	
}


//스레드를 쓰면 내부클래스로 대부분 만든다. 


public class Thread01 {
	
	public static void main(String[] args) {
		System.out.println("main 쓰레드 실행됨");
		
		//새로운 스레드 실행 1.스레드 객체 생성 2.타겟 설정 3.실행
		Thread t1 =new Thread(new Another(),"쓰레드 이름지정"); //보통 이 같이 번갈아 실행은 UX 때문에 이 같이 쓰는 거 말고,
		t1.start(); //독립적인 스레드 실행
		System.out.println(t1.getName());
		
		Thread t2 =new Thread(new Runnable() {//한 번 쓰고 버릴거면 익명클래스로			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		for (int i = 1; i < 11; i++) {
			try {
				System.out.println("main:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("main 스레드 종료");
	}//end of main()
}
