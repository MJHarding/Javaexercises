import java.util.*;

public class RandGame {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;
        int total = 0;
        final int SCALE = 100;
        Random r = new Random();

        number = r.nextInt(SCALE);
        System.out.println(number);
        System.out.print("Enter your guess!");
        int guess = input.nextInt();

        higherOrLower(number, guess, total);


    }

    static String higherOrLower (int num1, int num2, int total){

    if (num2 == num1){
        System.out.print("Congratulations play again?: ");
        //Call response method
    }
    else if (num1 > num2){

        total += 1;
        System.out.print("Too low, guess again: ");
        guess = input.nextInt();
        higherOrLower(number, guess, total);

        }
    else if (num1 < num2) {

        total += 1;
        System.out.print("Too high! Guess again: ");
        guess = input.nextInt();
        higherOrLower(number,guess, total);
    }
  }
}
