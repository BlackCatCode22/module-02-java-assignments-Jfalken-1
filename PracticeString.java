// JF 08/27/24
// PracticeString

public class PracticeString {
    public static void main(String[] args) {

        String testString = "";
        testString = "Hello World";


        boolean isItThere = false;
        int charInt = 0;



        System.out.println("\nmy practice string is: " + testString);
        System.out.println("my practice string .toLowerCase is: " + testString.toLowerCase());
        System.out.println("my practice string .toUpperCase is: " + testString.toUpperCase());


        String indexOfTest = "H";
        int indexOftestInt = testString.indexOf(indexOfTest);
        System.out.println("\n" + indexOfTest + " appears at index of " + indexOftestInt);

        char testChar = 'x';
        int chatAtInt = 6;
        testChar = testString.charAt(chatAtInt);
        System.out.println("\nThe char at index " + chatAtInt + " is: " + testChar);

        int subStringTestStart = 0;
        int subStringTestEnd = 2;
        String subStringTest = testString.substring(subStringTestStart, subStringTestEnd);
        System.out.println("\nmy subString is: " + subStringTest);

        int lengthTest = 0;
        lengthTest = testString.length();
        System.out.println("\nthe length of " + testString + " is " + lengthTest);

        String lastIndexOfTest = "o";
        int letterLastAppearsAt = testString.lastIndexOf(lastIndexOfTest);
        System.out.println("\nthe letter " + lastIndexOfTest + " appears last at index: " + letterLastAppearsAt);

        String stringContainsTest = "Z";
        if (testString.contains(stringContainsTest)) {
            System.out.println("\nThe string contains " + stringContainsTest);
        } else {
            System.out.println("\nThe string does not contain " + stringContainsTest);
        }

    }
}