// import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class TextField {

	JFrame frame = new JFrame("Text Field Demo");
	JTextField textField = new JTextField("Hello World from a Text Field", 10);
	
	public TextField() {
		
		//textField.setFont(new Font("Verdana", Font.PLAIN, 18));
		// textField.setEditable(false);
		// textField.setEnabled(false);
		
		textField.setText("This is new text");
		String s = textField.getText();
		frame.setTitle(s);
		
		frame.add(textField);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	
	
	
		
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new TextField();
			}
		});
	}

}
