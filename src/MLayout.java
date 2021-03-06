import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

public class MLayout {
	JFrame frame = new JFrame("Employees");
	JPanel panel = new JPanel();
	
	JLabel lblFirstName = new JLabel("First name");
	JLabel lblLastName = new JLabel("Last name");
	
	JTextField txtFirstName = new JTextField(20);
	JTextField txtSecondName = new JTextField(20);
	
	JButton btnCreate = new JButton("Create");
	JButton btnDelete = new JButton("Delete");
	
	JLabel lblDsc = new JLabel("Description:");
	JTextArea txtDsc = new JTextArea(10,10);
	
	public MLayout() {
		panel.setLayout(new MigLayout());
		panel.add(lblFirstName);
		panel.add(txtFirstName, "wrap, pushx, growx");
		panel.add(lblLastName);
		panel.add(txtSecondName, "wrap, pushx, growx");
		panel.add(btnCreate, "skip, split2");
		panel.add(btnDelete, "wrap");
		panel.add(lblDsc, "top");
		panel.add( new JScrollPane(txtDsc), "push, grow");
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MLayout();
			}
		});
	}

}
