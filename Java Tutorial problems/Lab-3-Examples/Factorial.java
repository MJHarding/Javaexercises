/** The Factorial class implements an class that
 * calculates Factorial values and prints these for a given input 
 * between 1 and 20.
 *
 * Note that this class is really meant as a set of "helper"
 * methods that do not require an instance of this class to 
 * be instantiated.  This is because the methods have been
 * declared as "static", hence can be called with statements
 * of the form 
 *      long x = Factorial.calculateNthTerm(10);
 *
 * @author Clare Dixon, 2010
 * @author Russell Martin, Jan 2018
**/

public class Factorial {

    private static final int UPPERBOUND = 20;

    //***  Methods

    // This method calculates the factorial of n (a value between 1 and UPPERBOUND).
    public static long calculateNthTerm(int n) {
	final int ENDCONDITION = 1;
	long product = 1;

	if (n <= 0 || n > UPPERBOUND) {
	    System.out.println("[Factorial.calculateNthTerm] Undefined term!");
	    return -1;
	}
	else {
	    // Loop
	    for(int loop = n; loop >= ENDCONDITION; loop--) 
                  product = product*loop;
	    return product;
	}
    }

    // This method outputs the factorial of values 1 to n (a value between 1 and UPPERBOUND).
    public static void outputNTerms(int n) {
	final int STARTCONDITION = 1;
	if (n > UPPERBOUND)
	    System.out.println("Can only print up to " + UPPERBOUND + " terms");
	// Loop
	for(int loop = STARTCONDITION; loop <= UPPERBOUND && loop <= n; loop++)
	    System.out.println(loop + "! = " + calculateNthTerm(loop));
	// End
	System.out.print("\n\n");
    }

    // This method is an alternative implementation of outputNTerms() which outputs 
    // the factorial of values 1 to n (a value between 1 and UPPERBOUND).
    public static void outputNTerms2(int n) {
	final int STARTCONDITION = 1;
	long product = 1;
	if (n > 20)
	    System.out.println("Can only print up to " + UPPERBOUND + " terms!");
	// Loop
        for(int loop = STARTCONDITION; loop <= UPPERBOUND && loop <= n; loop++){
            product = product * loop;
            System.out.println(loop + "! = " + product);
	}
	// End
	System.out.print("\n\n");
    }
}         
