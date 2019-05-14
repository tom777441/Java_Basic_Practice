import javax.swing.JOptionPane;
import java.util.Random;
public class Guess{
     public static void main(String args[]){
	String input="";
	int guess = 0, answer=0;
    Random r = new Random();
	answer =1+r.nextInt(42);

              input= JOptionPane.showInputDialog("產生數字1~42!" 
                           +"\n請你猜一猜? ");
              guess=Integer.parseInt(input);		
                           do {
                        	     if (guess < answer){		
                        	        guess = Integer.parseInt(JOptionPane.showInputDialog(null,     
                        	                     "不是 " + guess + ", 再大一點", "" + answer, 
                        	                      JOptionPane.INFORMATION_MESSAGE));
                        	    }  
                        	    else if (guess > answer){
                        	        guess = Integer.parseInt(JOptionPane.showInputDialog(null,     
                        	                     "不是 " + guess + ", 再小一點", "" + answer, 
                        	                      JOptionPane.INFORMATION_MESSAGE));
                        	    }	  	
                        	 } while (guess != answer);
                           JOptionPane.showMessageDialog(null, "你真ㄎㄧㄤ!! ",                      
                                   "猜對了，答案是" + answer , 
                                    JOptionPane.INFORMATION_MESSAGE);
                       	    
                           System.exit(0);
                          }
                       }
