import java.util.Scanner;

public class LeapYearCheck {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a year to check!: ");
        int num = input.nextInt();
    //    System.out.println(isLeapYear(num));
        System.out.println(num);
    }


    static boolean isLeapYear (int num){
    boolean isLeapYear = false;
    switch (num){
        case (num < 100 && (num % 4 == 0)): isLeapYear = true;
             break;
        case (num % 4 == 0):
        case (num % 100 == 0 && num % 400 == 0): isLeapYear = true;
             break;
        case (num % 100 == 0 && num % 400 != 0): isLeapYear = false;
        break;
    }
        return isLeapYear;
}
}
