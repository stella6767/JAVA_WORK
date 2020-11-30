package 시험;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.ImageGraphicAttribute;
import java.awt.image.BufferedImage;
import java.io.File;

public class OpenChallenge03 extends JFrame { //paintComponent  s!!!!!! 가 아니다. 삽질하지 말 것!!
	
	private CardLayout card;
	private JPanel slide; //cardlayout
	private JPanel btnpa,pa2,pa3,pa4;
	private MyImgPanel mpa1;

	private JButton btn1,btn2;
	private ImageIcon img1,img2,img3,img4;
	private Container c;

	
	
	public OpenChallenge03() {
		initObject();
		
		initSetting();
		
		initBatch();
	}
	
	private void initObject() {
		
		img1 = new ImageIcon("D://download/12.jpg");
		img2 = new ImageIcon("D://download/13.jpg");
		img3 = new ImageIcon("D://download/14.jpg");
		img4 = new ImageIcon("D://download/15.jpg");
		
		slide = new JPanel();
		
	
		btnpa = new JPanel();
		mpa1 = new MyImgPanel();
		
		
		btn1 = new JButton("<");
		btn2 = new JButton(">");
		
		card = new CardLayout(0,0);
		
		c= new Container();
		
		
		pa2 = new JPanel() {
			Image background = new ImageIcon("D://download/4.jpg").getImage();
				
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		
		pa3 = new JPanel() {
			Image background = new ImageIcon("D://download/5.jpg").getImage();
				
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		pa4 = new JPanel() {
			Image background = new ImageIcon("D://download/6.jpg").getImage();
				
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
	}

	
	private void initSetting() {
		setTitle("세팅하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		c = getContentPane();
		
		slide.setLayout(card);
		
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.previous(slide);
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(slide);
				
			}
		});
		
		
		
		
		
		setVisible(true);	
		card.show(slide, "1");
	}
	

	
	
	
	private void initBatch() {
		c.add(slide,BorderLayout.CENTER);	
		c.add(btnpa,BorderLayout.SOUTH);
		
		slide.add(mpa1,"1");
		slide.add(pa2,"2");
		slide.add(pa3,"3");
		slide.add(pa4,"4");

		btnpa.add(btn1);
		btnpa.add(btn2);

	}
	
	class MyImgPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("D://download/12.jpg");
		private Image img = icon.getImage();
		
		public MyImgPanel() {
			
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			//이미지를 패널 크기로 조절하여 그린다.
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			//g.setColor(Color.BLUE);
		}
		
		
	}
	
	public static void main(String[] args) {
		new OpenChallenge03();
	}
}

