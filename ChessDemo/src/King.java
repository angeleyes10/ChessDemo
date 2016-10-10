import java.awt.BorderLayout;
import java.awt.Component;

public class King extends ChessMan {

	public static final String FILE_PATH1 = "src/img/king.jpg";
	public static final String FILE_PATH2 = "src/img/king2.jpg";

	public King() {
		// TODO Auto-generated constructor stub
	}

	public King(String name, String playerName) {
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
		jp.add(cMDisplay, BorderLayout.CENTER);
		jp.setAlignmentX(Component.CENTER_ALIGNMENT);
		jp.repaint();
		jp.setVisible(true);

	}
}
