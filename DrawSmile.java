import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawSmile extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//face
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200, 200); //(起始x,起始y,高,寬)
		
		//eyes
		g.setColor(Color.BLACK);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135, 65, 30, 30);
		
		//mouth
		g.fillOval(50, 110, 120, 60);
		
		//"Cover" the mouth into smile
		g.setColor(Color.YELLOW);
		g.fillRect(50, 110, 120, 30);
		g.fillOval(50, 120, 120, 40);
	}
	public static void main(String[] args) {
		
		DrawSmile panel = new DrawSmile();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(240,270);
		application.setVisible(true);
	}
}
