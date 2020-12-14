public class Ball{
	private int x_pos;
	private int y_pos;
	private int radius;

	private int x_velocity;
	private int y_velocity;

	private Racket racket;
	private Net net;

	/** Constructor Ball - 공 만들기
	  * @param x_initial - 공의 중심 x 좌표
	  * @param y_initial - 공의 중심 y 좌표
	  * @param r - 공의 반지름
	  * @param x_init_velocity - 공의 초기 x축 속도 */
	public Ball(Racket rck, int x_initial, int y_initital, int r, int x_init_velocity, int y_init_velocity){
		racket = r;
		x_pos = x_initial;
		y_pos = y_initial;
		radius = r;
		x_velocity = x_init_velocity;
		y_velocity = y_init_velocity;
	}
	

	/** move - time_units 만큼 공을 이돌, 벽에 부딪히면 방향을 바꿈, 라켓과 부딪히면 방향을 바꿈
	  * @param time_units - 프레임 사이의 시간 */
	public void move(int time_units){
		x_pos = x_pos + x_velocity * time_units;
		if(racket.receive(x_pos, y_pos, x_velocity)){
			x_pos = -x_pos;
			y_pos = -y_pos;
		}

	}


	/** xPosition - 공의 x축 위치 리턴 */
	public int xPosition(){
		return x_pos;
	}

	/** yPosition - 공의 y축 위치 리턴 */
	public int yPosition(){
		return y_pos;
	}

	/** xVelocity - 공의 x축 속도 리턴 */
	public int xVelocity(){
		return x_velocity;
	}

	/** radiusOf - 공의 반지름 리턴 */
	public int radiusOf(){
		return radius;
	}
}
