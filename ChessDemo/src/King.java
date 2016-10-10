import java.awt.BorderLayout;
import java.awt.Component;

public class King extends ChessMan {

	public static final String FILE_PATH = "src/img/king.jpg";

	public King() {
		// TODO Auto-generated constructor stub
	}

	public King(String name) {
		this.name = name;
		cMDisplay = new ChessManDisplay(FILE_PATH);
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
