package GUIComponent;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame {
	
	private final JLabel label1;     //label with just text
	private final JLabel label2;     //label constructed with text and icon
	private final JLabel label3;     //label with added text and icon
	
	//labelFrane constructor adds JLabels to JFrame
	public LabelFrame(){
		
		super("Testing JLabel");
		setLayout(new FlowLayout()); //set frame layout
		
		//JLabel constructor with a string argument
		label1 = new JLabel("Label with text");
		label1.setToolTipText("This is label1"); 
		//Place the pointer on the label for 2-3 seconds
		add(label1);				//add label1 to JFrame
		
		Icon bug = new ImageIcon(getClass().getResource("Test.gif"));
		label2 = new JLabel("Label with icon and text",bug,SwingConstants.LEFT);
		label2.setToolTipText("This is label2");
		add(label2);
		
		//JLabel constructor no  arguments
		label3 = new JLabel();
		label3.setText("Labwl with icon and text at bottom");
		label3.setIcon(bug);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("This is label3");
		add(label3);
		}
}
