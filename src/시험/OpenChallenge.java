package 시험;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.print.PrinterGraphics;
import java.util.Random;

public class OpenChallenge extends JFrame {

	private JLabel la1, la2, la3, la4;
	private Container c;

	public OpenChallenge() {
		initObject();

		initSetting();

		initBatch();
	}

	private void initObject() {
		la1 = new JLabel("0");
		la2 = new JLabel("0");
		la3 = new JLabel("0");
		la4 = new JLabel("시작합니다.");
		c = new Container();
	}

	private void initSetting() {
		setTitle("Open Challenge 10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(465, 449);
		c = getContentPane();
		c.setLayout(null);
		
		
		la1.setVerticalAlignment(SwingConstants.BOTTOM);
		la1.setBackground(Color.MAGENTA);
		la1.setOpaque(true);
		la1.setHorizontalAlignment(SwingConstants.CENTER);
		la1.setFont(new Font("ItalicT", Font.BOLD, 38));
		la1.setForeground(Color.YELLOW);
		la1.setBounds(58, 49, 63, 57);		
//		la1.addKeyListener(new KeyAdapter() {
//			Integer i = (int)Math.random()*4;
//			@Override
//			public void keyPressed(KeyEvent e) {
//				
//				//System.out.println(e.getKeyCode());
//				//if (e.getKeyCode()==10) {
//					//la1.setText(i.toString());	
//				}
//				
//				
//			}
//		});
		

		la2.setVerticalAlignment(SwingConstants.BOTTOM);
		la2.setBackground(Color.MAGENTA);
		la2.setOpaque(true);
		la2.setHorizontalAlignment(SwingConstants.CENTER);
		la2.setFont(new Font("ItalicT", Font.BOLD, 38));
		la2.setForeground(Color.YELLOW);
		la2.setBounds(193, 49, 57, 57);

		la3.setVerticalAlignment(SwingConstants.BOTTOM);
		la3.setBackground(Color.MAGENTA);
		la3.setOpaque(true);
		la3.setHorizontalAlignment(SwingConstants.CENTER);
		la3.setFont(new Font("ItalicT", Font.BOLD, 38));
		la3.setForeground(Color.YELLOW);
		la3.setBounds(327, 49, 57, 57);

		la4.setBounds(171, 130, 78, 15);

		
		
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode());
				
				if(e.getKeyCode()==10) {
					Random r = new Random();//MAth.random은 안되나보다.
					int i = r.nextInt(4)+1;
					
					System.out.println(i);
					la1.setText(i+"");	
				}
			}
			
		});
		
		
		c.setFocusable(true);
		c.requestFocus();

		setVisible(true);
	}

	private void initBatch() {
		c.add(la1);
		c.add(la2);
		c.add(la3);
		c.add(la4);

	}

	public static void main(String[] args) {
		new OpenChallenge();
	}
}
