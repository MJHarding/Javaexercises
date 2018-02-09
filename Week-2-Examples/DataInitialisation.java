/*  A short program just to show some data assignment statements.
 *  @author Frans Coenen 
 *  @author Clare Dixon
 *  @author Russell Martin, Dec 2017 
*/
      
public class DataInitialisation {
    
     public static void main(String[] args) {
       /* Declare and initialise variables. */
       int dataItem1;
       int dataItem2 = 1; 
       int dataItem3 = 2; 
       int dataItem4 = dataItem3;
       int dataItem5 = dataItem2+dataItem4;
       dataItem1 = 0;

       /* Output values associated with variables. */
       System.out.print(dataItem1 + " "); 
       System.out.print(dataItem2 + " ");
       System.out.print(dataItem3 + " ");
       System.out.print(dataItem4 + " ");
       System.out.println(dataItem5 + " ");
    }
}
