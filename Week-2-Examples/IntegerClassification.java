/**
 * @author Clare Dixon July 2010, 2012
 * @author Russell Martin Nov 2017
 *
 * Example of using "if" statements and relational operators.
 */

//  The Scanner class provides methods for reading user input.
import java.util.Scanner;

public class IntegerClassification {

    /*  Main Method */
    public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	int value;

	System.out.print("Please provide an integer value: ");
	value = input.nextInt(); //read the value from the keyboard 
	System.out.println( classify(value) );
    }

    // Method that returns a String depending on the value of the input. 
    public static String classify (int val) {
	String resultPhrase;

        if (val < 0)
            resultPhrase = "Your number is negative.";
	else if (val == 0) 
            resultPhrase = "Your number is zero.";
	else 
            resultPhrase = "Your number is positive.";
	
	return resultPhrase;
    }
}
