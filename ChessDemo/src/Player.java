import java.util.ArrayList;
import java.util.List;

public class Player {

	public String name; 
	private List<ChessMan> chessManList = new ArrayList<ChessMan>();
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public Player(String string) {
		// TODO Auto-generated constructor stub
		name = string;
	}
	public List<ChessMan> getChessManList() {
		return chessManList;
	}
	public void setChessManList(List<ChessMan> chessManList) {
		this.chessManList = chessManList;
	}
	
	
	
}
