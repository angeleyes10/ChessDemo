import java.awt.BorderLayout;
import java.awt.Component;

public class Queen extends ChessMan {
	public static final String FILE_PATH1 = "src/img/queen.jpg";
	public static final String FILE_PATH2 = "src/img/queen2.jpg";

	public Queen() {
		// TODO Auto-generated constructor stub
	}

	public Queen(String name, String playerName) {
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
