//JF
// 9/5/2024
// MaddnessWithMethods

import java.util.Scanner;

public class MaddnessWithMethods {
    public static void main(String[] args) {

        // call getUserInput method
        int userInputNum = 0;
        userInputNum = getUserInput();
        System.out.println("\nThe user input the number: " + userInputNum);



        // call the compareTwoInts method
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nenter first int");
        int firstNumber = scanner.nextInt();
        System.out.println("\nenter second int");
        int secondNumber = scanner.nextInt();
        int largerNum = compareTwoInts(firstNumber, secondNumber);
        System.out.println("\nThe largest of " + firstNumber + " and " + secondNumber + " is: " + largerNum);


        System.out.println("\nSum of two ints: Enter first int: ");
        int num1 = scanner.nextInt();
        System.out.println("\nSum of two ints: Enter second int: ");
        int num2 = scanner.nextInt();
        int intsSum = sumOfInts(num1, num2);
        System.out.println("\nThe sum of " + num1 + " and " + num2 + " is: " + intsSum);
    }


    // METHODS

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nenter an int");
        int userInput = scanner.nextInt();
        return userInput;

    }

    public static int compareTwoInts (int num1, int num2) {
        int largest = 0;
        if (num1 > num2) {
            largest = num1;
        } else {
            largest = num2;
        }

        return largest;
    }

    public static int sumOfInts (int num1, int num2) {
        int sum = 0;
        sum = num1 + num2;
        return sum;
    }
}
