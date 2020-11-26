package ch13;

public class Synchronized {

	public static void main(String[] args) {
		SharedBoard board = new SharedBoard();
		
		Thread th1 = new StudentThread("kitae", board);
		Thread th2 = new StudentThread("hyosoo", board);
		
		th1.start();
		th2.start();
		
	}
}

class SharedBoard{ //임계구역 내부의 블록시간 때문에 타이밍이 안 맞을 수 있음 
	private int sum = 0;
	synchronized public void add() { //동기화 안 시키고 하면, 충돌나서 정상적인 시행이 안됨,synchronized 없애고 다시 실행
		int n=sum;
		Thread.yield();//현재 실행 중인 스레드 양보 //일부러 충돌을 발생시키기 위해
		n+=10;
		sum = n;
		System.out.println(Thread.currentThread().getName()+" : "+sum);
	}
	
	
	
	public int getSum() {
		return sum;
	}
	
	
}


class StudentThread extends Thread{
	private SharedBoard board;
	
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++)
			board.add();
		
	}
}