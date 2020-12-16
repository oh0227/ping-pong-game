
import java.awt.event.*;

public class Racket{
	
	private int racket_x_pos;
	private int racket_y_pos;
	private int RACKET_WIDTH = 50;
	private int[] score = {0,0};
	
	public Racket(int rck_x, int rck_y) {
		racket_x_pos = rck_x;
		racket_y_pos = rck_y;
	}

	
	public void update(MouseEvent e) {
		racket_x_pos = e.getX();
		racket_y_pos = e.getY();
	}

	
	public int score1() {
		return score[0];
	}
	
	public int score2() {
		return score[1];
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
