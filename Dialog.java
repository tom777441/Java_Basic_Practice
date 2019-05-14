import javax.swing.JOptionPane;
   public class Dialog{
      public static void main(String arg[]){
        int age = 0;

        String input = JOptionPane.showInputDialog("你的年齡?");
        //字串轉換Int
        age = Integer.parseInt(input);

        if (age >=18)
        { JOptionPane.showMessageDialog( null, "你是成年人！","訊息", 2 ); }
        else
        { JOptionPane.showMessageDialog( null, "禁止進入！","訊息", 0 ); }

      System.exit(0);
     }
   }
