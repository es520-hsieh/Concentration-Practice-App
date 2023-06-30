package FinalProject_108403007;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Form {
	
	Rectangle a;
	Rectangle b;
	Rectangle c;
	Rectangle d;
	Color color;
	private String name;
	public int form = 1;

	public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		a.setArcHeight(10.0d);
        a.setArcWidth(10.0d);
        b.setArcHeight(10.0d);
        b.setArcWidth(10.0d);
        c.setArcHeight(10.0d);
        c.setArcWidth(10.0d);
        d.setArcHeight(10.0d);
        d.setArcWidth(10.0d);
		
	}

	public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d, String name) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.name = name;
		
		a.setArcHeight(10.0d);
        a.setArcWidth(10.0d);
        b.setArcHeight(10.0d);
        b.setArcWidth(10.0d);
        c.setArcHeight(10.0d);
        c.setArcWidth(10.0d);
        d.setArcHeight(10.0d);
        d.setArcWidth(10.0d);

		switch (name) {
		
			case "j":
				color = Color.CORNFLOWERBLUE;
				break;
			case "l":
				color = Color.CORAL;
				break;
			case "o":
				color = Color.SADDLEBROWN;
				break;
			case "s":
				color = Color.GOLD;
				break;
			case "t":
				color = Color.OLIVEDRAB;
				break;
			case "z":
				color = Color.MEDIUMVIOLETRED;
				break;
			case "i":
				color = Color.ROYALBLUE;
				break;

		}
		
		this.a.setFill(color);
		this.b.setFill(color);
		this.c.setFill(color);
		this.d.setFill(color);
		
	}

	public String getName() {
		
		return name;
		
	}

	public void changeForm() {
		
		if (form != 4) {
			
			form++;
			
		} else {
			
			form = 1;
			
		}
		
	}
	
}