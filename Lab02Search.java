import java.util.*;
import java.io.*;

class Lab02Search {

	private static Scanner keyboardInput = new Scanner (System.in);


	// main program
	public static void main(String[] args) throws Exception {
		int key=0, n=20;
		int[] data = {15, 25, 10, 30, 35, 20, 5, 60, 80, 65, 75, 70, 100, 55, 90, 45, 50, 85, 95, 40};
		int[] sortdata = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100};

		// get an integer input key to search
		// note: there is no error checking
		try {
			System.out.print("Enter an integer to search: ");
			key = keyboardInput.nextInt();
		}
		catch (Exception e) {
			keyboardInput.next();
			System.exit(0);
		}
		sequential_search(data, n, key);
		binary_search(sortdata, n, key);
	}

	// data[] is an array, n is size of array, key is the number we want to find
	static void sequential_search(int[] data, int n, int key) {
		int i, count;
		boolean found;

		// start linear search on the array called data[]
		found = false;	// to indicate if the number is found
		i = 0;		// an index variable to iterate through the array
		count = 0;	// to count how many comparisons are made
		while (i<n && found==false) {
			if (data[i] == key) {
				found = true;
			} else {
				i = i+1;
			}
			count = count+1;
		}
		System.out.print("The number " + key + " is ");
		if (found == false)
			System.out.print("not ");
		System.out.println("found by linear search and the number of comparisons used is " + count);
	}

	// sortdata[] is an array in ascending order, n is size of array, key is the number we want to find
	static void binary_search(int[] sortdata, int n, int key) {
		int count;
		boolean found;
		int first, last, mid;

		// start binary search on the sorted array called sortdata[]
		found = false;	// to indicate if the number is found
		first = 0;	// to indicate the beginning of the range being searched
		last = n-1;	// to indicate the end of the range being searched
		count = 0;	// to count how many comparisons are made

        ;

		// FILL in the code here
        while (first <= last && found == false)
        {
            mid = (first + last) / 2;

            if (sortdata[mid] == key)
            {
            found = true;
            }

            else  if (key < sortdata[mid])
                {
                    last = mid - 1 ;
                }

            else
                {
                    first = mid + 1;
                }


         count = count + 1;
        }


		System.out.print("The number " + key + " is ");
		if (found == false)
			System.out.print("not ");
		System.out.println("found by binary search and the number of comparisons used is " + count);
	}

}
