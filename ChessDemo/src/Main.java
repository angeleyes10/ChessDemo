import java.awt.Component;
import java.awt.List;
import java.util.ArrayList;

public class Main {

	public static Display ds;

	public static Game g;

	public static Player activePlayer = new Player();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ds = new Display();

		g = new Game();
		activePlayer = g.player1;
		g.startGame(activePlayer);
		/*
		 * Main m = new Main();
		 * 
		 * Player player1 = new Player("Player1"); Player player2 = new
		 * Player("Player2"); m.generateChessMan(player1);
		 * m.generateChessMan(player2); m.drawChessMan(player1, ds);
		 * m.drawChessMan(player2, ds);
		 */

	}

}
