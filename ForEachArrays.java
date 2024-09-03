// JF
// 9/3/2024
// ForEachArrays


public class ForEachArrays {
    public static void main(String[] args) {

        // Create an array of cars. Do this two different ways and be able to explain to my lab partner.

        // Create a cars[] array using initialization
        String[] cars = {"BMW", "Ford", "Honda"};


        //Create a 4 element String array named myCars
        String[] myCars = new String[4];

        // Fill the newly created String[] array with data.
        myCars[0] = "Ford";
        myCars[1] = "Honda";
        myCars[2] = "GMC";
        myCars[3] = "Jeep";
//
//
//        // Use a for each loop to output myCars array
//        for (String car : myCars) {
//            System.out.println("A car in myCars array is: " + car);
//        }

        // Output the cars array using a for each loop
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//        }

        // use a for : each loop to do the same thing.
//        for (String car : cars) {
//            System.out.println(car);
//        }


//        String[] myStrings = new String[60];
//        int stringIndex = 1;
//
//        // Use a for loop to fill the array with strings
//        for (int i = 0; i < myStrings.length; i++) {
//            // fill the array
//            myStrings[i] = "this is string #" + stringIndex;
//            stringIndex++;
//        }
//
//
//        //use a for each loop to output the myStrings[] array
//        for (String aString : myStrings) {
//            System.out.println(aString);
//        }

        String stringToReverse = "abcdefg";

        for (int i = 0; i < 7; i++) {
            System.out.println("stringToReverse[" + i + "] is: " + stringToReverse.charAt(i));
        }

        // Create the reverse string
        String reversedStr = "";

        System.out.println("reversedStr before reversion loop is: " + stringToReverse);

        for (int i = 6; i >= 0; i--) {
            char charToAdd = stringToReverse.charAt(i);
            reversedStr = reversedStr.concat(Character.toString(charToAdd));
        }

        System.out.println("the reversed string is: " + reversedStr);


        System.out.println("\n My for loop is done");

    }
}