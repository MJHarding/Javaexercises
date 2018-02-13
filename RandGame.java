import java.util.*;

public class RandGame {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // int number;
        // int sum = 0;
    //    int total = 0;

        int ranNum = genRandom();
        System.out.println(ranNum);

        System.out.print("Enter your guess!  ");
        int guess = input.nextInt();


        //call function methods.

        higherOrLower(ranNum, guess);
    }



    static int genRandom(){
        final int SCALE = 100;
        Random r = new Random();
        int number = r.nextInt(SCALE);

        return number;
    }




    static String higherOrLower (int num1, int num2){
    Scanner input = new Scanner(System.in);
    int number = num1;
    int guess = num2;


    if (num2 == num1){
        System.out.print("Congratulations play again?(y/n): ");
        playAgain();
        //Call response method
    }


    else if (num1 > num2){
    //    total += 1;
        System.out.print("Too low, guess again: ");
        int newGuess = input.nextInt();
        higherOrLower(number, newGuess);
        }


    else if (num1 < num2) {

    //    total += 1;
        System.out.print("Too high! Guess again: ");
        int newGuess = input.nextInt();
        higherOrLower(number,newGuess);
    }
    return "Correct";
  }



  static void playAgain(){

      Scanner input = new Scanner(System.in);
      char answer = input.next().charAt(0);

      switch (answer){

          case 'y': //restart (cannot call main)  newgGame();
          case 'n': System.exit(0); //exit
            break;
          default: //Incorrect input
      }
  }
}
