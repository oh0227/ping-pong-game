

public class Racket_AI extends Racket{
	
	private Ball ball;
	private Net net;
	private int racket_x_pos;
	private int racket_y_pos;
	private int RACKET_WIDTH = 50;
	
	public Racket_AI(Ball b, Net n) {
		ball = b;
		net = n;
		racket_x_pos = net.widthOf();
		racket_y_pos = ball.yPosition()-100;
	}

	
	public void update() {
		racket_y_pos = ball.yPosition()-100;
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
