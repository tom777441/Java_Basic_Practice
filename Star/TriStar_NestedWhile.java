package Star;
import javax.swing.*;
public class TriStar_NestedWhile{
   public static void main(String args[]){
     String output="";
     int row, i = 0, j = 0;
     row = Integer.parseInt(JOptionPane.showInputDialog("請問你要印幾行"
     		+ "星星(第一行一個、第二行兩個，餘此類推)?"));
            		   while(i < row){
            		         j = 0;
            		        while(j <= i){
            		               output = output + "* ";
            		               j++;
            		        }
            		        output += "\n";
            		        i++;
            		    }						     
            		    JOptionPane.showMessageDialog(null,  //component parent
            		    		output,	 //content
            		    		"Nested While",  //title      
            		                  JOptionPane.INFORMATION_MESSAGE);//type
            		   System.exit(0);
            		 }
   }
