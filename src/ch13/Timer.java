package ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Threadtime implements Runnable{
	private JLabel timerLabel;
	private JButton kill;
	
	
	public Threadtime(JLabel timerLabel) {
		this.timerLabel = timerLabel;
		
	}
	
	
	@Override
	public void run() {
		System.out.println("Ÿ�̸� ����");
		while(true) {
			LocalDateTime now =LocalDateTime.now();
			timerLabel.setText(now.getHour()+"�� "+now.getMinute()+"��  "+now.getSecond());
			
			//System.out.println(now.getHour()+"�� "+now.getMinute()+"��  "+now.getSecond());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return; //interruptedexception�� �߻��ϸ� ����
			}
		}
		
		
		
		
	}
}


public class Timer extends JFrame {
	
	public Timer() {
		setTitle("���� �ð� Ÿ�̸�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		c.add(timerLabel);
		
		JButton kill = new JButton("Ÿ�̸� ����");
		c.add(kill);
		
		Thread th = new Thread(new Threadtime(timerLabel));
		
		
		
		setSize(800,300);
		setVisible(true);
		th.start();
		
		kill.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt(); //�Ϻη� InterruptedException �߻�
				
			}
		});
	}
	
	public static void main(String[] args) {
//		LocalDateTime now =LocalDateTime.now();
//		System.out.println(now.getHour());
//		System.out.println(now.getMinute());
//		System.out.println(now.getSecond());
		
		new Timer();
		
	}
}
