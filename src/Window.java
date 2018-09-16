import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JWindow;


public class Window extends JWindow {
	
	private static final long serialVersionUID = 1L;

	JPanel panel = new JPanel();
	
	public Window() {
		panel.setBackground(Color.BLUE);
		add(panel);
		
		// Double click with mouse listener to close a window
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					dispose();
				}
			}
		});
	}
	
	public static void main(String[] args) {
		Window w = new Window();
		w.setSize(400, 400);
		w.setVisible(true);

	}

}
