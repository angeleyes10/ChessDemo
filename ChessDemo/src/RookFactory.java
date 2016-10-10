
public class RookFactory extends ChessManFactory {

	@Override
	public ChessMan CreateChessMan(String name) {
		// TODO Auto-generated method stub
		return new Rook(name);
	}

}
