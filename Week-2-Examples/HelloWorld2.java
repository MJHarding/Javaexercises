/*  A simple program to demonstrate getting some input.
 *  @author Frans Coenen
 *  @author Russell Martin, Dec 2017
*/

// Import packages containing predefined classes for input.
import java.util.*;

public class HelloWorld2 {

    public static void main(String[] args) {
       // Create instance of Scanner class
       Scanner input = new Scanner(System.in);

       // Get input
       System.out.print("What is your name? ");
       String name1 = input.next();
       String name2 = input.next();
	
       // Output
       System.out.print("\nHello " + name1 + " " + name2);
       System.out.println(" - Congratulations on writing your first" + 
		" Java program which features some input!\n\n");
   }
}
