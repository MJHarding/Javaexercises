/** Generating random numbers, and summing them up.
 *
 *  Essentially a short program to demonstrate how
 *  to use the Math.random() function.   
 *
 *  @author Russell Martin
 *  @date November 2017
 */
public class RandomNumbers {

   public static void main(String[] args) {
        
        int number;
        int sum = 0;
        final int HOWMANY = 10;
        final int SCALE = 5;

        //  Generate a random integer in the set { 1...SCALE }
        //  Sum all these integers (i.e. HOWMANY such integers
        for (int loop = 0;
                 loop < HOWMANY;
                 loop++ ) 
            {  
               //  Math.random() gives a double in the range [0.0, 1)
               //  We can scale that to the range [0.0, SCALE) by multiplying
               //  by SCALE.  Adding 1 gives a value in the range
               //  [1.0, SCALE+1), so taking the floor (converting to an
               //  int in this case) gives an integer in the set
               //  { 1, ..., SCALE }.  
               number = (int)(Math.random()*SCALE + 1);
               System.out.print(number + " ");  
               sum += number;
            }

        System.out.println("\n\nSum of " + HOWMANY + " random numbers from { 1,...," + SCALE +" } is " + sum + ".\n");
   }
}
