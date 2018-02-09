/* "switch" example application
 * @author Frans Coenen
 * @author Russell Martin, Jan 2018
*/

import java.util.Scanner;

public class TestSwitch {

    public static void main (String[] args) {
        // Get some input.
	Scanner input = new Scanner(System.in);
        System.out.print("Input an integer:  ");
        int number = input.nextInt(); 
    
        // Process number using a "switch" statement
        switch (number) {
            case 0:
    	        System.out.println("Number is 0.");
		break;
            case 1:
    	        System.out.println("Number is 1.");
		break;
            case 2: case 3: case 4:
    	    	System.out.println("Number is 2, 3 or 4.");
	    	break;
            default:
   		System.out.println("Number is less than 0 or greater than 4.");
                break;
	}
    }
}
