import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.SwingUtilities;

public class GrLayout {
	JFrame frame = new JFrame("Grid Layout Demo");
	JPanel panel = new JPanel();
	JButton btn1 = new JButton("First");
	JButton btn2 = new JButton("Second");
	JButton btn3 = new JButton("Third");
	JButton btn4 = new JButton("Fourth");
	
	
	
	public GrLayout() {
		panel.setLayout(new GridLayout(2, 2, 3, 3));
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		btn1.setPreferredSize(new Dimension(100,100));
		
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//frame.pack();
		frame.setSize(400,400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new GrLayout();
			}
		});

	}

}
