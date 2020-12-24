package 게임;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import 시험.Main;

public class Street01 extends JFrame{

	int x = 360;
	int y = 20;		
	
	Container c;
	
	
	
	public Street01() {
		setTitle("장풍");
		setSize(900,300);
		setLocationRelativeTo(null);// 모니터 정중앙에 jframe 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c= getContentPane();
		c.add(new GamePanel());
		setVisible(true);
		
	}
	
	
	class GamePanel extends JPanel{
		
		ImageIcon imgIconPlayer,imgIconJang; //앞에 뭔지 뒤에 이름 변수명명법
		Image imgPlayer, imgJang;
		
		public GamePanel() {
			imgIconPlayer = new ImageIcon("images/player.png");
			imgIconJang = new ImageIcon("images/jang.png");
			imgPlayer = imgIconPlayer.getImage();
			imgJang = imgIconJang.getImage();
			
			setFocusable(true);
			addKeyListener(new KeyAdapter() {
				
				@Override
				public void keyPressed(KeyEvent e) {
					System.out.println("x 좌표: "+x);
					if(e.getKeyCode() == KeyEvent.VK_RIGHT) {							
						if(x<=640)
							x=x+10;
						
						
					}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
						
						if(x>=360)
							x=x-10;											
					}else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
						
						while(x<=640) {
							x++;
						}
						
					}
					
					repaint();
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
		new Street01();
	}
}
