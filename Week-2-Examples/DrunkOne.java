/** RANDOM WALKS ON THE POSITIVE INTEGERS!
 *
 * Starting at the integer 5, take a step (randomly) one integer
 * to the left or right (that is, add or subtract one).  
 * Continue until you reach zero.  
 *
 * Note that the final number printed out will be 1, as that
 * is how you will arrive at zero in this case.  There is no
 * restriction on how far right you can move (i.e. how large
 * an integer you can reach), but you will eventually reach
 * zero and stop. 
 *
 * The "numberOfSteps" variable counts how many steps are 
 * taken.  It's initialized to 0 to correctly count the number
 * of steps taken.  
 *
 *  @author Russell Martin
 *  @date January 2018
 *  @author Michele Zito
 *  @date 5 Sept 2007
 */
public class DrunkOne {

   public static void main(String[] args) {
        final int START = 5;
        final int END = 0;

        int numberOfSteps = 0;

        //Take a step to the left or to the right
        for (int position = START;
                 position > END;
                 position += (int) Math.pow( (-1), Math.floor(2*Math.random())) ) 
            {  System.out.print(position + " ");  
               numberOfSteps++; 
            }

        System.out.println("\n");
        System.out.println("Number of steps taken: " + numberOfSteps);
   }
}
