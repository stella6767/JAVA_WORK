package 시험;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {
	
	public LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("사랑합니다.");
		
		ImageIcon beauty = new ImageIcon("D://download/4.jpg"); // /로 바꿔야한다!
		JLabel imagLabel = new JLabel(beauty);
		
		ImageIcon normalIcon = new ImageIcon("D://download/15.jpg");
		JLabel label = new JLabel("보고싶으면 전화하세요", normalIcon, SwingConstants.CENTER);
		
		c.add(textLabel);
		c.add(imagLabel);
		c.add(label);
		
		setSize(400,600);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new LabelEx();
	}
}
