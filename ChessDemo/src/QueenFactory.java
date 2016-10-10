
public class QueenFactory extends ChessManFactory {

	@Override
	public ChessMan CreateChessMan(String name, String playerName) {
		// TODO Auto-generated method stub
		return new Queen(name, playerName);
	}

}
