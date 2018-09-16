import javax.swing.*;

public class Label {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Expert System for Headche Analysis Label");
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon("img/gui.jpg"));
		
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(640, 480);
		frame.setVisible(true);
	}
}
