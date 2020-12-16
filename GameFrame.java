import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame{
	private AnimationWriter animation;
	private NetWriter net;
	private RacketWriter racket;
	private BallWriter ballwriter;
	private AnimationController controller;
	
	public GameFrame() {
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		JPanel p = new JPanel();
		p.add(animation);
		setTitle("Bounce");
		setSize(600, 700);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		controller.runAnimation();
	}
	
	/** 공과 라켓의 상태를 업데이트 */ 
	public void update() {
		
	}

}
