//Write a program that takes two numbers as input and computes the product.
import java.util.Scanner;
//Imports the scanner utility.
public class InputAndProduct {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Input first number: ");
  int numberOne = in.nextInt();

  System.out.print("Input second number: ");
  int numberTwo = in.nextInt();
  System.out.print(numberOne + " x " +  numberTwo + " = " + (numberOne * numberTwo));
 }
}
