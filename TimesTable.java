//Write a Java program that takes a number as
//input and prints its multiplication table  up to 10

import java.util.Scanner;
public class TimesTable {
 public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  System.out.print("Enter number to be multiplied: ");
  int numberOne = in.nextInt();
  int i = 1;
  for(i=1; i<=10; i++){
   System.out.println(numberOne * i);
  }
 }
}
