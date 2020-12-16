import java.awt.*;

public class RacketWriter{
	
	private Racket racket; 
	
	public RacketWriter(Racket r) {
		racket = r;
	}
	
	/** paint - 공 그리기
	 * @param g - 그래픽스 펜 */
	public void paintComponent(Graphics g) {
		g.setColor(Color.RED);
		int radius = racket.widthOf();
		g.fillOval(racket.xPosOf() - radius, racket.yPosOf() - radius, radius * 2, radius * 2);
	}
}
