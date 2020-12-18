import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** AnimationWriter - 상자와 공의 애니메이션 디스플레이 */

public class AnimationWriter extends JPanel implements MouseMotionListener{
	
	private Ball ball;
	private Racket racket1;
	private Net net;
	private NetWriter net_writer;
	private RacketWriter racket_writer;
	private BallWriter ball_writer;
	
	
	public AnimationWriter(Ball b, Racket ra1, Net n, NetWriter nw, RacketWriter r,BallWriter l) {
		ball = b;
		racket1 = ra1;
		net = n;
		net_writer = nw;
		racket_writer = r;
		ball_writer = l;
//		JFrame f = new JFrame();
//		f.getContentPane().add(this);
//		f.setTitle("Ping-Pong!");
//		f.setSize(net.fwidthOf(),net.fheightOf());
//		f.setVisible(true);
//		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
		ball.restart(e);
	}  
	public void mouseMoved(MouseEvent e) {
		racket1.update(e);
	}  
}