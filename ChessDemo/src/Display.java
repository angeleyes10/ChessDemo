import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Display extends JFrame {

	public JFrame mainFrame;
	public List<BoxCell> boxList;

	public Display() {

		boxList = new ArrayList<BoxCell>();
		initializeTools();
	}

	public void initializeTools() {
		// JFrame
		mainFrame = new JFrame("ChessMasters");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(800, 800);

		// Deck JPanel
		JPanel jp = new JPanel();
		jp.setBackground(Color.YELLOW);
		jp.setSize(600, 600);
		GridLayout gl = new GridLayout(8, 8, 2, 2);
		jp.setLayout(gl);

		mainFrame.add(jp);

		Color wColor = Color.WHITE;
		Color color = wColor;
		int index = 0;
		for (int i = 8; i > 0; i--) {
			char letter = 'a';
			color = changeColor(color);

			for (int j = 1; j < 9; j++) {
				color = changeColor(color);
				boxList.add(new BoxCell(color, ("" + letter + i), index));
				jp.add(boxList.get(index), BorderLayout.CENTER);
				index++;
				letter++;
			}
		}
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);
	}

	public Color changeColor(Color currentColor) {
		Color wColor = Color.WHITE;
		Color bColor = Color.BLACK;
		return (currentColor == wColor) ? bColor : wColor;
	}

}
