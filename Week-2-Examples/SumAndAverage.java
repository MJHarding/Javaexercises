/*  Takes input form the keyboard and outputs sum and average.
 *
 *  @author Russell Martin
 *  @date January 2018
 *  @author Clare Dixon
 *  @date August 2010
*/

import java.util.Scanner;

public class SumAndAverage {

    public static void main(String [] args) {
          // variables
          Scanner input = new Scanner(System.in);
          int total = 0;
          int count = 0;
          int value;

          //  first input
          System.out.print("Input a positive integer (or 0 or negative integer to end): ");
          value = input.nextInt();

          // loop to obtain more input
          while (value !=  0) {
              total = total + value;
              count = count + 1;
              System.out.print("Input a positive integer (or 0 or negative integer to end): ");
              value = input.nextInt();
          }

          //output
          if (count > 0 || count < 0) {
             System.out.println("There were " + count + " numbers entered.");
             System.out.println("Sum is: " + total);
             System.out.println("Average is: " + (1.0*total/count));
          }
          else
             System.out.println("No numbers entered.");
    }
}
