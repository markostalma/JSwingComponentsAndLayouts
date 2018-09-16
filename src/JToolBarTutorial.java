import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

public class JToolBarTutorial {
	JFrame frame = new JFrame("JToolBar Demo");
	JTextField txtField = new JTextField(15);
	JButton btnAdd = new JButton("Add");
	JButton btnRemove = new JButton("Remove");
	JToolBar toolBar = new JToolBar();
	
	public JToolBarTutorial() {
		toolBar.add(txtField);
		toolBar.add(btnAdd);
		toolBar.addSeparator();
		toolBar.add(btnRemove);
		toolBar.setFloatable(false);
		toolBar.addSeparator();
		
		frame.add(toolBar, BorderLayout.NORTH);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JToolBarTutorial();
			}
		});

	}

}
