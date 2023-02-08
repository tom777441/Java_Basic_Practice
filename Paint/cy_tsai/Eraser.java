package cy_tsai;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Eraser extends Shape{

	public Eraser()
	{
		this (0, 0, Color.black, 0);
	}
	
	public Eraser(int x1, int y1, Color color, int size)
	{
		super(x1, y1, color, size);
	}
	
	public void draw (Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(super.getsize()));
		g2d.setColor(super.getcolor());
		g2d.fillRect(super.getx1(),super.gety1(),super.getsize()*2,super.getsize()*2);


	}
}
