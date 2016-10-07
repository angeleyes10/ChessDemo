import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Display extends JFrame{

	public JFrame mainFrame;
	public Display(){
		System.out.println("as");
		initializeTools();
	}
	public void initializeTools(){
		//JPanel
		for(int i = 0 ; i < 8 ; i++){
			new JPanel();
		}
		JPanel jp = new JPanel();
		jp.setBackground(Color.BLUE);
		GridLayout gl = new GridLayout(8, 8, 8, 8);
		//gl.add(new JPanel)

		//JFrame
		mainFrame = new JFrame();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLayout(gl);
		mainFrame.setSize(600, 600);
		
		Color wColor = Color.WHITE;
		Color bColor = Color.BLACK;
		Color color = wColor;
		for(int i = 0 ; i < 64 ; i++){
			
			if( i % 2 == 0 || i % 8 == 0)
				color = changeColor(color);
						
				mainFrame.add(new JPanels(color));				
		}

		mainFrame.getContentPane();
		
		mainFrame.pack();
		mainFrame.setVisible(true); 

	}
	public Color changeColor(Color currentColor){
		Color wColor = Color.WHITE;
		Color bColor = Color.BLACK;
		return ( currentColor == wColor ) ? bColor : wColor;
	}
	
}
