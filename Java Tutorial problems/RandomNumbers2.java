/** Generating random numbers, and summing them up.
 *
 *  A short program to demonstrate how
 *  to use one method from the Random library.   
 *
 *  @author Russell Martin
 *  @date November 2017
 */
import java.util.Random;

public class RandomNumbers2 {

   public static void main(String[] args) {
        
        int number;
        int sum = 0;
        final int HOWMANY = 10;
        final int SCALE = 5;

        Random r = new Random();

        //  Generate a random integer in the set { 1...SCALE }
        //  Sum all these integers (i.e. HOWMANY such integers
        for (int loop = 0;
                 loop < HOWMANY;
                 loop++ ) 
            {  //  the nextInt(SCALE) method (in the Random library) 
               //  will return a (pseudorandom) integer in the
               //  set { 0, ..., SCALE-1 }
               number = r.nextInt(SCALE) + 1;
               System.out.print(number + " ");  
               sum += number;
            }
        System.out.println("\n\nSum of " + HOWMANY + " random numbers from { 1,...," + SCALE +" } is " + sum + ".\n");
   }
}
