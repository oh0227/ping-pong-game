import java.awt.event.*;

public class Ball {
	private int x_pos;
	private int y_pos;
	private int radius;
	
	private int x_velocity;
	private int y_velocity;
	
	private Net net;
	
	public Ball(Net n) {
		net = n;
		x_pos = 20;
		y_pos = 20;
		radius = 10;
		x_velocity = 10;
		y_velocity = 5;
	}
	
	public void move(int time_units, int racket_x_pos, int racket_y_pos, int ai_x_pos, int ai_y_pos, int racket_radius) {
		x_pos = x_pos + x_velocity + time_units;
		y_pos = y_pos + y_velocity + time_units;
		if(net.inHorizontalContact(x_pos) || net.inVerticalContact(y_pos)) {
			net.scoring(x_pos, y_pos);
			x_pos = 20;
			y_pos = 20;
			x_velocity = 10;
			y_velocity = 5;
		}
		meet(racket_x_pos,racket_y_pos,racket_radius);
		meet(ai_x_pos,ai_y_pos,racket_radius);
	}
	
	
	private void meet(int racket_x, int racket_y,int racket_r) {
		int x = x_pos - racket_x;
		int y = y_pos - racket_y;
		int distance = (int)(Math.sqrt(x*x + y*y));
		int random_x = (int)(10*Math.random());
		int random_y = (int)(5*Math.random());
		if(distance < radius + racket_r) {
			if(racket_x < x_pos) {
				if(racket_y < y_pos) {
					x_velocity = random_x;
					y_velocity = random_y;
				}
				else if(racket_y > y_pos) {
					x_velocity = random_x;
					y_velocity = -random_y;
				}
				else
					x_velocity = 10;
			}
			else if(racket_x > x_pos) {
				if(racket_y < y_pos) {
					x_velocity = -random_x;
					y_velocity = random_y;
				}
				else if(racket_y > y_pos) {
					x_velocity = -random_x;
					y_velocity = -random_y;
				}
				else
					x_velocity = -10;
			}
			else
				if(racket_y < y_pos) {
					y_velocity = 10;
				}
				else{
					y_velocity = -10;
				}
			
		}
	}
	public void restart(MouseEvent e) {
		x_pos = net.fwidthOf()/3;
		y_pos = net.fheightOf()/3;
		x_velocity = 0;
		y_velocity = 0;
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
	public int yVelocity() {
		return y_velocity;
	}
	
	public int radiusOf() {
		return radius;
	}
}
