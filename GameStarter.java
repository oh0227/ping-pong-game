
public class GameStarter {

	public static void main(String[] args) {
		Net net = new Net();
		Ball ball = new Ball(net,20,20,10,5);
		Racket racket = new Racket();
		Racket_AI racket_ai = new Racket_AI(ball, net);
		RacketWriter rwriter = new RacketWriter(racket, racket_ai);
		NetWriter nwriter = new NetWriter(net);
		BallWriter bwriter = new BallWriter(ball);
		AnimationWriter aw = new AnimationWriter(ball, racket, racket_ai, net, nwriter, rwriter, bwriter);
		
		new AnimationController(ball, racket, aw).runAnimation();
	}

}
