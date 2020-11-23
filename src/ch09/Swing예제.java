package ch09;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Swing예제 extends JFrame{
	public Swing예제() {
		setTitle("예제");
		setSize(300,500);
		
		Container c = getContentPane();
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼3");
		JButton btn5 = new JButton("버튼4");
		JButton btn6 = new JButton("버튼5");
		
		JPanel jp1 =new JPanel();
		jp1.add(btn4);
		jp1.add(btn5);
		jp1.add(btn6);
		
		c.add(btn1,BorderLayout.NORTH);
		c.add(btn2,BorderLayout.CENTER);
		c.add(jp1,BorderLayout.SOUTH);
		
		
		
		
		setVisible(true);//화면에 표시
		
	}
	
	
	public static void main(String[] args) {
		
		new Swing예제();
		
	}
}
