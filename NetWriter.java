import java.awt.*;

public class NetWriter{
	
	private Net net;
	
	public NetWriter(Net n) {
		net = n;
	}
	
	public void paintComponent(Graphics g) {
		int width = net.widthOf();
		int height = net.heightOf();
		g.setColor(Color.white);
		g.fillRect(0, 0, width+width/8,height+height/4);
		g.setColor(Color.black);
		g.fillRect(width/16, height/8, width, height);
		g.setColor(Color.BLUE);
		g.fillRect(10+width/16, 10+height/8, width/2 -20, height/2-20);
		g.fillRect(width/2+width/16, height/2+height/8, width/2-20, height/2-20);
		g.fillRect(10+width/16, height/2+height/8, width/2-20, height/2-20);
		g.fillRect(width/2+width/16, 10+height/8, width/2-20, height/2-20);
		g.setColor(Color.white);
		g.drawString(net.score1() + ":" + net.score2() , 700+width/16, 100+height/8);
		System.out.println(net.score1() + ":" + net.score2());
	}
}
