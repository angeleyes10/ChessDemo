import java.awt.BorderLayout;
import java.awt.Component;

public class Knight extends ChessMan {
	public static final String FILE_PATH1 = "src/img/knigth.jpg";
	public static final String FILE_PATH2 = "src/img/knight2.jpg";

	public Knight() {
		// TODO Auto-generated constructor stub
	}

	public Knight(String name, String playerName) {
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
		//System.out.println("in pawn draw method");
		jp.add(cMDisplay,BorderLayout.CENTER);
		jp.setAlignmentX(Component.CENTER_ALIGNMENT);
		jp.repaint();
		jp.setVisible(true);

	}


}
