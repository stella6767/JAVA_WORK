package ch13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLabel extends JLabel implements Runnable{
	private long delay;
	
	public FlickeringLabel(String text, long delay) {
		super(text); //JLabel ������ ȣ��
		this.delay = delay;
		setOpaque(true); // ���� ������ �����ϵ��� ����!
		
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


public class ����13_3 extends JFrame {
	
	public ����13_3() {
		setTitle("FlickeringLabelEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//�����̴� ���̺� ����
		FlickeringLabel fLabel = new FlickeringLabel("����", 500);
		
		//�������� �ʴ� ���̺� ����
		JLabel label = new JLabel("�ȱ���");
		//super Ŭ���� �����ڿ��� thread�� ������ �ȵǾ��ֱ� ������ ������ ������ �ȵ�!
		
		//�����̴� ���̺� ����
		FlickeringLabel fLabel2 = new FlickeringLabel("���⵵ ����", 300);
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		setSize(300,150);
		setVisible(true);
				
	}
	public static void main(String[] args) {
		new ����13_3();
	}
}
