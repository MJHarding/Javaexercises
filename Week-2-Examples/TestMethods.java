/* The TestMethods class implements a simple class declaring, summing 
 * and averaging three numbers and printing out these values.
 * @author Clare Dixon
 * @author Russell Martin, Dec 2017
 */
public class TestMethods {

    public static void main(String[] args) {

        /* Declare and initialise three doubles */
	double firstNumber = 2.0;
	double secondNumber = 10.0;
	double thirdNumber = 3.0;

        /* Call the sumOfThree method and assign the result to sum */
        double sum = sumOfThree(firstNumber, secondNumber, thirdNumber);

        /* Print out the values */
	System.out.print("Total of the Numbers is:  "); 
        System.out.println(sum); 
	System.out.print("Average of the Numbers is:  "); 
        System.out.println(averageOfThree(firstNumber,secondNumber,thirdNumber)); 
        farewellMessage();
    }

    /* Method to sum three input values */
    public static double sumOfThree(double firstVal, double secondVal, double thirdVal){
	double total;
	total = firstVal + secondVal + thirdVal;
	return total;
    }

    /* Method to average three input values */
    public static double averageOfThree(double x, double y, double z){
        double average;
        average = sumOfThree(x, y, z) / 3;
	return average;
    }

    /* Method to print some text */
    public static void farewellMessage(){
        System.out.println("End of Program");
    }

}
