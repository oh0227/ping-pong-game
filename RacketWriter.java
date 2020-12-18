import java.awt.*;

public class RacketWriter{
	
	private Racket racket; 
	private Racket_AI racket_ai;
	
	public RacketWriter(Racket r, Racket_AI ra) {
		racket = r;
		racket_ai = ra;
	}
	
	/** paint - 공 그리기
	 * @param g - 그래픽스 펜 */
	public void paintComponent(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.fill3DRect(racket.xPosOf()-10, racket.yPosOf(), 20, 100, true);
		g.fill3DRect(racket_ai.xPosOf()-10, racket_ai.yPosOf(), 20, 100, true);
		g.setColor(Color.RED);
		int radius = racket.widthOf();
		g.fillOval(racket.xPosOf() - radius, racket.yPosOf() - radius, radius * 2, radius * 2);
		g.fillOval(racket_ai.xPosOf() - radius, racket_ai.yPosOf() - radius, radius * 2, radius * 2);
	}
}
