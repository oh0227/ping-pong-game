
public class Net {
	
	private int NET_WIDTH = 1500;
	private int NET_HEIGHT = 750;
	private int[] score = {0,0};
	
	public Net() {}
	

	public boolean inHorizontalContact(int x_position) {
		return (x_position <= 0) || (x_position >= NET_WIDTH-10);
	}
	
	public boolean inVerticalContact(int y_position) {
		return (y_position <= 0) || (y_position >= NET_HEIGHT-10);
	}
	
	public void scoring(int x_position, int y_position) {
		if(inHorizontalContact(x_position) || inVerticalContact(y_position)) {
			if(x_position < NET_WIDTH/2) 
				score[0]++;
			else 
				score[1]++;
		}
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
	
	

}
