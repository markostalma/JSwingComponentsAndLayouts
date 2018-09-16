import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderTutorial {
	JFrame frame = new JFrame("JSlider Demo");
	JLabel label = new JLabel();
	JSlider slider = new JSlider(JSlider.HORIZONTAL,0,255,0);
	
	
	public JSliderTutorial() {	
		label.setOpaque(true);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(10);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				label.setBackground(new Color(0,0,source.getValue()));
			}
		});
	
		frame.add(label, BorderLayout.CENTER);
		frame.add(slider, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JSliderTutorial();
			}
		});

	}

}
