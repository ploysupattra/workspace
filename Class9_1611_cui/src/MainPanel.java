import javax.swing.JButton;
import javax.swing.JPanel;

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
