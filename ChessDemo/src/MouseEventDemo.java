import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MouseEventDemo implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		BoxCell jp = (BoxCell) e.getSource();
		System.out.println(jp.getPlaceName());
		if(jp.isHasMan()){
			System.out.println(jp.placeName + " has " + jp.getChessMan().name);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
