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
public class Swing예제2 extends JFrame {

	// 컴포넌트는 힙 영역에 기술!
	private JLabel laName, laNum, laClass, laSubject;
	private JTextField tfName, tfNum, tfClass, tfSubject;
	private Container c;
	private GridLayout grid;

	public Swing예제2() {
	
		//1. 필요한 오브젝트를 메모리에 로딩
		initObject();
		
		//2. 세팅			
		initSetting();
		
		//3. 배치
		initBatch();		
	}

	
	// 컴포넌트 혹은 컨테이너 초기화
	private void initObject() {
		laName = new JLabel("이름");
		laNum = new JLabel("학번");
		laClass = new JLabel("학과");
		laSubject = new JLabel("과목");
		tfName = new JTextField("");
		tfNum = new JTextField("");
		tfClass = new JTextField("");
		tfSubject = new JTextField("");
		c= new Container();
		grid = new GridLayout();	
	}


	private void initSetting() {
		setTitle("GridLayout Sample");
		// x버튼클릭하면 main이 종료됨
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
		
		 new Swing예제2();
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
//c.add(new JLabel(" 이름"));
//c.add(new JTextField(""));
//c.add(new JLabel(" 학번"));
//c.add(new JTextField(""));
//c.add(new JLabel(" 학과"));
//c.add(new JTextField(""));
//c.add(new JLabel(" 과목"));
//c.add(new JTextField(""));
//
//JButton btn1 = new JButton("버튼");
//// c.add(btn1, new simpleGrid)
//// panel.add(panel2, new SimpleGridBagConstraints(0, 0, 2, 1));
//
//c.add(new JButton("버튼"));
