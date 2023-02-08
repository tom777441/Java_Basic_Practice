package cy_tsai;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class LineShape extends Shape{

	public LineShape()
	{
		this (0, 0, 0, 0, Color.black, false, 0);
	}
	
	public LineShape(int x1, int y1, int x2, int y2, Color color,boolean fillCheck, int size)
	{
		super(x1, y1, x2, y2, color, fillCheck, size);
	}
	public void setsize(int size) { super.setsize(size); }
	public void setcolor(Color color) { super.setcolor(color); }
	public void draw (Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;

			g2d.setStroke(new BasicStroke(super.getsize()));
			g2d.setColor( super.getcolor());
			
			if(super.getfillCheck())
			{
				g2d.setColor(super.getforeColor());
				g2d.setStroke(new BasicStroke(super.getsize()));
				g2d.drawLine(super.getx1(),super.gety1(),super.getx2(),super.gety2());
				
			}else
			{
				g2d.setColor(super.getforeColor());
				g2d.setStroke(new BasicStroke(super.getsize(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0));
				g2d.drawLine(super.getx1(),super.gety1(),super.getx2(),super.gety2());
			}

	}
}
