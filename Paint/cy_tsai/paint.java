package cy_tsai;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class paint {
	
	public static void main(String[] args)
	{
		PainterFrame painterFrame = new PainterFrame();
		
		painterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		painterFrame.setSize(1250,750);
		painterFrame.setVisible(true);
		JOptionPane.showMessageDialog(painterFrame, "您好，歡迎使用自製小畫家", "訊息", JOptionPane.PLAIN_MESSAGE);
	}
}
