/*  @author Russell Martin
 *  @date November 2017
*/
public class For5 {

    public static void main(String[] args)  {
         //**  !! WARNING!!  This is an infinite loop!
         for (int i = 1, j = 20;   ; i++, j = j-3)  { 
             System.out.println( i*j );
         }
    }
}
