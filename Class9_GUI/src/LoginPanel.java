import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPanel extends JPanel {
	private Mainwindow parent_window;
	private JTextField usernameField;
	private JPasswordField passwordField;

	
	
	
	
	/**
	 * Create the panel.
	 */
	public LoginPanel(Mainwindow parent) {
		setLayout(null);
		this.parent_window = parent;
		
		usernameField = new JTextField();
		usernameField.setBounds(213, 77, 86, 20);
		add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(213, 134, 86, 20);
		add(passwordField);
		
		JButton btnLogin = new JButton("Log In");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				char [] pwd = passwordField.getPassword();
				String password = String.valueOf(pwd);
				
				
			if(username.equals("admin") && password.equals("sm@ry")) 
			{
				parent_window.startMainPanel();
			}
				}
		});
		btnLogin.setBounds(165, 217, 89, 23);
		add(btnLogin);

	}
}
