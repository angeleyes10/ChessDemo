import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class BoxCell extends javax.swing.JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String placeName;
	private int index;
	private BufferedImage image;
	public BoxCell(){
		
	}
	public BoxCell(Color c, String name, int index) {
		this.setBackground(c);
		this.setSize(new Dimension(140, 140));
		this.setPlaceName(name);
		this.index = index;
		this.addMouseListener(new MouseEventDemo());
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
}
