package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import lombok.Data;

public class LoginScreen extends JFrame {
	
	//Contest = 컨텍스트 = 변태(스토커) = this
	private LoginScreen loginScreen = this;
	//웹은 컨텍스트를 넘기지 않고 주로 제이슨데이터를 넘긴다. 응용프로그램은 컨텍스트를 넘기는편이 많다.(이게 훨씬 쉬움)
	
	
	private JTextField tfUsername;
	private JButton btnLogin;
	
	public LoginScreen() {
		
		tfUsername = new JTextField("");
		btnLogin = new JButton("로그인");
		
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,500);
		
		Container c = getContentPane();
		c.add(tfUsername, BorderLayout.CENTER);
		c.add(btnLogin, BorderLayout.SOUTH);
		
		initListener();
		
		
		setVisible(true);
	}
	
	//리스너 등록 모아두기
	private void initListener() {
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = tfUsername.getText();
				if(username.equals("ssar")) {
					
					new HomeScreen(loginScreen);
					loginScreen.setVisible(false); //익명클래스라 this 직접 사용못함!!
					
				}else {
					System.out.println("로그인 실패: 아이디를 다시 입력해주세요");
				}
				
			}
		});
	}

	public LoginScreen getLoginScreen() {
		return loginScreen;
	}

	public void setLoginScreen(LoginScreen loginScreen) {
		this.loginScreen = loginScreen;
	}

	public JTextField getTfUsername() {
		return tfUsername;
	}

	public void setTfUsername(JTextField tfUsername) {
		this.tfUsername = tfUsername;
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}
	
	
	
}
