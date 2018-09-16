import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.SwingUtilities;

public class FloLayout {

	JFrame frame = new JFrame("Flow Layout Demo");
	JPanel panel = new JPanel();
	JButton btn1 = new JButton("First");
	JButton btn2 = new JButton("Second");
	JButton btn3 = new JButton("Third");
	
	public FloLayout() {
		//panel.setLayout(new FlowLayout());
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new FloLayout();
			}
		});

	}

}
