/* Power4 application
 * @author Frans Coenen
 * @author Clare Dixon 
 * @author Russell Martin, Dec 2017
*/
import java.util.*;

public class Power4 {

    /* Main method */
    public static void main(String[] args) {

       // Create Scanner class instance  
       Scanner input = new Scanner(System.in); 

       int inputInteger;
       // Input 
       System.out.print("Input an integer: ");
       inputInteger = input.nextInt();

       if (inputInteger < 50) 
          inputInteger = inputInteger + 10;

       inputInteger = (int)Math.pow(inputInteger,4.0); 

       // Output
       System.out.println("Result is:    " + inputInteger);
    }

}
