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

public class OpenChallenge03 extends JFrame {
	
	private CardLayout card;
	private JPanel slide; //cardlayout
	private JPanel pa1,pa2,pa3,pa4,btnpa;
	private MyImgPanel

	private BufferedImage img;
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
		
		pa1 = new JPanel();
		pa2 = new JPanel();
		pa3 = new JPanel();	
		pa4 = new JPanel();
		btnpa = new JPanel();
			
		
		btn1 = new JButton("<");
		btn2 = new JButton(">");
		
		card = new CardLayout(0,0);
		
		c= new Container();
		

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
	

	
	class MyImgPanel extends JPanel{
		private ImageIcon icon = new ImageIcon();
		private Image img = icon.getImage();
		
		@Override
		public void paintComponents(Graphics g) {
			super.paintComponents(g);
			
			//이미지를 패널 크기로 조절하여 그린다.
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			
		}
		
		
	}
	
	
	
	private void initBatch() {
		c.add(slide,BorderLayout.CENTER);	
		c.add(btnpa,BorderLayout.SOUTH);
			
		slide.add(pa1,"1");
		slide.add(pa2,"2");
		slide.add(pa3,"3");
		slide.add(pa4,"4");
		

		btnpa.add(btn1);
		btnpa.add(btn2);

	}
	
	
	public static void main(String[] args) {
		new OpenChallenge03();
	}
}
