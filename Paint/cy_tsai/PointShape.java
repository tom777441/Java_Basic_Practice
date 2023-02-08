package cy_tsai;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class PointShape extends Shape {
	
	public PointShape()
	{
		this (0, 0, Color.black, 0);
	}
	
	public PointShape(int x1, int y1, Color color, int size)
	{
		super(x1, y1, color, size);
	}

	public void setsize(int size) { super.setsize(size); }
	public void setcolor(Color color) { super.setcolor(color); }
	public void draw (Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;

		g2d.setStroke(new BasicStroke(super.getsize()));
		g2d.setPaint( super.getcolor());
		g.fillOval(super.getx1(), super.gety1(), super.getsize(), super.getsize());

	}
}
