package cy_tsai;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class RectShape extends Shape{

	public RectShape()
	{
		this (0, 0, 0, 0, Color.black, Color.black, false, 0);
	}
	
	public RectShape(int x1, int y1, int x2, int y2, Color foreColor, Color backColor, boolean fillCheck, int size)
	{
		super(x1, y1, x2, y2, foreColor, backColor, fillCheck, size);
	}
	
	public void draw (Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(super.getsize()));
		g2d.setColor( super.getforeColor());
		
		if(super.getfillCheck())
		{
			g2d.setColor(super.getbackColor());
			g2d.fillRect(super.getx1(),super.gety1(),super.getwidth(),super.getheight());
			
			g2d.setColor(super.getforeColor());
			g2d.drawRect(super.getx1(),super.gety1(),super.getwidth(),super.getheight());
		}
		else
		{
			g2d.drawRect(super.getx1(),super.gety1(),super.getwidth(),super.getheight());
		}
	}
}
