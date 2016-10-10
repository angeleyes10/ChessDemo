import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;

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
		mainFrame.getContentPane().setLayout(null);
		//MainJP
		JPanel mainJp = new JPanel();
		//mainJp.setLayout(new GridLayout(2,2,2,2));
		mainJp.setBackground(Color.darkGray);
		
		//SpaceJP
		JPanel spaceJp = new JPanel();
		spaceJp.setBackground(Color.darkGray);
		spaceJp.setBounds(0, 0, 40, 40);
		//ColumnNameJP	
		JPanel columnNameJP = new JPanel(new GridLayout(1,8,2,2) );
		columnNameJP.setBackground(Color.gray);
		columnNameJP.setBounds(40, 0, 720,40);
		//RowNameJP	
		JPanel rowNameJP = new JPanel();
		rowNameJP.setLayout(new GridLayout(8,1,2,2));
		rowNameJP.setBackground(Color.gray);
		rowNameJP.setBounds(0, 40, 40, 720);
		char deckLetter = 'a';
		for(int j = 8 ; j > 0; j--){
			columnNameJP.add(new JLabel(""+deckLetter));
			rowNameJP.add(new JLabel(""+j));
			deckLetter++;
		}
		// Deck JPanel
		JPanel jp = new JPanel();
		jp.setBackground(Color.YELLOW);
		jp.setBounds(40, 40, 720, 720);
		GridLayout gl = new GridLayout(8, 8, 2, 2);
		jp.setLayout(gl);

		
		mainFrame.getContentPane().add(spaceJp);
		mainFrame.getContentPane().add(columnNameJP);
		mainFrame.getContentPane().add(rowNameJP);
		mainFrame.getContentPane().add(jp);
		/*mainJp.add(spaceJp);
		mainJp.add(columnNameJP);
		mainJp.add(rowNameJP);
		mainJp.add(jp);*/
		mainFrame.getContentPane().add(mainJp);

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
