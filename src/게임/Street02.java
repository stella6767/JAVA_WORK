package ����;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ����.Main;

class MyThread extends Thread {

	private Street02 street;

	public MyThread() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {

		super.run();
	}
}

public class Street02 extends JFrame {
	Street02 street = this;
	int x = 340;
	int y = 20;

	Container c;

	public Street02() {
		setTitle("��ǳ");
		setSize(900, 300);
		setLocationRelativeTo(null);// ����� ���߾ӿ� jframe ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();

		c.add(new GamePanel());
		setVisible(true);

	}

	// Flow layout
	class GamePanel extends JPanel {

		ImageIcon imgIconPlayer, imgIconJang; // �տ� ���� �ڿ� �̸� ��������
		Image imgPlayer, imgJang;
		JButton btn;
		boolean isRunning = true;

		public GamePanel() {
			imgIconPlayer = new ImageIcon("images/player.png");
			imgIconJang = new ImageIcon("images/jang.png");
			imgPlayer = imgIconPlayer.getImage();
			imgJang = imgIconJang.getImage();
			btn = new JButton("����");
			add(btn);

			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					isRunning = !isRunning; // ��Ŭ��ƴ ����� ��������� �����尡 ����Ǿ� ����ȵ� ���� while�� �� �ɾ��ָ� ��
					// isRunning = false;

				}
			});

			setFocusable(true);
			addKeyListener(new KeyAdapter() {

				@Override
				public void keyPressed(KeyEvent e) {
					System.out.println("x ��ǥ: " + x);
					if (e.getKeyCode() == KeyEvent.VK_SPACE) {
						new Thread(new Runnable() {

							@Override
							public void run() {
								while (true) {
									System.out.println(isRunning);
									while (isRunning) {
										x = x + 10;
										repaint(); // �̺�Ʈ�� ����Ǵ� �������� ����!
										try {
											Thread.sleep(20);
										} catch (InterruptedException e) {

											e.printStackTrace();
										}
									}
								}
							}
						}).start();

					}

				}

			});
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(imgPlayer, 0, 0, null);
			g.drawImage(imgJang, x, y, null);
		}

	}

	public static void main(String[] args) {
		new Street02();
	}
}
