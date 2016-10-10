import java.awt.Component;
import java.awt.List;
import java.util.ArrayList;

public class Main {

	public static final int pawnNumber = 8;
	public static final int queenNumber = 1;
	public static final int kingNumber = 1;
	public static final int rookNumber = 2;
	public static final int knightNumber = 2;
	public static final int bishopNumber = 2;

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
		
		Player player1 = new Player("Player-1");
		Player player2 = new Player("Player-2");
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
	}

	private void generateChessMan(Player p) {
		// TODO Auto-generated method stub
		for (int i = 0; i < rookNumber; i++) {
			p.getChessManList().add(rookFac.CreateChessMan("rook" + (i + 1)));
		}
		for (int i = 0; i < knightNumber; i++) {
			p.getChessManList().add(knightFac.CreateChessMan("knight" + (i + 1)));
		}
		for (int i = 0; i < bishopNumber; i++) {
			p.getChessManList().add(bishopFac.CreateChessMan("bishop" + (i + 1)));
		}
		for (int i = 0; i < queenNumber; i++) {
			p.getChessManList().add(queenFac.CreateChessMan("queen" + (i + 1)));
		}
		for (int i = 0; i < kingNumber; i++) {
			p.getChessManList().add(kingFac.CreateChessMan("king" + (i + 1)));
		}
		for (int i = 0; i < pawnNumber; i++) {
			p.getChessManList().add(pawnFac.CreateChessMan("pawn" + (i + 1)));
		}
	}
	
	private void drawChessMan(Player p, Display ds){
		ArrayList<ChessMan> chessMans = (ArrayList<ChessMan>) p.getChessManList();
		ArrayList boxes = (ArrayList) ds.boxList;
		
		/*for(ChessMan c : chessMans){
			c.draw(ds.boxList.get(startInd));
		}*/
		chessMans.get(0).draw(ds.boxList.get(0));
		chessMans.get(1).draw(ds.boxList.get(7));
		chessMans.get(2).draw(ds.boxList.get(1));
		chessMans.get(3).draw(ds.boxList.get(6));
		chessMans.get(4).draw(ds.boxList.get(2));
		chessMans.get(5).draw(ds.boxList.get(5));
		chessMans.get(6).draw(ds.boxList.get(3));
		chessMans.get(7).draw(ds.boxList.get(4));
		for(int i = 8 ; i <16;i++ ){
			chessMans.get(i).draw(ds.boxList.get(i));
		}
	}

}
