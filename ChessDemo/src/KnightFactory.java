
public class KnightFactory extends ChessManFactory {

	@Override
	public Knight CreateChessMan(String name, String playerName) {
		// TODO Auto-generated method stub
		return new Knight(name, playerName);
	}

}
