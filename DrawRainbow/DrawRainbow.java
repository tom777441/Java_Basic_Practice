package DrawRainbow;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawRainbow extends JPanel {
	
	private final static Color VIOLET = new Color(128,0,128);
	private final static Color INDIGO = new Color(75,0,130);
	

	private Color[] color = {Color.WHITE,Color.WHITE,VIOLET,INDIGO,Color.BLUE,
			Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED};
	
	public DrawRainbow() {
		setBackground(Color.WHITE);
	}
	
	public void paintComponent(Graphics g) {
		
	super.paintComponent(g);
	
	int radius = 20;
		
	int cx = getWidth()/2;
	int cy = getHeight()-10;
	
	for(int count=color.length;count>0;count--) {
		g.setColor(color[count-1]);
		
		g.fillArc(cx-count*radius, cy-count*radius, count*radius*2, count*radius*2, 0, 180);
	}
	}
}
