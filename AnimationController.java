import java.awt.event.*;

/** BounceController - 상자 안에서 움직이는 공 제어 */
public class AnimationController {
	private Ball ball; // 공 객체 (Model)
	private Racket racket;
	private Racket_AI racket_ai;
	private AnimationWriter writer; // 애니메이션 객체 (Output-View)
	
	
	public AnimationController(Ball b, Racket r, Racket_AI ra, AnimationWriter w) {
		ball = b;
		racket = r;
		racket_ai = ra;
		writer = w;
	}
	
	/** runAnimation - 내부 시계를 활용하여 애니메이션 구동 */
	public void runAnimation() {
		int time_unit = 1; // 애니메이션 스텝의 시간 단위
		int painting_delay = 10; // 다시 그리기 사이의 지연 시간 간격
		while (true) {
			delay(painting_delay);
			ball.move(time_unit, racket.xPosOf(), racket.yPosOf(), racket_ai.xPosOf(), racket_ai.yPosOf(), racket.widthOf());
			racket_ai.update();
			writer.repaint();
		}
	}
	
	/** delay - how_long millisecond 동안 실행 정지 */
	private void delay(int how_long) {
		try { Thread.sleep(how_long); }
		catch (InterruptedException e) { }
	} 
	
}
