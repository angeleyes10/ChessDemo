import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class ChessMan {

	protected String name;
	protected ChessManDisplay cMDisplay;
	private boolean isSelected;
	public String team;
	
	public void draw() {

	}

	public void draw(BoxCell jp) {

	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
}
