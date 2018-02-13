/**  Showing some logical errors in Factorial calculations.
 *
 * @author Clare Dixon, Sept 2010
 * @author Russell Martin
**/

public class FactorialBugs {

    //**  Methods
    public static long calculateNthTerm(int n) {
	final int ENDCONDITION = 0;
	long product = 0;
	if (n <= 0 || n > 20) {
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

    public static long calculateNthTerm2(int n) {
	final int ENDCONDITION = 1;
	long product = 1;
	if (n <= 0 || n > 20) {
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


 public static void outputNTerms(int n) {
     final int STARTCONDITION = 1;
     if (n > 20)
	 System.out.println("Can only print up to 20 terms");
     // Loop
     for(int loop = STARTCONDITION; loop <= 20 && loop <= n; loop++)
	 System.out.println(loop + "! = " + calculateNthTerm(loop));
     // End
     System.out.print("\n\n");
 }

 public void outputTerms2(int n) {
	final int STARTCONDITION = 1;
	long product = 1;

	// Loop
        for(int loop = STARTCONDITION; loop <= n; loop++){
            product = product * loop;
            System.out.println(loop + "! = " + product);
	}
	// End
	System.out.print("\n\n");
 }

}         
