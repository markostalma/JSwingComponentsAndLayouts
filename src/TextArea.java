import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.JScrollPane;

public class TextArea {
	JFrame frame = new JFrame("JTextArea Demo");
	JTextArea textarea = new JTextArea("Hello", 10, 30);
	JScrollPane srollPane = new JScrollPane(textarea);
	
	public TextArea() {
		//setEditable();
		//setEnabled();
		//setText();
		//getText();
		textarea.append(" from JTextArea");
		frame.add(srollPane);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new TextArea();
			}
		});

	}

}
