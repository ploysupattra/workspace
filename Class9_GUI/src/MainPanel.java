import javax.swing.JPanel;
import javax.swing.JButton;

public class MainPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MainPanel() {
		setLayout(null);
		
		JButton Previous = new JButton("New Button");
		Previous.setBounds(162, 133, 89, 23);
		add(Previous);

	}

}