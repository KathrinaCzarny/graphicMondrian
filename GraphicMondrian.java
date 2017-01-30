//	Kathrina Czarny
//	CSC 142
//	07.22.16
//	Wk4_Practice Exercise

//	Recreating Piet Mondrian's "Composition II in Red, Blue, and Yellow" using Java graphics

import java.awt.*; //for graphics



public class GraphicMondrian {

		public static void main(String[] args) {
			DrawingPanel panel = new DrawingPanel(500,500);
			panel.setBackground(Color.BLACK);			
			Graphics g = panel.getGraphics();
				
			//calling methods with x, y coordinates set to 0 (adjusted in methods)
			White(g, 0, 0);
			Yellow(g, 0, 0);
			Red(g, 0, 0);
			Blue(g, 0,0);
			Writing(g, 0,0);
			
			//calling methods
			LineSquare(g, 10, 90); //can set any square using coordinates: top left, bottom right
			}		
		
		public static void LineSquare(Graphics g, int x, int y) { 		//shape using lines
			g.setColor(Color.CYAN);
			g.drawLine(x, x, x, y );
			g.drawLine(x, y, y, y );
			g.drawLine(y, y, y, x);
			g.drawLine(y, x, x, x);	
		}
	
		public static void Writing(Graphics g, int x, int y) {
			g.setColor(Color.WHITE);
			g.setFont(new Font("SansSerif", Font.PLAIN, 75));
			g.drawString("Mondrian", x+125, y+350);
		}
		
		public static void Blue(Graphics g, int x, int y) {
			g.setColor(new Color(0, 0, 204));
			g.drawRect(x+10, 350, 80, 140);
			g.fillRect(x+10, 350, 80, 140);
		}
		
		public static void Red(Graphics g, int x, int y) {
			g.setColor(Color.RED);
			g.drawRect(x+100, y+10, 390, 330);
			g.fillRect(x+100, y+10, 390, 330);
		}
		
		public static void Yellow(Graphics g, int x, int y) {
			g.setColor(Color.YELLOW);
			g.drawRect(x+410, y+425, 80, 65);
			g.fillRect(x+410, y+425, 80, 65);

		}
	
		public static void White(Graphics g, int x, int y) {
			g.setColor(Color.WHITE);
			g.drawRect(x+10, y+10, 80, 80); 	//box 1
			g.fillRect(x+10, y+10, 80, 80);
			
			g.drawRect(x+10, y+110, 80, 230); 	//box 2
			g.fillRect(x+10, y+110, 80, 230);
			
			g.drawRect(x+100, y+350, 300, 140);	//box 3
			g.fillRect(x+100, y+350, 300, 140);
		
			g.drawRect(x+410, y+350, 80, 60);	//box 4
			g.fillRect(x+410, y+350, 80, 60);
		}
	

	}
