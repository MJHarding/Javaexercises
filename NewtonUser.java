import java.util.*;

public class NewtonUser {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to get a root of. ");
        double num1 = input.nextDouble();

        System.out.print("Enter your guess: ");
        double num2 = input.nextDouble();

        Newton newNewton = new Newton(num1, num2);
        System.out.println(newNewton.getGuess());    
        //System.out.println(num1 "+" num2);
    }
}
