import javax.swing.*;

public class SplitPane extends JFrame {
	JLabel leftLabel = new JLabel();
	JLabel rightLabel = new JLabel();
	private static final long serialVersionUID = 1L;
	
	JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(leftLabel), new JScrollPane(rightLabel));
	
	public SplitPane(){
		leftLabel.setIcon(new ImageIcon("img/gui.jpg"));
		rightLabel.setIcon(new ImageIcon("img/gui.jpg"));
		add(splitPane);
	}
	
	public static void main(String[] args) {
		SplitPane sp = new SplitPane();
		sp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		sp.setSize(800, 400);
		sp.setVisible(true);
	}

}
