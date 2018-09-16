import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class OptionPane {
	JFrame frame = new JFrame("JOption Pane Demo");
	JPanel panel = new JPanel();
	JButton button = new JButton("Call dialog");
	JTextArea textarea = new JTextArea(10,10);
	
	public OptionPane() {
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//JOptionPane.showMessageDialog(null, "Simple Dialog Text!", "Dialog Title", JOptionPane.WARNING_MESSAGE);
				//JOptionPane.showMessageDialog(null, new JScrollPane(textarea), "Dialog Title", JOptionPane.PLAIN_MESSAGE);
				//String title = JOptionPane.showInputDialog(null, "Enter title for JFrame");
				//frame.setTitle(title);
				//JOptionPane.showConfirmDialog(null, "Are you sure you want to close a JFrame", "Select and option", JOptionPane.OK_CANCEL_OPTION);
				
				int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to close a JFrame", "Select and option", JOptionPane.OK_CANCEL_OPTION);
				
				if(result == JOptionPane.OK_OPTION ) {
					frame.dispose();
				}
			}
		});
		
		panel.add(button);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new OptionPane();
			}
		});

	}

}
