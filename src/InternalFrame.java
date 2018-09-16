import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class InternalFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	JDesktopPane desktopPane = new JDesktopPane();
	JInternalFrame intFrame = new JInternalFrame("JInternal Frame Demo");
	
	public InternalFrame() {
		
		intFrame.setMaximizable(true);
		intFrame.setIconifiable(true);
		intFrame.setResizable(true);
		
		intFrame.setClosable(true);
		intFrame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		
		
		intFrame.setSize(320, 240);
		intFrame.setVisible(true);
		
		desktopPane.add(intFrame);
		add(desktopPane);
	}

	public static void main(String[] args) {
		InternalFrame iFrame = new InternalFrame();
		iFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		iFrame.setSize(640, 480);
		iFrame.setVisible(true);

	}

}
