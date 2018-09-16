import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

public class JPasswordFieldTutorial {
	JFrame frame = new JFrame("JPassword Field Tutorial Demo");
	JPanel panel = new JPanel();
	JPasswordField passwordField = new JPasswordField(20);
	JButton button = new JButton("Perform Check");
	
	
	public JPasswordFieldTutorial() {
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				char [] input = passwordField.getPassword();
				if(checkIfCorrect(input)) {
					JOptionPane.showMessageDialog(null, "Pass is correct! ;)");
				}else {
					JOptionPane.showMessageDialog(null, "Pass is wrong! Please try again. ");
				}
		}
	});
		
		passwordField.setEchoChar('*');
		panel.add(passwordField);
		panel.add(button);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	private boolean checkIfCorrect( char [] input) {
		boolean isCorrect = false;
		char [] correctPass = {'1', '2', '3'};
		
		if(input.length != correctPass.length) {
			isCorrect = false;
		}else {
			isCorrect = Arrays.equals(input, correctPass);
		}
		Arrays.fill(correctPass, '0');
		return isCorrect;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JPasswordFieldTutorial();
			}
		});

	}

}
