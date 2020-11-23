package ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import lombok.Data;

@Data
public class Swing����2 extends JFrame {

	// ������Ʈ�� �� ������ ���!
	private JLabel laName, laNum, laClass, laSubject;
	private JTextField tfName, tfNum, tfClass, tfSubject;
	private Container c;
	private GridLayout grid;

	public Swing����2() {
	
		//1. �ʿ��� ������Ʈ�� �޸𸮿� �ε�
		initObject();
		
		//2. ����			
		initSetting();
		
		//3. ��ġ
		initBatch();		
	}

	
	// ������Ʈ Ȥ�� �����̳� �ʱ�ȭ
	private void initObject() {
		laName = new JLabel("�̸�");
		laNum = new JLabel("�й�");
		laClass = new JLabel("�а�");
		laSubject = new JLabel("����");
		tfName = new JTextField("");
		tfNum = new JTextField("");
		tfClass = new JTextField("");
		tfSubject = new JTextField("");
		c= new Container();
		grid = new GridLayout();	
	}


	private void initSetting() {
		setTitle("GridLayout Sample");
		// x��ưŬ���ϸ� main�� �����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		c = getContentPane();
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		c.setLayout(grid);
		setVisible(true);
	}



	private void initBatch() {
		c.add(laName);
		c.add(tfName);
		c.add(laClass);
		c.add(tfClass);
		c.add(laNum);
		c.add(tfNum);
		c.add(laSubject);
		c.add(tfSubject);
	}

	public static void main(String[] args) {
		
		 new Swing����2();
	}
}
//setVisible(true);
//
//GridLayout grid = new GridLayout(5, 2);
//grid.setVgap(5);
//
//Container c = getContentPane();
//JPanel a = new JPanel();
//JPanel b = new JPanel();
//
//a.setLayout(new BorderLayout());
//b.setLayout(new BorderLayout());
//
//c.setLayout(grid);
//c.add(new JLabel(" �̸�"));
//c.add(new JTextField(""));
//c.add(new JLabel(" �й�"));
//c.add(new JTextField(""));
//c.add(new JLabel(" �а�"));
//c.add(new JTextField(""));
//c.add(new JLabel(" ����"));
//c.add(new JTextField(""));
//
//JButton btn1 = new JButton("��ư");
//// c.add(btn1, new simpleGrid)
//// panel.add(panel2, new SimpleGridBagConstraints(0, 0, 2, 1));
//
//c.add(new JButton("��ư"));
