/*  @author Russell Martin
 *  @date November 2017
*/
public class For4 {

    public static void main(String[] args)  {
         //  We can have more complicated initialization
         //  statements and update statements in the "for"
         //  loop, just as long as we have a termination
         //  condition.  
         for (int i = 1, j = 20; (i <= 10) && (j > i); i++, j = j - 3)  { 
             System.out.println( i*j );
         }
    }
}
