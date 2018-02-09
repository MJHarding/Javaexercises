/* Another "switch" example application
 * @author Russell Martin, Jan 2018
*/

import java.util.Scanner;

public class TestSwitch2 {

    public static void main (String[] args) {
        // Get some input.
	Scanner input = new Scanner(System.in);
        System.out.print("Input an integer:  ");
        int number = input.nextInt(); 
    
        // Process number using a "switch" statement.
        // Note that number % 2 is either 0, 1, or -1.
        // If number is odd and negative, then
        // number % 2 equals -1.
        switch (number % 2) {
            case 0:
    	        System.out.println("The input is an even integer.");
		break;
            case 1:
            case -1:  
    	        System.out.println("The input is an odd integer.");
		break;
	}
    }
}
