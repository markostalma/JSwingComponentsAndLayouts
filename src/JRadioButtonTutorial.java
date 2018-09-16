import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class JRadioButtonTutorial {
	JFrame frame = new JFrame("JRadioButton Demo");
	JPanel panel = new JPanel();
	JRadioButton rdbGreen = new JRadioButton("Green");
	JRadioButton rdbRed = new JRadioButton("Red");
	ButtonGroup buttonGroup = new ButtonGroup();
	
	
	public JRadioButtonTutorial() {
		rdbGreen.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JRadioButton source = (JRadioButton)e.getSource();
				if(source.isSelected()) {
					panel.setBackground(Color.GREEN);
				}
				if(!source.isSelected()) {
					panel.setBackground(Color.WHITE);
				}
				panel.repaint();
			}
		});
		
		rdbRed.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JRadioButton source = (JRadioButton)e.getSource();
				if(source.isSelected()) {
					panel.setBackground(Color.RED);
				}
				if(!source.isSelected()) {
					panel.setBackground(Color.WHITE);
				}
				panel.repaint();
			}
		});
		
		buttonGroup.add(rdbGreen);
		buttonGroup.add(rdbRed);
		panel.add(rdbGreen);
		panel.add(rdbRed);
		
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JRadioButtonTutorial();
			}
		});
	}

}
