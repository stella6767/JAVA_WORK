package 시험;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTest extends JFrame{
	
	private JPanel p1, p2;
	private JLabel laTop, laBottom;
	private JButton btnBottom;
	
	public PanelTest() {
		
		setLayout(new GridLayout(2, 1));
		p1 = new JPanel();
		p2 = new JPanel();
		p1.setBackground(Color.YELLOW);
		p2.setBackground(Color.ORANGE);
		
		laTop = new JLabel("Top");
		laBottom = new JLabel("Bottm");
		
		btnBottom = new JButton("Top패널 repaint()");
		
		p1.add(laTop);
		p2.add(laBottom);
		p2.add(btnBottom);
		
		setSize(300, 500);
		add(p1);
		add(p2);
		
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		new PanelTest();
	}

}
