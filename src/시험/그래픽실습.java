package 시험;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class 그래픽실습 extends JFrame {

	private JPanel btnpa;
	private GrapPanel grpa;
	private Container c;
	private JButton btn1;

	public 그래픽실습() {
		initObject();

		initSetting();

		initBatch();
	}

	class GrapPanel extends JPanel {

		boolean click = false;


		
		@Override
		public void paint(Graphics g) {
			super.paintComponent(g);
			for (int cnt = 0; cnt < 11; cnt++) {
				g.drawString(cnt * 10 + "", 25, 255 - 20 * cnt);
				g.drawLine(50, 250 - 20 * cnt, 350, 250 - 20 * cnt);
			}

			g.drawLine(50, 20, 50, 250);
			g.drawString("0", 100, 270);
			g.drawString("1", 150, 270);
			g.drawString("2", 200, 270);
			g.drawString("3", 250, 270);
			g.drawString("4", 300, 270);

			if (click == true) {
				g.fillRect(100, 50, 10, 200);
				g.fillRect(150, 70, 10, 180);
				g.fillRect(200, 120, 10, 130);
				g.fillRect(250, 90, 10, 160);
				g.fillRect(300, 190, 10, 60);
			}
		}

		void setclick() {
//			if(click==false)click = true;
//			else click =false;
			click = !click;
			
		}

	}

	private void initObject() {
		btnpa = new JPanel();
		btn1 = new JButton("클릭");
		grpa = new GrapPanel();
		c = new Container();
	}

	private void initSetting() {
		setTitle("그래픽실습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		c = getContentPane();

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
//			if (grpa.isVisible())
//				grpa.setVisible(false);
//			else
//				grpa.setVisible(true);
//			

//				c.add(grpa, BorderLayout.CENTER);
//				
				grpa.setclick();
				grpa.repaint(); //잔상이 생기는 이유는 super.paintComponent(g); 이 없기 때문!!!!

			}
		});

		setVisible(true);

	}

	private void initBatch() {
		c.add(grpa, BorderLayout.CENTER);
		c.add(btnpa, BorderLayout.SOUTH);

		btnpa.add(btn1);
	}

	public static void main(String[] args) {

		new 그래픽실습();

	}

}
