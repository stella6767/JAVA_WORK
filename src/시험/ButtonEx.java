package 시험;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonEx extends JFrame {

	public ButtonEx() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon normalicIcon = new ImageIcon("D://download/btn1.png");
		ImageIcon rolloverIcon = new ImageIcon("D://download/btn2.png");
		ImageIcon pressedIcon = new ImageIcon("D://download/btn3.png");
		
		JButton btn = new JButton("call~~", normalicIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		c.add(btn);
		
		setSize(250,150);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ButtonEx();
	}
}
