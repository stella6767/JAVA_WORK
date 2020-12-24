package 게임;
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

import 시험.Main;

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
		setTitle("장풍");
		setSize(900, 300);
		setLocationRelativeTo(null);// 모니터 정중앙에 jframe 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();

		c.add(new GamePanel());
		setVisible(true);

	}

	// Flow layout
	class GamePanel extends JPanel {

		ImageIcon imgIconPlayer, imgIconJang; // 앞에 뭔지 뒤에 이름 변수명명법
		Image imgPlayer, imgJang;
		JButton btn;
		boolean isRunning = true;

		public GamePanel() {
			imgIconPlayer = new ImageIcon("images/player.png");
			imgIconJang = new ImageIcon("images/jang.png");
			imgPlayer = imgIconPlayer.getImage();
			imgJang = imgIconJang.getImage();
			btn = new JButton("멈춤");
			add(btn);

			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					isRunning = !isRunning; // 토클버틈 만드는 양식이지만 스레드가 종료되어 실행안됨 위에 while문 더 걸어주면 됨
					// isRunning = false;

				}
			});

			setFocusable(true);
			addKeyListener(new KeyAdapter() {

				@Override
				public void keyPressed(KeyEvent e) {
					System.out.println("x 좌표: " + x);
					if (e.getKeyCode() == KeyEvent.VK_SPACE) {
						new Thread(new Runnable() {

							@Override
							public void run() {
								while (true) {
									System.out.println(isRunning);
									while (isRunning) {
										x = x + 10;
										repaint(); // 이벤트가 종료되는 시점에만 삽입!
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
