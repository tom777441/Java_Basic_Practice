package cy_tsai;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.*;


public class PainterFrame extends JFrame {

	private final JComboBox paintingToolBox;
	private int save_img = 0;
	private final static String toolsArray[] = {"筆刷","直線","橢圓形","矩形"};
	
	//set layout
	private final JPanel northPl;
	private final JPanel radioBtPl;
	private final JPanel northLeftPl;
	private final JPanel northRightPl;
	//private final JPanel canvasPl;
	private PaintPanel2 paintPl;
	
	private final JRadioButton smallBt;
	private final JRadioButton mediumBt;
	private final JRadioButton largeBt;
	private final ButtonGroup radioGroup;

	private final JLabel Lb1, Lb2, Lb3;
	public static JLabel statusLb;
	private final JCheckBox fillCheckBox;
	private final JButton Bt1, Bt2, Bt3;

	private final JButton Bt4;
	private final JButton Bt5;
	
	//Default implement function
	public static int paintSize = 15;
	public static String toolSelect = toolsArray[0]; //defuault "筆刷"
	public static boolean fillCheck = false;
	public static Color foreColor = Color.black;
	public static Color backColor = Color.black;
	public static Color pastforeColor = Color.black;
	public static Color pastbackColor = Color.black;
	
	public static boolean clear = false;
	public static boolean eraser = false;
	
	public PainterFrame()
	{
		super("paint");
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
			
		paintingToolBox = new JComboBox(toolsArray);
		paintingToolBox.addItemListener
		(
			new ItemListener()
			{
				@Override
				public void itemStateChanged(ItemEvent e)
				{
					if(e.getStateChange() == ItemEvent.SELECTED)
					{
						System.out.printf("選擇 %s \r\n", toolsArray[paintingToolBox.getSelectedIndex()]);
					}
					
					switch(toolsArray[paintingToolBox.getSelectedIndex()])
					{
						case "筆刷":
							toolSelect = toolsArray[0];
							fillCheckBox.setEnabled(false);
							if(backColor == Color.white && foreColor == Color.white)
							{
								backColor = pastbackColor;
								foreColor = pastforeColor;
							}
						break;
						
						case "直線":
							toolSelect = toolsArray[1];
							fillCheckBox.setEnabled(true);
							if(backColor == Color.white && foreColor == Color.white)
							{
								backColor = pastbackColor;
								foreColor = pastforeColor;
							}
						break;
						
						case "橢圓形":
							toolSelect = toolsArray[2];
							fillCheckBox.setEnabled(true);
							if(backColor == Color.white && foreColor == Color.white)
							{
								backColor = pastbackColor;
								foreColor = pastforeColor;
							}
						break;
						
						case "矩形":
							toolSelect = toolsArray[3];
							fillCheckBox.setEnabled(true);
							if(backColor == Color.white && foreColor == Color.white)
							{
								backColor = pastbackColor;
								foreColor = pastforeColor;
							}
						break;
					}
				} // end itemStateChanged
 			}
		);
		
		//north
		northPl = new JPanel();
		GridLayout northLayout = new GridLayout(1,2);
		northPl.setLayout(northLayout);
		
		//north-right
		northRightPl = new JPanel();
		GridLayout northRightLayout = new GridLayout(2,3);
		northRightPl.setLayout(northRightLayout);
		
		//north-left
		northLeftPl = new JPanel();
		GridLayout northLeftLayout = new GridLayout(1,5,20,20);
		northLeftPl.setLayout(northLeftLayout);
		
		//radioBt 
		radioBtPl = new JPanel();
		radioBtPl.setLayout(new GridLayout());
		
		//set drawing panel
		//canvasPl = new JPanel();
		paintPl = new PaintPanel2();
		
		//set label
		Lb1 = new JLabel("繪圖用具");
		Lb2 = new JLabel("筆刷大小");
		Lb3 = new JLabel("填滿");
		
		//set button
		smallBt = new JRadioButton("小",false);
		mediumBt = new JRadioButton("中",true);
		largeBt = new JRadioButton("大",false);
		radioBtPl.add(smallBt);
		radioBtPl.add(mediumBt);
		radioBtPl.add(largeBt);
		
		
		smallBt.addItemListener(new RadioButtonHandler(smallBt.getText()));
		mediumBt.addItemListener(new RadioButtonHandler(mediumBt.getText()));
		largeBt.addItemListener(new RadioButtonHandler(largeBt.getText()));
		
		//set radiogroup
		radioGroup = new ButtonGroup();
		radioGroup.add(smallBt);
		radioGroup.add(mediumBt);
		radioGroup.add(largeBt);

		
		fillCheckBox = new JCheckBox();
		CheckBoxHandler checkBoxHandler = new CheckBoxHandler();
		fillCheckBox.addItemListener(checkBoxHandler);
		
		Bt1 = new JButton("前景色");
		Bt2 = new JButton("背景色");
		Bt3 = new JButton("清除畫面");
		Bt4 = new JButton("橡皮擦");
		Bt5 = new JButton("儲存圖片");
		
		Bt1.addActionListener(new ButtonHandler(Bt1.getText()));
		Bt2.addActionListener(new ButtonHandler(Bt2.getText()));
		Bt3.addActionListener(new ButtonHandler(Bt3.getText()));
		Bt4.addActionListener(new ButtonHandler(Bt4.getText()));
		Bt5.addActionListener(new ButtonHandler(Bt5.getText()));
		
		//status, mouse
		statusLb = new JLabel();
	/*
		MouseHandler mouseHandler = new MouseHandler();
		canvasPl.addMouseMotionListener(mouseHandler);
	*/	
		northRightPl.add(Lb1);
		northRightPl.add(Lb2);
		northRightPl.add(Lb3);
		
		northRightPl.add(paintingToolBox);
		northRightPl.add(radioBtPl);
		northRightPl.add(fillCheckBox);
		
		northLeftPl.add(Bt1);
		northLeftPl.add(Bt2);
		northLeftPl.add(Bt3);
		northLeftPl.add(Bt4);
		northLeftPl.add(Bt5);
		
		northPl.add(northRightPl);
		northPl.add(northLeftPl);
		
		add(northPl,BorderLayout.NORTH);
		//add(canvasPl,BorderLayout.CENTER);
		add(paintPl,BorderLayout.CENTER);
		add(statusLb,BorderLayout.SOUTH);
	}
	
	//deal with radioBt
	private class RadioButtonHandler implements ItemListener
	{
		public String size;
		//constructor
		public RadioButtonHandler(String size)
		{
			this.size = size;
		}
		
		@Override
		public void itemStateChanged(ItemEvent e)
		{
			if(e.getStateChange() == ItemEvent.SELECTED)
			{
				//System.out.printf("選擇 %s 筆刷 \r\n", size);
			}
			
			switch(size)
			{
				case "小":
					paintSize = 10;
				break;
				
				case "中":
					paintSize = 15;
				break;
				
				case "大":
					paintSize = 20;
				break;
			}
		}
	}
	
	//deal with checkbox
	private class CheckBoxHandler implements ItemListener
	{
		@Override
		public void itemStateChanged(ItemEvent e)
		{
			if(e.getStateChange() == ItemEvent.SELECTED)
			{
				//System.out.println("選擇填滿");
				fillCheck = true;
			}
			else
			{
				//System.out.println("取消填滿");
				fillCheck = false;
			}
		} 
	}
	
	//deal with button
	private class ButtonHandler implements ActionListener
	{
		public String text;
		public ButtonHandler(String text)
		{
			this.text = text;
		}
		@Override
		public void actionPerformed(ActionEvent e)
		{
				System.out.printf("點選 %s \r\n",text);
				if(text.equals("前景色"))
				{
					foreColor = JColorChooser.showDialog(PainterFrame.this,"Please choose color", foreColor);
					Bt1.setBackground(foreColor);
				}
				else if(text.equals("背景色"))
				{
					backColor = JColorChooser.showDialog(PainterFrame.this,"Please choose color", backColor);
					Bt2.setBackground(backColor);
				}
				else if(text.equals("清除畫面"))
				{
					clear = true;
					paintPl.clearPanel();
				}
				else if(text.equals("橡皮擦"))
				{
					eraser = !eraser;
					if(eraser == true) Bt4.setText("點擊取消");
					else Bt4.setText("橡皮擦");	
				}
				else if(text.equals("儲存圖片"))
				{
					saveImg(paintPl);
				}
		} 
	}
	private void saveImg(Component panel)
	{
		//Scanner sc = new Scanner(System.in);
		Dimension size = panel.getSize();
		BufferedImage image = new BufferedImage(
				size.width, size.height, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = image.createGraphics();
		panel.paint(g2d);
		
		try
		{
			//String s = sc.nextLine();
			String getMessage = JOptionPane.showInputDialog(this, "欲儲存之名稱:");
			String dirName = System.getProperty("user.dir");
			File dir = new File(dirName + "\\save");
			//if no "save" folder, build it
			dir.mkdir();
			//System.out.println(dirName);
			if(getMessage.equals(""))
			{
				ImageIO.write(image, "png", new File(dir + "\\" + save_img++ + ".png"));
			}
			ImageIO.write(image, "png", new File(dir + "\\" + getMessage + ".png"));

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
/*	
	//deal with mouse
	private class MouseHandler extends MouseAdapter
	{
		@Override
		public void mouseMoved(MouseEvent e)
		{

				statusLb.setText((String.format("滑鼠位置: [%d, %d]", e.getX(), e.getY())));
		} 
	}
	
	public void clearPanel()
	{
		repaint();
		//reset
		PainterFrame.clear = false;
	}
*/
}
