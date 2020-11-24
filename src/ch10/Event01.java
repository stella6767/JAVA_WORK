package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event01 extends JFrame{

	private JButton btn1;
	private JLabel la1;
	
	
	public Event01() {
		setTitle("이벤트 01");
		setSize(300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn1 = new JButton("클릭하세요");
		la1 = new JLabel("클릭안됨");
		la1.setFont(new Font("Serif",Font.BOLD,50));
		
		//jframe이 기본적으로 가지고 있는 jpanel에 접근하기 위해
		Container c = getContentPane();
		c.add(la1, BorderLayout.CENTER);
		c.add(btn1,BorderLayout.SOUTH);
		
		//1.리스너 등록(리스너=인터페이스(메서드만 전달을 위해서))
		btn1.addActionListener(new ActionListener() {
			//리스너에 스택등록
			@Override//익명클래스 사용법이 제일 가독성도 좋고 추천
			public void actionPerformed(ActionEvent e) {
				la1.setText("클릭됨");
				
			}
		});
		
		//2.JVM(OS)이 어떤 이벤트가 발생했는지를 확인
		//3.발생된 이벤트를 이벤트 분배 스레드에 등록(대기열 등록)//Queue
		//4.순서대로 리스너가 실행됨.
			
		la1.addMouseListener(new MouseAdapter() {//원하는 함수만 구현하기위해서 추상클래스(adpter)
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("마우스 클릭됨");				
			}
		});
		
		setVisible(true); //생성자 가장 마지막에!! 그림을 그려라!!
	}
	
	
	public static void main(String[] args) {
		new Event01();
	}
}
