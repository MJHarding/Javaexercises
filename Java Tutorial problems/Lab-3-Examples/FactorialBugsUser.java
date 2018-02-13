/** Calls the Factorial Bugs Class, which is supposed to print out 
 * Factorials but has some logical errors.
 *
 * @author Clare Dixon, Nov 2010
 * @author Russell Martin, Jan 2018
**/

import java.util.Scanner;

public class FactorialBugsUser {

    public static void main(String [] args) {
	// local variables
	Scanner input = new Scanner(System.in);
	int bound;
	
	// input      
	System.out.print("Input an integer n between 1 and 20 to display n! or a value outside this range to display all between n=1 and n=20: ");
	bound = input.nextInt();
	if ((1 <=  bound) && (bound <= 20)) {
	// computation
	System.out.println(bound + "! = " + FactorialBugs.calculateNthTerm(bound));
	}
	else
	    FactorialBugs.outputNTerms(20);
    }
}
