package 시험;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener extends JFrame {
	public InnerClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	
	//내부 클래스로 action 리스너를 작성한다.
	//내부 클래스이므로 자신을 둘러싼 외부 클래스의 모든 맴버에 접근가능
	private class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			
			//innerclassListener의 맴버나 jframe의 맴버를 호출할 수 있음
			InnerClassListener.this.setTitle(b.getText()); //프레임의 타이틀에 버튼 문자열을 출력
			
		}
	}
	
	
	public static void main(String[] args) {
		new InnerClassListener();
	}
	
	
}
