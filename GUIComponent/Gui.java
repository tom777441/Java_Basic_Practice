package GUIComponent;

import javax.swing.SwingUtilities;

class Gui {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Gui2();
            }
        });
    }
}