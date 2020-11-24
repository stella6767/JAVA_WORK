package ch10;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

import lombok.Data;


public class HomeScreen extends JFrame {
	
	private HomeScreen homeScreen = this; //컨텍스트를 저장하는 변수를 꼭 만들어두자
	private LoginScreen loginScreen;
	
	private JLabel laUsername;
	
	public HomeScreen() {
		this(null);
	}
	
	public HomeScreen(LoginScreen loginScreen) {
		this.loginScreen = loginScreen;
		
		
		laUsername = new JLabel(loginScreen.getTfUsername().getText());
		
	
		setTitle("HOME");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,500);
		
		Container c = getContentPane();
		c.add(laUsername,BorderLayout.CENTER);
		
		setVisible(true);

	}

	public HomeScreen getHomeScreen() {
		return homeScreen;
	}

	public void setHomeScreen(HomeScreen homeScreen) {
		this.homeScreen = homeScreen;
	}

	public LoginScreen getLoginScreen() {
		return loginScreen;
	}

	public void setLoginScreen(LoginScreen loginScreen) {
		this.loginScreen = loginScreen;
	}

	public JLabel getLaUsername() {
		return laUsername;
	}

	public void setLaUsername(JLabel laUsername) {
		this.laUsername = laUsername;
	}
	
	
	
}
