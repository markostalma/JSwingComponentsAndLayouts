import javax.swing.*;

public class ScrollPane extends JFrame {
	JLabel label = new JLabel();
	private static final long serialVersionUID = 1L;
	JScrollPane scrollPane = new JScrollPane();
	
	public ScrollPane() {
		label.setIcon(new ImageIcon("img/gui.jpg"));
		scrollPane.setViewportView(label);
		add(scrollPane);
	}

	public static void main(String[] args) {
		ScrollPane sp = new ScrollPane();
		sp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		sp.setSize(800, 400);
		sp.setVisible(true);
	}

}


