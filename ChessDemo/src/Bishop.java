import java.awt.BorderLayout;
import java.awt.Component;

public class Bishop extends ChessMan{
	public static final String FILE_PATH = "src/img/bishop.jpg";

	public Bishop(String name) {
		this.name = name;
		cMDisplay = new ChessManDisplay(FILE_PATH);
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
