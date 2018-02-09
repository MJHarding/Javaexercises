/** A simple demonstration of defining and using a method. 
 */

public class MaximumDemo {

   public static void main (String args[]) {

      int x = 27;
      int y = 13;
      System.out.println("The maximum of x and y is " + maximum(x,y));

   }  /*  End of "main" method  */     

   public static int maximum(int a, int b)  {
  
      int result;
      if (a >= b)
          result = a;
      else
          result = b;

      return result;
   }
}

