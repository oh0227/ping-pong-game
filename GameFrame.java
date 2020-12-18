import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame{
	
	public GameFrame() {
		Net net = new Net();
		Ball ball = new Ball(net);
		Racket racket = new Racket();
		Racket_AI racket_ai = new Racket_AI(ball, net);
		RacketWriter rwriter = new RacketWriter(racket, racket_ai);
		NetWriter nwriter = new NetWriter(net);
		BallWriter bwriter = new BallWriter(ball);
		AnimationWriter aw = new AnimationWriter(ball, racket, net, nwriter, rwriter, bwriter);
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(aw,BorderLayout.CENTER);
		JPanel p = new JPanel(new FlowLayout());
		p.add(new ExitButton("Exit"));
		cp.add(p, BorderLayout.SOUTH);
		setTitle("Ping-Pong!");
		setSize(net.fwidthOf(),net.fheightOf());
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		new AnimationController(ball, racket, racket_ai, aw).runAnimation();
	}
	

}
