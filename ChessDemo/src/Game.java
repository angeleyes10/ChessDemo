import java.util.ArrayList;

public class Game {
	private static final int pawnNumber = 8;
	private static final int queenNumber = 1;
	private static final int kingNumber = 1;
	private static final int rookNumber = 2;
	private static final int knightNumber = 2;
	private static final int bishopNumber = 2;

	ChessManFactory pawnFac = new PawnFactory();
	ChessManFactory queenFac = new QueenFactory();
	ChessManFactory kingFac = new KingFactory();
	ChessManFactory rookFac = new RookFactory();
	ChessManFactory knightFac = new KnightFactory();
	ChessManFactory bishopFac = new BishopFactory();

	public Player activePlayer;
	public Player player1; 
	public Player player2;
	public boolean played;
	Display ds;
	public Game() {
		// TODO Auto-generated constructor stub
		//Main m = new Main();
		player1 = new Player("Player1");
		player2 = new Player("Player2");
		
		ds = Main.ds;
		
		generateChessMan(player1);
		generateChessMan(player2);
		drawChessMan(player1, ds);
		drawChessMan(player2, ds);
		
	}

	public void startGame(Player active){
		System.out.println("Game starts..");
		played = false;
		while(!played){
			System.out.println("Player 1 plays");
		}
	}
	
	private void generateChessMan(Player p) {
		// TODO Auto-generated method stub
		ArrayList<ChessMan> chessMan = new ArrayList<ChessMan>();
		for (int i = 0; i < rookNumber; i++) {
			chessMan.add(rookFac.CreateChessMan("rook" + (i + 1), p.name));
		}
		for (int i = 0; i < knightNumber; i++) {
			chessMan.add(knightFac.CreateChessMan("knight" + (i + 1), p.name));
		}
		for (int i = 0; i < bishopNumber; i++) {
			chessMan.add(bishopFac.CreateChessMan("bishop" + (i + 1), p.name));
		}
		for (int i = 0; i < queenNumber; i++) {
			chessMan.add(queenFac.CreateChessMan("queen" + (i + 1), p.name));
		}
		for (int i = 0; i < kingNumber; i++) {
			chessMan.add(kingFac.CreateChessMan("king" + (i + 1), p.name));
		}
		for (int i = 0; i < pawnNumber; i++) {
			chessMan.add(pawnFac.CreateChessMan("pawn" + (i + 1), p.name));
		}
		p.setChessManList(chessMan);
	}

	private void drawChessMan(Player p, Display ds) {
		ArrayList<ChessMan> chessMans = (ArrayList<ChessMan>) p.getChessManList();
		int[] chessManIndex = { 0, 7, 1, 6, 2, 5, 3, 4 };
		if (p.name.equals("Player1")) {
			for (int i = 0; i < 16; i++) {
				if (i < 8)
					chessMans.get(i).draw(ds.boxList.get(chessManIndex[i]));
				else
					chessMans.get(i).draw(ds.boxList.get(i));

				ds.boxList.get(i).setHasMan(true);
				ds.boxList.get(i).setChessMan(chessMans.get(i));
			}
		} else {
			for (int i = 0; i < 16; i++) {
				if (i < 8) {
					chessMans.get(i).draw(ds.boxList.get(chessManIndex[i] + 56));
					ds.boxList.get(chessManIndex[i] + 56).setHasMan(true);
					ds.boxList.get(chessManIndex[i] + 56).setChessMan(chessMans.get(i));
				} else {
					chessMans.get(i).draw(ds.boxList.get(i + 40));
					ds.boxList.get(i + 40).setHasMan(true);
					ds.boxList.get(i + 40).setChessMan(chessMans.get(i));
				}
			}
		}
	}

}
