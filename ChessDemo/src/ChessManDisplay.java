import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChessManDisplay extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String SELECTED_PATH = "";
	private String cFILE_PATH;
	private BufferedImage image;
	public JLabel jl;

	public ChessManDisplay() {
		// TODO Auto-generated constructor stub

	}

	public ChessManDisplay(String filePath) {
		// TODO Auto-generated constructor stub
		//System.out.println(filePath);
		cFILE_PATH = filePath;
		try {
			this.image = ImageIO.read(new File(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}

		jl = new JLabel(new ImageIcon(image));
		jl.setVisible(true);
		this.setSize(70, 70);
		this.add(jl, BorderLayout.CENTER);
		this.setEnabled(true);
		this.setVisible(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (image != null) {
			int x = 10;
			int y = 10;
			g.drawImage(image, x, y, this);
		}
	}

}
