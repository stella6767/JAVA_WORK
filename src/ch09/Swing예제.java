package ch09;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Swing���� extends JFrame{
	public Swing����() {
		setTitle("����");
		setSize(300,500);
		
		Container c = getContentPane();
		
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư3");
		JButton btn5 = new JButton("��ư4");
		JButton btn6 = new JButton("��ư5");
		
		JPanel jp1 =new JPanel();
		jp1.add(btn4);
		jp1.add(btn5);
		jp1.add(btn6);
		
		c.add(btn1,BorderLayout.NORTH);
		c.add(btn2,BorderLayout.CENTER);
		c.add(jp1,BorderLayout.SOUTH);
		
		
		
		
		setVisible(true);//ȭ�鿡 ǥ��
		
	}
	
	
	public static void main(String[] args) {
		
		new Swing����();
		
	}
}
