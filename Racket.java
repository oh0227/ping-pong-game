
import java.awt.event.*;

public class Racket{
	
	private int racket_x_pos;
	private int racket_y_pos;
	private int RACKET_WIDTH = 50;
	
	public Racket() {
		racket_x_pos = 50;
		racket_y_pos = 500;
	}

	
	public void update(MouseEvent e) {
		racket_x_pos = e.getX();
		racket_y_pos = e.getY();
	}
	
	

	public int xPosOf() {
		return racket_x_pos;
	}
	
	public int yPosOf() {
		return racket_y_pos;
	}
	public int widthOf() {
		return RACKET_WIDTH;
	}
}
