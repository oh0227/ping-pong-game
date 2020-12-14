import java.awt.*;

public class RacketWriter{
	private Racket racket;

	public RacketWriter(Racket r){
		racket = r;
	}

	public void paintComponent(Graphics g){
		g,setColor(Color.yellow);
		int radius = racket.widthOf();
		g.fillOval(racket.xPosOf() - radius, racket.yPosOf() - radius, radius * 2, radius * 2);
	}
}
