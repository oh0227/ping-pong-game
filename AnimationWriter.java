import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** AnimationWriter - 상자와 공의 애니메이션 디스플레이 */

public class AnimationWriter extends JPanel implements MouseMotionListener{
	
	private NetWriter net_writer;
	private RacketWriter racket_writer;
	private Racket racket;
	private BallWriter ball_writer;
	
	
	public AnimationWriter(Racket ra, NetWriter n, RacketWriter r,BallWriter l) {
		racket = ra;
		net_writer = n;
		racket_writer = r;
		ball_writer = l;
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle("Ping-Pong!");
		f.setSize(1512,770);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		addMouseMotionListener(this); 
	}
	
	
	/** paintComponent - 공과 상자 그리기
	 * @param g - 그래픽스 펜 */
	public void paintComponent(Graphics g) {
		net_writer.paintComponent(g);
		racket_writer.paintComponent(g);
		ball_writer.paintComponent(g);
	}
	
	public void mouseDragged(MouseEvent e) {  
//	    g.setColor(Color.BLUE);  
//	    g.fillOval(e.getX(),e.getY(),20,20);  
//	    new RacketWriter(new Racket(e.getX(),e.getY()));
	}  
	public void mouseMoved(MouseEvent e) {
		racket.update(e);
	}  
}