import java.net.URL;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class ExpertSystemPanel extends JPanel {
	BufferedImage image;
	private static final long serialVersionUID = 1L;
	
	 public ExpertSystemPanel() {
		try {
			URL url = new URL("http://i.stack.imgur.com/7bI1Y.jpg");
			image = ImageIO.read(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(image, 52,0,null);
	}  
}