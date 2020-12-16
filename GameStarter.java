
public class GameStarter {

	public static void main(String[] args) {
		Racket racket = new Racket(10,10);
		int[] s = {0,0};
		Net net = new Net(s);
		Ball ball = new Ball(racket, net,20,20,20,20);
		RacketWriter rwriter = new RacketWriter(racket);
		NetWriter nwriter = new NetWriter(net);
		BallWriter bwriter = new BallWriter(ball);
		AnimationWriter aw = new AnimationWriter(racket, nwriter, rwriter, bwriter);
		
		new AnimationController(ball, racket, aw).runAnimation();
	}

}
