import javax.swing.JOptionPane;
public class Q5{
  public static void main(String [] args){
     
    String text = JOptionPane.showInputDialog("Enter a sentence");
    System.out.println(text.length());
    System.out.println(countA(text));
    System.exit(0);
 }

  	//計算字串中"A"的次數
    public static int countA(String text){ 
      int count = 0;
      for (int i = 0; i < text.length(); i++){
        if (text.charAt(i) == 'A') {count +=1; }
      }
      return count;
   }
}