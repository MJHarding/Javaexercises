import java.util.Scanner;
public class Tutorial1 {
 public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  int r = 12;
  double x = (1.0/3);
  //double y = (x * 3); outputs 1.0
  double y = (x + x + x);//output is 1.0
  double area = (Math.PI * Math.pow(r, 2));
  double circumference = (2 * Math.PI * r);
  double sideA = 5;
  double sideB = 3;
  double sideA2 = 12;
  double sideB2 = 4;
  double theta = (Math.PI/2) ;
  double sideC = (Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)));//calc root(a^2+ b+2)
  double sideC2 = (Math.sqrt(Math.pow(sideA2 , 2) + (Math.pow(sideB2, 2) - (2 * sideA2 * sideB2 * Math.cos(theta) ))));
  System.out.println(0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1); //prints out 0.999999999
  System.out.println(1/2 + 1/2); //prints out 0
  System.out.println(y);//output is 1.0
  System.out.println(1-0.9);//output is 0.09
  System.out.println(1-0.99);//output is 0.01000000000009
  System.out.println(1-0.999);//output is 0.00100000000009
  System.out.println(area);//outputs area as double
  System.out.println(circumference);//outputs the circumferance as double
  System.out.println(sideC);//output side C


  //------Test case by rearranging formula and checking equality----------//
  if(Math.sqrt(Math.pow(sideC,2) - Math.pow(sideB,2)) ==5){
   System.out.println("It works - Trust me");
  }
  else {
    System.out.println("Doesnt work");
  }
  //---------------------------------------------------------------------//


  System.out.println(sideC2); //output side of C for q4
  System.out.print("Input first side length: "); //ask for side lengths and angle in degrees
  double sideOne = in.nextDouble();
  System.out.print("Input second side length: ");
  double sideTwo = in.nextDouble();
  System.out.print("Input largest angle in degrees: ");
  double angle = Math.toRadians(in.nextDouble()); //convert degrees to radians
  System.out.println(Math.sqrt(Math.pow(sideOne , 2) + (Math.pow(sideTwo, 2) - (2 * sideOne * sideTwo * Math.cos(angle) ))));
 }
}
