
public class Net {
	
	private int NET_WIDTH = 1500;
	private int NET_HEIGHT = 750;
	private int FRAME_WIDTH = NET_WIDTH+NET_WIDTH/8;
	private int FRAME_HEIGHT = NET_HEIGHT+NET_HEIGHT/3;
	private int[] score = {0,0};
	
	public Net() {}
	

	public boolean inHorizontalContact(int x_position) {
		return (x_position <= 10) || (x_position >= FRAME_WIDTH-10);
	}
	
	public boolean inVerticalContact(int y_position) {
		return (y_position <= 10) || (y_position >= FRAME_HEIGHT-10);
	}
	
	public void scoring(int x_position, int y_position) {
		if(x_position < FRAME_WIDTH/2) 
			score[1]++;
		else 
			score[0]++;
	}
	
	public int score1() {
		return score[0];
	}
	
	public int score2() {
		return score[1];
	}
	
	
	public int widthOf() {
		return NET_WIDTH;
	}
	public int heightOf() {
		return NET_HEIGHT;
	}
	public int fwidthOf() {
		return FRAME_WIDTH;
	}
	public int fheightOf() {
		return FRAME_HEIGHT;
	}
	
	

}
