package cy_tsai;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;


public abstract class Shape extends JPanel 
{
	private int x1, y1, x2, y2;
	private int size;
	private Color color;
	private Color backColor;
	private Color foreColor;
	private boolean fillCheck;

	
	public  Shape()
	{
		this(0, 0, 0, 0, Color.black, false ,0);
	}
	//point
	public Shape(int x1, int y1, Color color, int size)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.color = color;
		this.size = size;
	}
	//line
	public Shape(int x1, int y1, int x2, int y2, Color color, boolean fillCheck, int size)
	{
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.size = size;
		this.color = color;
		this.fillCheck = fillCheck;
	}
	//oral, rect
	public Shape(int x1,int y1,int x2,int y2,Color foreColor,Color backColor, boolean fillCheck ,int size){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		set();
		this.size = size;
		this.foreColor = foreColor;
		this.backColor = backColor;
		this.fillCheck = fillCheck;
	}
	
	//deal with oral, rect
	public void set(){ 
		int a; 
		if(x1 < x2){ } else{ a = x1; x1 = x2; x2 = a; } 
		if(y1 < y2){ } else{ a = y1; y1 = y2; y2 = a; }
	}
	public void setsize( int size ){
		this.size = size;
	}
	public void setcolor( Color color ){
		this.color = color;
	}
	
	public int getx1(){ return x1; }
	public int gety1(){ return y1; }
	public int getx2(){ return x2; }
	public int gety2(){ return y2; }
	public int getsize(){ return size; }
	public Color getcolor(){ return color; }
	public Color getforeColor(){ return foreColor; }
	public Color getbackColor(){ return backColor; }
	public boolean getfillCheck(){ return fillCheck; }
	public int     getwidth( )   { return (  x2 -  x1 ); }
	public int     getheight( )  { return (  y2 -  y1 ); }
	
	public abstract void draw( Graphics g );
}
