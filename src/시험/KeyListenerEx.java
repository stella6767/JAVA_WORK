package 시험;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame {
	
	private JLabel [] keyMessage;
	
	public KeyListenerEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MykeyListener());
		
		keyMessage = new JLabel[3];
		keyMessage[0] = new JLabel("getkeyCode()");
		keyMessage[1] = new JLabel("getkeyChar()");
		keyMessage[2] = new JLabel("getkeyText()");
		
		for (int i = 0; i < keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true); //배경색이 보이도록 불투명 속성 설정
			keyMessage[i].setBackground(Color.YELLOW);
		}
		
		
		setSize(300,150);
		setVisible(true);
		
		//컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제지정
		c.setFocusable(true);
		c.requestFocus();
				
	}
	
	//key 리스너 구현
	class MykeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			keyMessage[0].setText(Integer.toString(keycode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(KeyEvent.getKeyText(keycode));
			
			System.out.println("keyPressed");
			
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("keyreleased");
		}
		
		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println("keytyped");
		}
	}
	
	
	public static void main(String[] args) {
		new KeyListenerEx();
	}
}
