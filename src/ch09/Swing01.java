package ch09;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Swing�� ���������� while�� ���� ����. ���� ���μ���
public class Swing01 extends JFrame{
	public Swing01() {
		setTitle("����");
		setSize(300,500);
		
		//jpanel = (jFrame�� �⺻������ ������ �ִ� �г�)
		Container c = getContentPane();
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton("��ư5");
		JButton btn6 = new JButton("��ư6");
		
		
		//flowlayout, jpanel�� default layout
		JPanel jp1 =new JPanel();
		jp1.add(btn6);
		
		//borderlayout�� jframe�� default
		c.add(btn1,"West"); //������ ����! �Ǽ��� ������ ����
		c.add(btn2,Batch.EAST);
		c.add(btn3,Batch.NORTH);
		c.add(jp1,Batch.CENTER);
		c.add(btn5,BorderLayout.SOUTH);//�����������
		
		setVisible(true);//ȭ�鿡 ǥ��
	}
	
	public static void main(String[] args) {
				
		new Swing01();
	}
}
