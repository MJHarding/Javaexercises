/** The FactorialTestHarness class is a test harness for the Factorial class which
 * calls methods from the  Factorial class to calculate the factorial of some value 
 * between 1 and 20.
 * 
 * @author Clare Dixon, 2010
 * @author Russell Martin, Jan 2018
 */

public class FactorialTestHarness {

    public static void main(String [] arg) {
	// local variables
	System.out.println("-1!: " + Factorial.calculateNthTerm(-1));
	System.out.println("0!: " + Factorial.calculateNthTerm(0));
	System.out.println("1!: " + Factorial.calculateNthTerm(1));
	System.out.println("2!: " + Factorial.calculateNthTerm(2));
	System.out.println("10!: " + Factorial.calculateNthTerm(10));
	System.out.println("19!: " + Factorial.calculateNthTerm(19));
	System.out.println("20!: " + Factorial.calculateNthTerm(20));
	System.out.println("21!: " + Factorial.calculateNthTerm(21));

	System.out.println("Loop Testing -1: ");
        Factorial.outputNTerms(-1);
	System.out.println("Loop Testing 0: ");
	Factorial.outputNTerms(0);
	System.out.println("Loop Testing 1: "); 
	Factorial.outputNTerms(1);
	System.out.println("Loop Testing 2: "); 
	Factorial.outputNTerms(2);
	System.out.println("Loop Testing 10: ");
	Factorial.outputNTerms(10);
	System.out.println("Loop Testing 19: "); 
	Factorial.outputNTerms(19);
	System.out.println("Loop Testing 20: ");
	Factorial.outputNTerms(20);
	System.out.println("Loop Testing 21: ");
	Factorial.outputNTerms(21);

	System.out.println("With alternative method");
	System.out.println("Loop Testing -1: ");
        Factorial.outputNTerms2(-1);
	System.out.println("Loop Testing 0: ");
	Factorial.outputNTerms2(0);
	System.out.println("Loop Testing 1: "); 
	Factorial.outputNTerms2(1);
	System.out.println("Loop Testing 2: "); 
	Factorial.outputNTerms2(2);
	System.out.println("Loop Testing 10: ");
	Factorial.outputNTerms2(10);
	System.out.println("Loop Testing 19: "); 
	Factorial.outputNTerms2(19);
	System.out.println("Loop Testing 20: ");
	Factorial.outputNTerms2(20);
	System.out.println("Loop Testing 21: ");
	Factorial.outputNTerms2(21);
    }
}
