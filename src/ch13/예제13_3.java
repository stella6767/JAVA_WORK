package ch13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLabel extends JLabel implements Runnable{
	private long delay;
	
	public FlickeringLabel(String text, long delay) {
		super(text); //JLabel 생성자 호출
		this.delay = delay;
		setOpaque(true); // 배경색 변경이 가능하도록 설정!
		
		Thread th = new Thread(this);
		th.start();
		
	}
	
	
	@Override
	public void run() {
		int n = 0; 
		while(true) {
			if(n==0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if(n==0) n=1;
			else n=0;
			
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				return;
			}
			
		}
		
	}
}


public class 예제13_3 extends JFrame {
	
	public 예제13_3() {
		setTitle("FlickeringLabelEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//깜박이는 레이블 생성
		FlickeringLabel fLabel = new FlickeringLabel("깜빡", 500);
		
		//깜박이지 않는 레이블 생성
		JLabel label = new JLabel("안깜박");
		//super 클래스 생성자에는 thread가 구현이 안되어있기 때문에 쓰레드 실행이 안됨!
		
		//깜박이는 레이블 생성
		FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜빡", 300);
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		setSize(300,150);
		setVisible(true);
				
	}
	public static void main(String[] args) {
		new 예제13_3();
	}
}
