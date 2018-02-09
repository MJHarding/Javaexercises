/* Div3 application
 * @author Russell Martin, Dec 2017
*/
import java.util.*;

public class Div3 {

    /* Main method */
    public static void main(String[] args) {

       // Create Scanner class instance  
       Scanner input = new Scanner(System.in); 

       System.out.print("Input an integer: ");
       int number = input.nextInt();

       // Input 
       if (number % 3 == 0) 
          System.out.println(number + " is of the form 3k for some k.");
       else if (number % 3 == 1) 
          System.out.println(number + " is of the form 3k+1 for some k.");
       else
          System.out.println(number + " is of the form 3k+2 for some k.");
    }

}
