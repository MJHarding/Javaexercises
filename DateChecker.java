import java.util.Scanner;

public class DateChecker {
   public static void main(String[] args){
    int month = getIntInRange(1,12,"Enter the month of your birth: ");
    int day = getIntDay (1, 31, "Enter the day in the month you were born on: ");
    int year = getIntYear(1900, 2018, "Enter the year you were born: ")
    System.out.print(day + " " + monthToString(month) + " "+ year) ;
   }

   static int getIntInRange (int lower, int upper, String text){
     Scanner input = new Scanner(System.in);
     System.out.print(text);
     int value = input.nextInt();
        //Check if value is greater than or lower than boundaries.
      if (value < lower || value > upper) {
       //if wrong print error message and recall method with new text.
        return getIntInRange(1,12,"Error, please enter a valid month: ");
      }

      else {
       return value;
      }
   }



   static int getIntDay (int lower, int upper, String text){
     Scanner input = new Scanner(System.in);
     System.out.print(text);
     int value = input.nextInt();
        //Check if value is greater than or lower than boundaries.
      if (value < lower || value > upper) {
       //if wrong print error message and recall method with new text.
        return getIntInRange(1,31,"Error, please enter a valid day: ");
      }

      else {
       return value;
      }
   }

   static int getIntYear (int lower, int upper, String text){
     Scanner input = new Scanner(System.in);
     System.out.print(text);
     int value = input.nextInt();
        //Check if value is greater than or lower than boundaries.
      if (value < lower || value > upper) {
       //if wrong print error message and recall method with new text.
        return getIntInRange(1900,2018,"Error, please enter a valid year: ");
      }

      else {
       return value;
      }
   }

   static String monthToString (int number){ //monthToString is method name
      String monthString = "Not Assigned";//assign a variable
      switch (number){
            case 1: monthString = "January";
                    break;
            case 2: monthString = "February";
                    break;
            case 3: monthString = "March";
                    break;
            case 4: monthString = "April";
                    break;
            case 5: monthString = "May";
                    break;
            case 6: monthString = "June";
                    break;
            case 7: monthString = "July";
                    break;
            case 8: monthString = "August";
                    break;
            case 9: monthString = "September";
                    break;
            case 10: monthString = "October";
                    break;
            case 11: monthString = "November";
                    break;
            case 12: monthString = "December";
                    break;
      }
      return monthString; //return result.
   }
}
