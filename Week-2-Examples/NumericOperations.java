/*  Demonstrate some simple numeric operations.
 *  @author Clare Dixon June 2010
 *  @author, Dec 2017
*/
      
public class NumericOperations {

    public static void main(String[] args) {
       /* Declare and initialise local variables. */
       int dataItem1  =11;
       int dataItem2 = 2; 
       double dataItem3 = 3.0; 
       double dataItem4 = 10.0;

       /* Experiment with division and remainder */
       System.out.println(dataItem1/dataItem2);
       System.out.println(dataItem1 % dataItem2);
       System.out.println(dataItem4 / dataItem3);
       System.out.println(dataItem4 / dataItem2);

       /* Experiment with promotion */
       System.out.println(dataItem1 + dataItem2);
       System.out.println(1 * dataItem3);
       System.out.println(dataItem1 * dataItem4);
    }
}
