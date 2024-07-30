package GUI_Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SimpleLogin implements ActionListener  {

	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel PasswordLabel;
	private static JPasswordField passwordText;
	private static JButton loginButton;
	private static JLabel success;
	
	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("User");
		userLabel.setBounds(10,20,90,25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100,20,100,20);
		panel.add(userText);
		
		PasswordLabel = new JLabel("Password");
		PasswordLabel.setBounds(10,50,100,20);
		panel.add(PasswordLabel);
		
		passwordText= new JPasswordField(20);
		passwordText.setBounds(100,50,100,20);
		panel.add(passwordText);
		
		loginButton = new JButton("Login");
		loginButton.setBounds(80,90,80,20);
		loginButton.addActionListener(new SimpleLogin());
		panel.add(loginButton);
		
		success = new JLabel("");
		success.setBounds(10,110,300,20);
		panel.add(success);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		@SuppressWarnings("deprecation")
		String password = passwordText.getText();
		
		System.out.println(user + " , " + password);
		
		if(user.equals("Hemanth") && password.equals("Tony")) {
			success.setText("Login Successfull");
		}
		else if(user.equals("Naresh") && password.equals("naresh")){
			success.setText("Login Successfull");
			
		}
		else {
			success.setText("Invalid Credentials");
		}
		
		
	}

}
