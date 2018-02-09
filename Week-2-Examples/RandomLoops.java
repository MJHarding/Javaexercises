/** RANDOM WALKS ON THE POSITIVE INTEGERS UP TO 9!
 * 
 * Starting at the integer 5, move (randomly) to any
 * of the integers 0, 1, 2, ..., 9.  (This could include
 * you staying in the same position from one step to
 * another.)
 *
 * Continue doing so until you reach zero and stop.
 * Note that the last number printed out is positive,
 * and is the last number visited before hitting zero.
 *
 * @author Michele Zito
 * @date 5 Sept 2007
 */

public class RandomLoops {

    public static void main(String[] args) {
         final int START_CONDITION = 5;
         final int END_CONDITION = 0;

         //  Take a step to a random location 0, ..., 9
         for (int loopParameter = START_CONDITION;
                  loopParameter > END_CONDITION;
                  loopParameter = (int) Math.floor( 10*Math.random()) )
             {  System.out.print(loopParameter + " ");  }

         System.out.println("\n");
    }
}
