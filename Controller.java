package FinalProject_108403007;

import javafx.scene.shape.*;

public class Controller {
	
	// Variables Definition
	public static final int MOVE = FinalProject_108403007.MOVE;
	public static final int SIZE = FinalProject_108403007.SIZE;
	public static int XMAX = FinalProject_108403007.XMAX;
	public static int YMAX = FinalProject_108403007.YMAX;
	public static int[][] MESH = FinalProject_108403007.MESH;

	// Change Directions according to numbers
	public static Form makeRect() {
		
		int STONE = (int) (Math.random() * 100);
		String StoneName;
		Rectangle StoneA = new Rectangle(SIZE-1, SIZE-1);
		Rectangle StoneB = new Rectangle(SIZE-1, SIZE-1);
		Rectangle StoneC = new Rectangle(SIZE-1, SIZE-1);
		Rectangle StoneD = new Rectangle(SIZE-1, SIZE-1);
		
		if (STONE < 15) { 
			
			StoneA.setX(XMAX / 2 - SIZE);
			StoneB.setX(XMAX / 2 - SIZE);
			StoneB.setY(SIZE);
			StoneC.setX(XMAX / 2);
			StoneC.setY(SIZE);
			StoneD.setX(XMAX / 2 + SIZE);
			StoneD.setY(SIZE);
			StoneName = "j";
			
		} else if (STONE < 30) { 
			
			StoneA.setX(XMAX / 2 + SIZE);
			StoneB.setX(XMAX / 2 - SIZE);
			StoneB.setY(SIZE);
			StoneC.setX(XMAX / 2);
			StoneC.setY(SIZE);
			StoneD.setX(XMAX / 2 + SIZE);
			StoneD.setY(SIZE);
			StoneName = "l";
			
		} else if (STONE < 45) {
			
			StoneA.setX(XMAX / 2 - SIZE);
			StoneB.setX(XMAX / 2);
			StoneC.setX(XMAX / 2 - SIZE);
			StoneC.setY(SIZE);
			StoneD.setX(XMAX / 2);
			StoneD.setY(SIZE);
			StoneName = "o";
			
		} else if (STONE < 60) { 
			
			StoneA.setX(XMAX / 2 + SIZE);
			StoneB.setX(XMAX / 2);
			StoneC.setX(XMAX / 2);
			StoneC.setY(SIZE);
			StoneD.setX(XMAX / 2 - SIZE);
			StoneD.setY(SIZE);
			StoneName = "s";
			
		} else if (STONE < 75) { 
			
			StoneA.setX(XMAX / 2 - SIZE);
			StoneB.setX(XMAX / 2);
			StoneC.setX(XMAX / 2);
			StoneC.setY(SIZE);
			StoneD.setX(XMAX / 2 + SIZE);
			StoneName = "t";
			
		} else if (STONE < 90) { 
			
			StoneA.setX(XMAX / 2 + SIZE);
			StoneB.setX(XMAX / 2);
			StoneC.setX(XMAX / 2 + SIZE);
			StoneC.setY(SIZE);
			StoneD.setX(XMAX / 2 + SIZE + SIZE);
			StoneD.setY(SIZE);
			StoneName = "z";
			
		} else { 
			
			StoneA.setX(XMAX / 2 - SIZE - SIZE);
			StoneB.setX(XMAX / 2 - SIZE);
			StoneC.setX(XMAX / 2);
			StoneD.setX(XMAX / 2 + SIZE);
			StoneName = "i";
			
		}
		
		return new Form(StoneA, StoneB, StoneC, StoneD, StoneName);
		
	}
	
	// Left Moving
	public static void MoveLeft(Form form) {
		
		if (form.a.getX() - MOVE >= 0 && form.b.getX() - MOVE >= 0 && form.c.getX() - MOVE >= 0 && form.d.getX() - MOVE >= 0) {
			
			int movA = MESH[((int) form.a.getX() / SIZE) - 1][((int) form.a.getY() / SIZE)];
			int movB = MESH[((int) form.b.getX() / SIZE) - 1][((int) form.b.getY() / SIZE)];
			int movC = MESH[((int) form.c.getX() / SIZE) - 1][((int) form.c.getY() / SIZE)];
			int movD = MESH[((int) form.d.getX() / SIZE) - 1][((int) form.d.getY() / SIZE)];
			
			if (movA == 0 && movA == movB && movB == movC && movC == movD) {
				
				form.a.setX(form.a.getX() - MOVE);
				form.b.setX(form.b.getX() - MOVE);
				form.c.setX(form.c.getX() - MOVE);
				form.d.setX(form.d.getX() - MOVE);
				
			}
			
		}
		
	}
	
	// Right Moving
	public static void MoveRight(Form form) {
		
		if (form.a.getX() + MOVE <= XMAX - SIZE && form.b.getX() + MOVE <= XMAX - SIZE && form.c.getX() + MOVE <= XMAX - SIZE && form.d.getX() + MOVE <= XMAX - SIZE) {
			
			int movA = MESH[((int) form.a.getX() / SIZE) + 1][((int) form.a.getY() / SIZE)];
			int movB = MESH[((int) form.b.getX() / SIZE) + 1][((int) form.b.getY() / SIZE)];
			int movC = MESH[((int) form.c.getX() / SIZE) + 1][((int) form.c.getY() / SIZE)];
			int movD = MESH[((int) form.d.getX() / SIZE) + 1][((int) form.d.getY() / SIZE)];
			
			if (movA == 0 && movA == movB && movB == movC && movC == movD) {
				
				form.a.setX(form.a.getX() + MOVE);
				form.b.setX(form.b.getX() + MOVE);
				form.c.setX(form.c.getX() + MOVE);
				form.d.setX(form.d.getX() + MOVE);
				
			}
			
		}
		
	}
}