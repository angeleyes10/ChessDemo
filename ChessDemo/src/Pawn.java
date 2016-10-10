import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pawn extends ChessMan {

	public static final String FILE_PATH1 = "src/img/pawn.jpg";
	public static final String FILE_PATH2 = "src/img/pawn2.jpg";

	public Pawn(String name,String playerName) {
		this.name = name;
		if( playerName.equals("Player1"))
			cMDisplay = new ChessManDisplay(FILE_PATH1);
		else{
			cMDisplay = new ChessManDisplay(FILE_PATH2);
		}
	}

	@Override
	public void draw(BoxCell jp) {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println("in pawn draw method");
		jp.add(cMDisplay,BorderLayout.CENTER);
		jp.setAlignmentX(Component.CENTER_ALIGNMENT);
		jp.repaint();
		jp.setVisible(true);

	}

}
