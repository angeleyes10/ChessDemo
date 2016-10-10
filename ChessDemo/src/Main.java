import java.awt.Component;
import java.awt.List;
import java.util.ArrayList;

public class Main {

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display ds = new Display();

		Main m = new Main();

		Player player1 = new Player("Player1");
		Player player2 = new Player("Player2");
		m.generateChessMan(player1);
		m.generateChessMan(player2);
		m.drawChessMan(player1, ds);
		m.drawChessMan(player2, ds);

		/*
		 * ChessMan pawn1 = new Pawn("pawn1"); pawn1.draw(ds.boxList.get(8));
		 * 
		 * ChessMan pawn2 = new Pawn("pawn2"); pawn2.draw(ds.boxList.get(9));
		 * 
		 * ChessMan pawn3 = new Pawn("pawn3"); pawn3.draw(ds.boxList.get(10));
		 * 
		 * ChessMan pawn4 = new Pawn("pawn4"); pawn4.draw(ds.boxList.get(11));
		 * 
		 * ChessMan pawn5 = new Pawn("pawn5"); pawn5.draw(ds.boxList.get(12));
		 * 
		 * ChessMan pawn6 = new Pawn("pawn6"); pawn6.draw(ds.boxList.get(13));
		 * 
		 * ChessMan pawn7 = new Pawn("pawn7"); pawn7.draw(ds.boxList.get(14));
		 * 
		 * ChessMan pawn8 = new Pawn("pawn8"); pawn8.draw(ds.boxList.get(15));
		 */
		System.err.println();
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
		} 
		else {
			for (int i = 0; i < 16; i++) {
				if (i < 8){
					chessMans.get(i).draw(ds.boxList.get(chessManIndex[i] + 56));
					ds.boxList.get(chessManIndex[i] + 56).setHasMan(true);
					ds.boxList.get(chessManIndex[i] + 56).setChessMan(chessMans.get(i));
				}
				else{
					chessMans.get(i).draw(ds.boxList.get(i + 40));
					ds.boxList.get(i + 40).setHasMan(true);
					ds.boxList.get(i + 40).setChessMan(chessMans.get(i));
//					ds.boxList.get(chessManIndex[i-8]+48).setHasMan(true);
//					ds.boxList.get(chessManIndex[i-8]+48).setChessMan(chessMans.get(i));
				}
			}

		}
	}

}
