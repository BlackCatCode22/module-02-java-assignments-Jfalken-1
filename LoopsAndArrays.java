/*
* JF 8/29/24
*
* LoopsAndArrays
*
* This program will use the for loop to loop through
* a list of names stored in a string array.
*
 */
import java.util.Scanner;


public class LoopsAndArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // create a for loop that displays 'Hello there!' five times


        // The loop control variable of this for loop
        // is named i (it means integer).
        // This loop control variable must be: initialized, checked, and changed.

//        for (int i = 0; i <= 100; i++ ) {
//            System.out.println("The value of i is " + i);
//        }

        // Create a while loop that does the same thing.

//        int loopControlVariable = 0;
//        while (loopControlVariable < 10) {
//            System.out.println("The value of loopControlVariable is " + loopControlVariable);
//            // Change the loop control variable
//            loopControlVariable ++;
//        }


        // Create a string array of ten words.

        String[] names = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",};

        //Create an int array with 10 elements.
        int[] myNumbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter number " + (i+1));
            myNumbers[i] = scanner.nextInt();

        }

        // Output the myNumbers[] array
        for (int i=0; i< myNumbers.length; i++){
            System.out.println("The value of myNumbers[" + i + "] is..." + myNumbers[i]);
        }

//        System.out.println("one of our names is: " + names[2]);

        // Create a for loop that outputs all element values in the names array.

        // Output the length of names array
//        System.out.println("The length of the names array is: " +  names.length + "\n");


//        for (int i = 0; i < names.length; i++) {
//            System.out.println("names[" + i + "] is..." + names[i]);
//        }

        System.out.println("\nProgram end");
    }
}