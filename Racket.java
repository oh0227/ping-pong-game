public class Racket{

	private int racket_x_pos;
	private int racket_y_pos;
	private int racket_width;

	/* Constructor Racket - 라켓 생성
	   * @param rck_x - 라켓의 x 좌표
	   * @param rck_y - 라켓의 y 좌표
	   * @param rck_width - 라켓의 너비 */
	public Racket(int rck_x, int rck_y, int rck_width){
		racket_x_pos = rck_x;
		racket_y_pos = rck_y;
		rakcet_width = rck_width;
	}
	
	/** racketContact - 공이 장애물과 만났는지 여부를 리턴
	  * @param x_position - 공의 x 좌표
	  * @param y_position - 공의 y 좌표
	  * @param x_velocity - 공의 x축 속도
	  * @param return - 공의 x좌표가 라켓에 닿으면 true, 그렇지 않으면 false */
	public boolean racketContact(int x_position, int y_position, int x_velocity){
		if((y_position >= rck_x_pos) && (y_position <= rck_y_pos + rck_width)){
			if((x_velocity > 0) && (x_position <= rck_x_pos))
				return (x_position >= rck_x_pos);
			else if((x_velocity < 0) && (y_position >= rck_x_pos))
				return (x_position <= rck_y_pos);
			else
				return false;
		}
		else
			return false;
	}

