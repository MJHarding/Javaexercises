//Take two inputs and output the calculations for + - X / and mod
import java.util.Scanner;
//imports the scanner utility
public class InputsCalculations {
 public static void main(String[] args){
   Scanner in = new Scanner(System.in);
   System.out.print("Input first number: ");
   int numberOne = in.nextInt();

   System.out.print("Input second number: ");
   int numberTwo = in.nextInt();
   System.out.println(numberOne + " + " +  numberTwo + " = " + (numberOne + numberTwo));
   System.out.println(numberOne + " - " +  numberTwo + " = " + (numberOne - numberTwo));
   System.out.println(numberOne + " X " +  numberTwo + " = " + (numberOne * numberTwo));
   System.out.println(numberOne + " / " +  numberTwo + " = " + (numberOne / numberTwo));
   System.out.println(numberOne + " mod " +  numberTwo + " = " + (numberOne % numberTwo));

 }

}
