//Binary to hex converter.
//needs to convert binary to decimal then to hex.
import java.util.Scanner;
public class BinaryToHex {
 public static void main(String[] args){
  Scanner in = new Scanner(System.in);

  //ask for a binary number.
  System.out.print("Please enter a binary number to convert: ");
  long binaryIn = in.nextLong(); //scan in a long number
  //While string var not empty, seperate last 4 binary digits,
  // if /= 4 length then add 0's to the front
  //convert binary to hex and store in value -- hex = newhex + hex
  //exit loop eventually and print hex
 }
}
