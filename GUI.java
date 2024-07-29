package GUI_Login;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI {

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10,20,90,25);
		panel.add(userLabel);
		
		JTextField userText = new JTextField(20);
		userText.setBounds(100,20,100,20);
		panel.add(userText);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10,50,100,20);
		panel.add(passwordLabel);
		
		JPasswordField passwordText= new JPasswordField(20);
		passwordText.setBounds(100,50,100,20);
		panel.add(passwordText);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(80,90,80,20);
		panel.add(loginButton);
		
		frame.setVisible(true);
	}

}
