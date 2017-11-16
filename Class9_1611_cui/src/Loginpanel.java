import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Loginpanel extends JPanel {
	private MainWindow parentWin;
	private JTextField usernameField;
	private JPasswordField passwordField;

	/** * Create the panel.*/
	public Loginpanel(MainWindow parent) {
		setLayout(null);
		this.parentWin = parent;
		
		usernameField = new JTextField();
		usernameField.setBounds(147, 102, 142, 20);
		add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(147, 133, 142, 20);
		add(passwordField);
		
		JButton btnLogin = new JButton("Log-In");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				char[] pwd = passwordField.getPassword();
				String password = String.valueOf(pwd);
				if(username.equals("admin") && password.equals("sm@ry")) {
					parentWin.startMainPanel();
				}
			}
		});
		btnLogin.setBounds(165, 217, 89, 23);
		add(btnLogin);
	}
}
