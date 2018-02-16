import java.util.*;
//imports all utility
public class Factorial{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find the factorial of : ");
        long factorialNum = input.nextInt();
        System.out.println(factorial(factorialNum));


    }

    public static long factorial(long n){
        if (n<2) return 1;
        return n * factorial(n-1);
    }
}
