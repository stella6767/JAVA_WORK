package ch12;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gra01 extends JFrame{
	
	private MyPanel panel = new MyPanel();
	
	public Gra01() {
		setTitle("sd");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(250,220);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		@Override
		public void paintComponent(Graphics g) { //paintComponent이다!!!!
			super.paintComponent(g);//패널 내의 이전의 그려진 잔상을 지우기 위해 호출
			g.setColor(Color.BLUE);
			g.drawRect(10, 10, 50, 50);
			g.drawRect(50,50, 50, 50);
			g.setColor(Color.MAGENTA);
			g.drawRect(90, 90, 50, 50);
		}	
	}
	
	
	
	public static void main(String[] args) {
		
		new Gra01();
		
	}
}
