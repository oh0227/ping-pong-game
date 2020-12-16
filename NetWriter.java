import java.awt.*;

public class NetWriter{
	
	private Net net;
	
	public NetWriter(Net n) {
		net = n;
	}
	
	public void paintComponent(Graphics g) {
		int width = net.widthOf();
		int height = net.heightOf();
		g.setColor(Color.black);
		g.fillRect(0, 0, width, height);
		g.setColor(Color.white);
		g.fillRect(10, 10, width/2 -20, height/2-20);
		g.fillRect(width/2, height/2, width/2-20, height/2-20);
	}
}
