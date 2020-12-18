import java.awt.*;

public class NetWriter{
	
	private Net net;
	
	public NetWriter(Net n) {
		net = n;
	}
	
	public void paintComponent(Graphics g) {
		int width = net.widthOf();
		int height = net.heightOf();
		g.setColor(Color.darkGray);
		g.fillRect(0, 0, net.fwidthOf(),net.fheightOf());
		g.setColor(Color.lightGray);
		g.fillRect(width/16, height/8, width, height);
		g.setColor(Color.BLUE);
		g.fillRect(10+width/16, 10+height/8, width/2 -20, height/2-20);
		g.fillRect(10+width/2+width/16, 10+height/2+height/8, width/2-20, height/2-20);
		g.fillRect(10+width/16, 10+height/2+height/8, width/2-20, height/2-20);
		g.fillRect(10+width/2+width/16, 10+height/8, width/2-20, height/2-20);
		g.setColor(Color.black);
		g.drawString(net.score1() + ":" + net.score2() , net.fwidthOf()/2-14, 50);
	}
}
