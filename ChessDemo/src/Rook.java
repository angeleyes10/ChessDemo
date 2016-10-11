import java.awt.BorderLayout;
import java.awt.Component;

public class Rook extends ChessMan {
	public static final String FILE_PATH1 = "src/img/rook.jpg";
	public static final String FILE_PATH2 = "src/img/rook2.jpg";

	public Rook() {
		// TODO Auto-generated constructor stub
	}

	public Rook(String name,String playerName) {
		this.name = name;
		this.team = playerName;
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
		//System.out.println("in pawn draw method");
		jp.add(cMDisplay,BorderLayout.CENTER);
		jp.setAlignmentX(Component.CENTER_ALIGNMENT);
		jp.repaint();
		jp.setVisible(true);

	}

}
