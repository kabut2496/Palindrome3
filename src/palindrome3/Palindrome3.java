/**
 * 2/24/2020
 * finding out whether a sentance is a palindrome or not
 * 
 */
package palindrome3;

import javax.swing.JOptionPane;

/**
 *
 * @author Karl Butler
 */
public class Palindrome3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        String gInput;
        String g="";
        String q="";
        String Input = "";
        String reverse = ""; 
        char letter;
        
        //getting user input
        
        gInput = JOptionPane.showInputDialog("Please enter a Sentence thatis a Palindrome");
        gInput=gInput.toLowerCase();
        
        //checking if it is a palindrome
        
        for(int i = gInput.length() - 1; i >= 0; i--)
        {
            letter=gInput.charAt(i);
            
            if (letter == (' ')){
                i--;
            } 
            
            reverse = reverse + gInput.charAt(i);
            q=reverse;
        }
        
               for(int i = reverse.length() - 1; i >= 0; i--)
        {
            
            Input = Input + reverse.charAt(i);
            g=Input;
        }
       
       //out putting wether it is a palindrome or not
       
        if( g.equals(q)){
         System.out.println(gInput + " is a palindrome");
        } else{
            System.out.println(gInput + " is not a palindrome or you input a Upper case character");
        }
       
    }
    
    
}
