package ch09;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JLabel;

public class Swing04 extends JFrame {

	private JLabel la1,la2,la3;
	private JButton btn1, btn2, btn3;
	private JPanel pn1,pn2;
	private Container c;
	
	
	
	public Swing04() {
		
		initObject();
		
		initSetting();
		
		initBatch();
		
		
//		JPanel panel = new JPanel();
//		panel.setBackground(Color.GRAY);
//		getContentPane().add(panel, BorderLayout.NORTH);
//		
//		JButton btnNewButton = new JButton("New button");
//		panel.add(btnNewButton);
//		
//		JButton btnNewButton_1 = new JButton("New button");
//		panel.add(btnNewButton_1);
//		
//		JButton btnNewButton_2 = new JButton("New button");
//		panel.add(btnNewButton_2);
//		
//		JPanel panel_1 = new JPanel();
//		getContentPane().add(panel_1, BorderLayout.CENTER);
//		panel_1.setLayout(null);
//		
//		JLabel lblNewLabel = new JLabel("New label");
//		lblNewLabel.setBounds(63, 161, 57, 15);
//		panel_1.add(lblNewLabel);
//		
//		JLabel lblNewLabel_1 = new JLabel("New label");
//		lblNewLabel_1.setBounds(290, 107, 57, 15);
//		panel_1.add(lblNewLabel_1);
//		
//		JLabel lblNewLabel_2 = new JLabel("New label");
//		lblNewLabel_2.setBounds(121, 29, 57, 15);
//		panel_1.add(lblNewLabel_2);

	}
	
	
	private void initObject() {
		la1 = new JLabel("라벨1");
		la2 = new JLabel("라벨2");
		la3 = new JLabel("라벨3");

		btn1 = new JButton("버튼1");
		btn2 = new JButton("버튼2");
		btn3 = new JButton("버튼3");
		
		pn1 = new JPanel();
		pn2 = new JPanel();
		
		c= new Container();
	}

	
	private void initSetting() {
		setTitle("세팅하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(465, 449);
		c = getContentPane();
		
		pn1.setBackground(Color.gray);
		pn2.setLayout(null);
		
		
		la1.setBounds(63, 161, 57, 15);
		la2.setBounds(290, 107, 57, 15);
		la3.setBounds(121, 29, 57, 15);
		setVisible(true);
	}
	

	private void initBatch() {
		c.add(pn1,BorderLayout.NORTH);
		c.add(pn2,BorderLayout.CENTER);
		pn1.add(btn1);
		pn1.add(btn2);
		pn1.add(btn3);
		
		pn2.add(la1);
		pn2.add(la2);
		pn2.add(la3);

	}


	
	public static void main(String[] args) {
		new Swing04();
	}
}
