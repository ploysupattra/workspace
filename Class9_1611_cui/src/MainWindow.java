import java.awt.EventQueue;

import javax.swing.JFrame;

import org.omg.CORBA.FREE_MEM;

public class MainWindow {

	private JFrame frame;
	
	/** * Launch the application.*/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try { MainWindow window = new MainWindow();
					  window.frame.setVisible(true);} 
				catch (Exception e) {e.printStackTrace(); }
			}
		});
	}

	/** * Create the application.*/
	public MainWindow() { initialize(); }
	/** * Initialize the contents of the frame.*/	
	private Loginpanel login_panel;
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		login_panel = new Loginpanel(this);
		login_panel.setBounds(frame.getBounds());
		frame.getContentPane().add(login_panel); //add to frame
		frame.validate();
		frame.repaint();
	}
	private MainPanel MainPanel;
	public void startMainPanel() {
		frame.remove(login_panel);
		frame.revalidate();
		frame.repaint();
		
		MainPanel = new MainPanel();
		MainPanel.setBounds(frame.getBounds());
		frame.getContentPane().add(login_panel);
		frame.validate(); frame.repaint();
		
	}
	
}
