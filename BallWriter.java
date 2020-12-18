import java.awt.*;

/** BallWriter - 움직이는 공을 그림 */
public class BallWriter {
	
	private Ball ball; // 공 객체
	public BallWriter(Ball x) {
		ball = x;
	}
	
	/** paint - 공 그리기
	 * @param g - 그래픽스 펜 */
	public void paintComponent(Graphics g) {
		g.setColor(Color.yellow);
		int radius1 = ball.radiusOf();
		g.fillOval(ball.xPosition() - radius1, ball.yPosition() - radius1, radius1 * 2, radius1 * 2);
	}

}