import java.awt.EventQueue;

import javax.swing.JFrame;

public class Mainwindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainwindow window = new Mainwindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mainwindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private  LoginPanel login_panel;
   
    	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		login_panel = new LoginPanel(this);
		login_panel.setBounds(frame.getBounds());
		frame.getContentPane().add(login_panel);   // add to frame
		frame.revalidate();
		frame.repaint();
	}
	private MainPanel main_panel;
	public void startMainPanel()
	{
		//remove log in panel
		frame.remove(login_panel);
		frame.revalidate();
		frame.repaint();
	
	// add main panel
	main_panel = new MainPanel();
	main_panel.setBounds(frame.getBounds());
	frame.getContentPane().add(main_panel);
	frame.revalidate();
	frame.repaint();
	}

}
