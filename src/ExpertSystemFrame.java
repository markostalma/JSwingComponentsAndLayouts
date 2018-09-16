import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;

public class ExpertSystemFrame {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Expert System for Headche Analysis");
		ExpertSystemPanel panel = new ExpertSystemPanel();
		frame.add(panel);
        
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(640, 480);
		
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m12 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m12);
        JMenuItem m21 = new JMenuItem("About");
        JMenuItem m22 = new JMenuItem("Documentation");
        m2.add(m21);
        m2.add(m22);
        
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.setVisible(true);
		
	}
}