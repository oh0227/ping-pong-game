
public class Net {
	
	private int NET_WIDTH = 1500;
	private int NET_HEIGHT = 750;
	private int[] score;
	
	public Net(int[] s) {
		score = s;
	}
	

	public boolean inHorizontalContact(int x_position) {
		return (x_position <= 0) || (x_position >= NET_WIDTH);
	}
	
	public boolean inVerticalContact(int y_position) {
		return (y_position <= 0) || (y_position >= NET_HEIGHT);
	}
	
	public void scoring(int[] s, int x_position, int y_position) {
		if(x_position < 250) 
			if(inHorizontalContact(x_position) || inVerticalContact(y_position))
				score[1]++;
		else if(x_position >= 250) 
			if(inHorizontalContact(x_position) || inVerticalContact(y_position))
				score[0]++;
	}
	
	public int widthOf() {
		return NET_WIDTH;
	}
	public int heightOf() {
		return NET_HEIGHT;
	}
	
	

}
