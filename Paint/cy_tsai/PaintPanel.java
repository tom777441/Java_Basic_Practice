package cy_tsai;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.*;

import javax.swing.JPanel;
/* -----Ref from https://jimmyviva.blogspot.com/2019/04/java.html ----- */
public class PaintPanel extends JPanel{
	
	private Point startPt;
	private Point endPt;
	
	/*
	private final ArrayList<PaintPoint> points = new ArrayList<>();
	private final ArrayList<LinePoints> lines = new ArrayList<>();
	private final ArrayList<OvalShape> ovals = new ArrayList<>();
	private final ArrayList<RectShape> rects = new ArrayList<>();
	*/
	public PaintPanel()
	{
		startPt = new Point();
		endPt = new Point();
		this.setBackground(Color.white);
		
		addMouseMotionListener(
			
			//deal with mouseMotion
			new MouseMotionAdapter()
			{
				//拖曳
				@Override
				public void mouseDragged(MouseEvent e)
				{
					switch(PainterFrame.toolSelect)
					{
						case "筆刷":
							//points.add(new PaintPoint(e.getPoint(),PainterFrame.paintSize,PainterFrame.foreColor));
						break;
				
						case "直線":
							endPt = e.getPoint();
						break;
						
						case "橢圓形":
							endPt = e.getPoint();
						break;
						
						case "矩形":
							endPt = e.getPoint();
						break;
						
						case "圓角矩形":
							endPt = e.getPoint();
						break;
					}
					repaint();
				}
				
				@Override
				public void mouseMoved(MouseEvent e)
				{
					PainterFrame.statusLb.setText((String.format("滑鼠位置: [%d, %d]", e.getX(), e.getY())));
				}
			}
		);//end mouseMotion
		
		//deal with mouseListener
		addMouseListener
		(
			new MouseAdapter()
			{
				//按壓滑鼠
				@Override
				public void mousePressed(MouseEvent e)
				{
					startPt = e.getPoint();

				}
				
				//釋放滑鼠
				@Override
				public void mouseReleased(MouseEvent e)
				{
					switch(PainterFrame.toolSelect)
					{
						case "筆刷":
						break;
						
						case "直線":
							if(PainterFrame.fillCheck)
							{
								//lines.add(new LinePoints(startPt,e.getPoint(),new BasicStroke(PainterFrame.paintSize),PainterFrame.foreColor));
								repaint();
							}
							else
							{
								//lines.add(new LinePoints(startPt,e.getPoint(),new BasicStroke(PainterFrame.paintSize,BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9},0), PainterFrame.foreColor));
								repaint();
							}
						break;
						
						case "橢圓形":
							//ovals.add(new OvalShape(startPt,e.getPoint(),new BasicStroke(PainterFrame.paintSize),PainterFrame.foreColor,PainterFrame.backColor,PainterFrame.fillCheck));
							repaint();

						break;
						
						case "矩形":
							//rects.add(new RectShape(startPt,e.getPoint(),new BasicStroke(PainterFrame.paintSize),PainterFrame.foreColor,PainterFrame.backColor,PainterFrame.fillCheck));
							repaint();
						break;
					}
				}
			}
		);//end mouseListener
		
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		/*
		//demo point
		for(PaintPoint point:points)
		{
			g.setColor(point.foreColor);
			g.fillOval(point.x, point.y, point.size, point.size);
		}
		
		//demo past line
		for(LinePoints line:lines)
		{
			g2d.setColor(line.foreColor);
			g2d.setStroke(line.thickness);
			g2d.drawLine(line.startPt.x, line.startPt.y, line.endPt.x, line.endPt.y);
		}
		*/
		//demo current line
		if(PainterFrame.toolSelect == "直線" && PainterFrame.fillCheck)
		{

				g2d.setColor(PainterFrame.foreColor);
				g2d.setStroke(new BasicStroke(PainterFrame.paintSize));
				g2d.drawLine(startPt.x, startPt.y, endPt.x, endPt.y);

		}
		else if(PainterFrame.toolSelect == "直線")
		{

				g2d.setColor(PainterFrame.foreColor);
				g2d.setStroke(new BasicStroke(PainterFrame.paintSize, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0));
				g2d.drawLine(startPt.x, startPt.y, endPt.x, endPt.y);

		}
		/*
		//demo past OvalShape
		for(OvalShape oval:ovals)
		{
			g2d.setColor(oval.foreColor);
			g2d.setStroke(oval.thickness);
			
			if(oval.fillCheck)
			{
				g2d.setColor(oval.backColor);
				g2d.fillOval(oval.startPt.x, oval.startPt.y, oval.width, oval.height);
				
				g2d.setColor(oval.foreColor);
				g2d.drawOval(oval.startPt.x, oval.startPt.y, oval.width, oval.height);
			}
			else
			{
				//g2d.setColor(oval.foreColor);
				g2d.drawOval(oval.startPt.x, oval.startPt.y, oval.width, oval.height);
			}
		}
		*/	
		//demo current oval
		if(PainterFrame.toolSelect == "橢圓形")
		{
			g2d.setStroke(new BasicStroke(PainterFrame.paintSize));
			g2d.setColor(PainterFrame.foreColor);
			if(PainterFrame.fillCheck)
			{
				if(startPt.x != endPt.x && startPt.y != endPt.y)
				{
					g2d.setColor(PainterFrame.backColor);
					g2d.fillOval(Math.min(startPt.x, endPt.x), Math.min(startPt.y, endPt.y), Math.abs(startPt.x - endPt.x),  Math.abs(startPt.y - endPt.y));
					g2d.setColor(PainterFrame.foreColor);
					g2d.drawOval(Math.min(startPt.x, endPt.x), Math.min(startPt.y, endPt.y), Math.abs(startPt.x - endPt.x),  Math.abs(startPt.y - endPt.y));
				}

			}
			else
			{
				//g2d.setColor(PainterFrame.foreColor);
				if(startPt.x != endPt.x && startPt.y != endPt.y || (endPt.x == 0 && endPt.y == 0))
				g2d.drawOval(Math.min(startPt.x, endPt.x), Math.min(startPt.y, endPt.y), Math.abs(startPt.x - endPt.x),  Math.abs(startPt.y - endPt.y));
			}
			
		}
		/*
		//demo past RectShape
		for(RectShape rect:rects)
		{
			g2d.setColor(rect.foreColor);
			g2d.setStroke(rect.thickness);
			if(rect.fillCheck)
			{
					g2d.setColor(rect.backColor);
					g2d.fillRect(rect.startPt.x, rect.startPt.y, rect.width, rect.height);
					g2d.setColor(rect.foreColor);
					g2d.drawRect(rect.startPt.x, rect.startPt.y, rect.width, rect.height);
			}
			else
			{
				//g2d.setColor(rect.foreColor);
				g2d.drawRect(rect.startPt.x, rect.startPt.y, rect.width, rect.height);
			}
		}
		*/
		//demo current rect
		if(PainterFrame.toolSelect == "矩形")
		{
			g2d.setStroke(new BasicStroke(PainterFrame.paintSize));
			g2d.setColor(PainterFrame.foreColor);
			if(PainterFrame.fillCheck)
			{
				if(startPt.x != endPt.x && startPt.y != endPt.y)
				{
					g2d.setColor(PainterFrame.backColor);
					g2d.fillRect(Math.min(startPt.x, endPt.x), Math.min(startPt.y, endPt.y), Math.abs(startPt.x - endPt.x),  Math.abs(startPt.y - endPt.y));
					g2d.setColor(PainterFrame.foreColor);
					g2d.drawRect(Math.min(startPt.x, endPt.x), Math.min(startPt.y, endPt.y), Math.abs(startPt.x - endPt.x),  Math.abs(startPt.y - endPt.y));
				}
			}
			else
			{
				//g2d.setColor(PainterFrame.foreColor);
				//System.out.println(startPt+ "和"+ endPt);
				//if(startPt != endPt)
				if(startPt.x != endPt.x && startPt.y != endPt.y)
				g2d.drawRect(Math.min(startPt.x, endPt.x), Math.min(startPt.y, endPt.y), Math.abs(startPt.x - endPt.x),  Math.abs(startPt.y - endPt.y));	
			}
		}
	}
/*
	public static class PaintPoint extends Point
	{
		public int size;
		public Color foreColor;
		
		public PaintPoint(Point point, int size, Color foreColor)
		{
			super(point);
			this.size = size;
			this.foreColor  = foreColor; 
		}
	} //end PaintPoint
	
	public static class LinePoints
	{
		public Color foreColor;
		public PaintPoint startPt;
		public PaintPoint endPt;
		public BasicStroke thickness;
		
		public LinePoints(PaintPoint p1, PaintPoint p2, BasicStroke thickness, Color foreColor)
		{
			startPt = p1;
			endPt = p2;
			this.thickness = thickness;
			this.foreColor = foreColor;
		}
	} //end LinePoints
	
	public static class OvalShape
	{
		public Color foreColor;
		public Color backColor;
		public Boolean fillCheck;
		public int width, height;
		public PaintPoint startPt;
		public PaintPoint endPt;
		public BasicStroke thickness;
		
		public OvalShape(PaintPoint p1, PaintPoint p2, BasicStroke thickness, Color foreColor,Color backColor,boolean fillCheck)
		{
			this.startPt = p1;
			this.endPt = p2;
			this.thickness = thickness;
			this.foreColor = foreColor;
			this.backColor = backColor;
			this.fillCheck = fillCheck;
			this.width = Math.abs(p2.x - p1.x);
			this.height = Math.abs(p2.y - p1.y);
			
			if(p2.x < p1.x)
			{
				this.startPt.x = p2.x;
			}
			if(p2.y < p1.y)
			{
				this.startPt.y = p2.y;
			}
		}
	} //end OvalShape
	
	
	public static class RectShape
	{
		public Color foreColor;
		public Color backColor;
		public Boolean fillCheck;
		public int width, height;
		public PaintPoint startPt;
		public PaintPoint endPt;
		public BasicStroke thickness;
		
		public RectShape(PaintPoint p1, PaintPoint p2, BasicStroke thickness, Color foreColor,Color backColor,boolean fillCheck)
		{
			this.startPt = p1;
			this.endPt = p2;
			this.thickness = thickness;
			this.foreColor = foreColor;
			this.backColor = backColor;
			this.fillCheck = fillCheck;
			this.width = Math.abs(p2.x - p1.x);
			this.height = Math.abs(p2.y - p1.y);
			
			if(p2.x < p1.x)
			{
				this.startPt.x = p2.x;
			}
			if(p2.y < p1.y)
			{
				this.startPt.y = p2.y;
			}

		}
	} //end RectShape
	*/
	public void clearPanel()
	{
		//reset all related variable
		//points.clear();
		//lines.clear();
		//ovals.clear();
		//rects.clear();
		startPt = new Point();
		endPt = new Point();
		repaint();
		PainterFrame.clear = false;
	} //end clearPanel
}
