import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Button {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				JFrame frame = new JFrame();
				JButton button = new JButton("JButton Test");
				frame.add(button);
				button.setFont(new Font("Serif", Font.PLAIN, 18));
				button.setEnabled(true);
				button.setIcon(new ImageIcon(Button.class
						.getResource("com/icon/next.png")));
				
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.pack();
				frame.setVisible(true);
			}
		});

	}

}
