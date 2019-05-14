package GUIComponent;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

class Gui2 {

    private JLabel item1;
    private JFrame frame;

    public Gui2() {
        frame = new JFrame("The title bar");
        frame.setLayout(new FlowLayout());
        item1 = new JLabel("label 1");
        item1.setToolTipText("This is a message");
        String str = item1.getToolTipText();
        System.out.println(str);
        frame.add(item1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}