package �ǽ�;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExamResult extends JFrame {
	
	public ExamResult() {
		super("��������ǥ");
		
		buildGUI();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(500,200);
		setSize(400,400);
		
		setVisible(true);
	}
	
	private void buildGUI() {
		setLayout(new BorderLayout());

		Container contentpane = getContentPane();
		ResultPanel resultPanel = new ResultPanel();
        //�׷����� �׸� �г�
		
		contentpane.add(resultPanel, BorderLayout.CENTER);
		
		JPanel p = new JPanel();
		JTextField e1 = new JTextField(3);
		JTextField e2 = new JTextField(3);
		JTextField e3 = new JTextField(3);
		
		JButton button = new JButton("�������Ͷ��");
		
		p.add(new JLabel("����"));
		p.add(e1);
		p.add(new JLabel("����"));
		p.add(e2);
		p.add(new JLabel("����"));
		p.add(e3);
		p.add(button);
		
		contentpane.add(p, BorderLayout.SOUTH);
		button.addActionListener(new DrawingActionListener(e1, e2, e3, resultPanel));
		//��ư�� ���� �� �۵��� ������
	}

	public static void main(String[] args) {
		new ExamResult();
		
	}

	//�����(�׷���)�� ��Ÿ�� �г�
	class ResultPanel extends JPanel{
		int kor, eng, math;
		
		public void paint(Graphics g) {
			g.clearRect(0,0,getWidth(),getHeight());
			g.drawLine(50,  250,  350,  250);
			
			for (int i = 1; i< 11 ; i++) {
				g.drawString(i*10 + "", 25, 255-(20*i));
				g.drawLine(50,  250-(20*i), 350, 250-(20*i));
			}
			
			g.drawLine(50, 20, 50, 250);
			g.drawString("����", 100, 270);
			g.drawString("����",  200, 270);
			g.drawString("����", 300, 270);
			g.setColor(Color.BLUE);
			
			if(kor > 0)
				g.fillRect(110, 250 - kor*2, 10, kor*2);	
			if(eng > 0)
				g.fillRect(210, 250 - eng*2, 10, eng*2);	
			if(math > 0)
				g.fillRect(310, 250 - math*2, 10, math*2);
		}
		
		void setScore(int kor, int eng, int math) {
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
	}
	
	
	

	//��ư�� ������ �� ������ ������
	class DrawingActionListener implements ActionListener{
		JTextField e1, e2, e3;
		ResultPanel resultPanel;
		
		DrawingActionListener(JTextField e1, JTextField e2, JTextField e3, ResultPanel resultPanel){
			this.e1 = e1;
			this.e2 = e2;
			this.e3 = e3;
			this.resultPanel = resultPanel;
		}
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
        //���ڸ� �Է����� �ʾ��� �� ���� �ذ� & ���� �޼���
			try{
				int kor = Integer.parseInt(e1.getText());
				int eng = Integer.parseInt(e2.getText());
				int math = Integer.parseInt(e3.getText());
				resultPanel.setScore(kor, eng, math);
				resultPanel.repaint();
			}
			catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(resultPanel, "�ٽ� �Է��ϼ���", "���� �޼���", JOptionPane.ERROR_MESSAGE);
			}
		}

	}
}