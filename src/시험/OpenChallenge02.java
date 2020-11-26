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
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.ImageGraphicAttribute;
import java.awt.image.BufferedImage;
import java.io.File;

public class OpenChallenge02 extends JFrame {
	
	private CardLayout card;
	private JPanel slide; //cardlayout
	private JPanel pa1,pa2,pa3,pa4,imgpa,test;
	private BufferedImage img;
	private JButton btn1,btn2;
	private ImageIcon img1,img2,img3,img4;
	private JLabel la1,la2,la3,la4;
	private Container c;
	private Image img10;
	
	
	public OpenChallenge02() {
		initObject();
		
		initSetting();
		
		initBatch();
	}
	
	private void initObject() {
		
		img1 = new ImageIcon("D://download/12.jpg");
		img2 = new ImageIcon("D://download/13.jpg");
		img3 = new ImageIcon("D://download/14.jpg");
		img4 = new ImageIcon("D://download/15.jpg");
		
		
		
		la1 = new JLabel(img1);
		la2 = new JLabel(img2);
		la3 = new JLabel(img3);
		la4 = new JLabel(img4);
		
		slide = new JPanel();
		
		pa1 = new JPanel();
		pa2 = new JPanel();
		pa3 = new JPanel();
		pa4 = new JPanel();
		imgpa = new JPanel();
		
		test = new JPanel() {
			Image background = new ImageIcon("D://download/12.jpg").getImage();
			public void paint(Graphics g) {
				g.drawImage(background,0,0,null);
				
			}
		};
		
		
		btn1 = new JButton("<");
		btn2 = new JButton(">");
		
		card = new CardLayout(0,0);
		
		c= new Container();
		
		img10 = img1.getImage();
	}

	
	private void initSetting() {
		setTitle("세팅하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		c = getContentPane();
		
		slide.setLayout(card);
		
//		pa1.setLayout(card);
//		pa2.setLayout(card);
//		pa3.setLayout(card);
//		pa4.setLayout(card);
		
	
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
		c.add(imgpa,BorderLayout.SOUTH);
		
		slide.add(test);
		
//		slide.add(pa1,"1");
//		slide.add(pa2,"2");
//		slide.add(pa3,"3");
//		slide.add(pa4,"4");
		
		pa1.add(la1);
		pa2.add(la2);
		pa3.add(la3);
		pa4.add(la4);
		
		imgpa.add(btn1);
		imgpa.add(btn2);

	}
	
	
	public static void main(String[] args) {
		new OpenChallenge02();
	}
}
