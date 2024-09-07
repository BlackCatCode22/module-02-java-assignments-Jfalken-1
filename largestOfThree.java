public class largestOfThree {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 2;
        int num3 = 3;
        int largestOfThree = 0;

// First, compare num1 and num2
        if (num1 > num2) {
            // Now compare num1 and num3
            if (num1 > num3) {
                largestOfThree = num1;
            } else {
                largestOfThree = num3;
            }
        } else {
            // If num2 is greater than num1, compare num2 and num3
            if (num2 > num3) {
                largestOfThree = num2;
            } else {
                largestOfThree = num3;
            }
        }

        System.out.println("The largest of the three numbers is: " + largestOfThree);

    }
}