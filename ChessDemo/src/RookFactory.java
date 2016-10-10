
public class RookFactory extends ChessManFactory {

	@Override
	public ChessMan CreateChessMan(String name, String playerName) {
		// TODO Auto-generated method stub
		return new Rook(name, playerName);
	}

}
