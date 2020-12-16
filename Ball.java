
public class Ball {
	private int x_pos;
	private int y_pos;
	private int radius;
	
	private int x_velocity;
	private int y_velocity;
	
	private Racket racket;
	private Net net;
	
	public Ball(Racket rck, Net n, int x_initial, int y_initial,  int x_init_velocity, int y_init_velocity) {
		racket = rck;
		net = n;
		x_pos = x_initial;
		y_pos = y_initial;
		radius = 10;
		x_velocity = x_init_velocity;
		y_velocity = y_init_velocity;
	}
	
	public void move(int time_units, int racket_x_pos, int racket_y_pos, int racket_radius) {
		x_pos = x_pos + x_velocity + time_units;
		y_pos = y_pos + y_velocity + time_units;
		if(net.inHorizontalContact(x_pos)) 
			x_velocity = -x_velocity;
		if(net.inVerticalContact(y_pos)) 
			y_velocity = -y_velocity;
		int x = x_pos - racket_x_pos;
		int y = y_pos - racket_y_pos;
		int distance = (int)(Math.sqrt(x*x + y*y));
		if(distance < radius + racket_radius) {
			x_velocity = - x_velocity;
			y_velocity = - y_velocity;
		}
	}
	
	public int xPosition() {
		return x_pos;
	}
	
	public int yPosition() {
		return y_pos;
	}
	
	public int xVelocity() {
		return x_velocity;
	}
	
	public int radiusOf() {
		return radius;
	}
}
