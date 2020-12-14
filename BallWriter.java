import java.awt.*;

public class BallWriter{

	private Ball ball;
	public BallWriter(Ball b){
		ball =b;
	}

	public void paintComponent(Graphics g){
		g.setColor(Color.yellow);
		int radius = ball.radiusOf();
		g.fillOval(ball.xPosition() - radius, ball.yPosition() - radius, radius * 2, radius *2);
	}
}
