package ch12;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class �׷��Ƚǽ� extends JFrame {

	private JPanel btnpa;
	private GrapPanel grpa;
	private Container c;
	private JButton btn1;

	public �׷��Ƚǽ�() {
		initObject();

		initSetting();

		initBatch();
	}

	class GrapPanel extends JPanel {

		@Override
		public void paintComponent(Graphics g) {
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

			try {
				g.fillRect(100, 50, 10, 200);
				Thread.sleep(1000);
				g.fillRect(150, 70, 10, 180);
				g.fillRect(200, 120, 10, 130);
				g.fillRect(250, 90, 10, 160);
				g.fillRect(300, 190, 10, 60);
			} catch (Exception e) {
				// TODO Auto-generated catch block panel.paintco(g) btn �Լ���
				e.printStackTrace();
			}

		

		}

	}

	private void initObject() {
		btnpa = new JPanel();
		btn1 = new JButton("Ŭ��");
		grpa = new GrapPanel();
		c = new Container();
	}

	private void initSetting() {
		setTitle("�׷��Ƚǽ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		c = getContentPane();

		// grpa.setVisible(false);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				if (grpa.isVisible())
//					grpa.setVisible(false);
//				else
//					grpa.setVisible(true);
				
				
				for (int i = 0; i < 5; i++) {
					grpa.paintComponent(g){
						try {
							g.fillRect(100, 50, 10, 200);
							Thread.sleep(1000);
							g.fillRect(150, 70, 10, 180);
							g.fillRect(200, 120, 10, 130);
							g.fillRect(250, 90, 10, 160);
							g.fillRect(300, 190, 10, 60);
						} catch (Exception e) {
							// TODO Auto-generated catch block panel.paintco(g) btn �Լ���
							e.printStackTrace();
						}

						
						
					};
				}

				
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

		new �׷��Ƚǽ�();

	}

}
