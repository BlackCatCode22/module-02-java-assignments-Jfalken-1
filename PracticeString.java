// JF 08/27/24
// PracticeString

public class PracticeString {
    public static void main(String[] args) {

        String testString = "";
        testString = "Hello World";
       int testInt = 0;
//        char testChar = 'x';
//        double testDouble = 0.0;

        testInt = testString.length();
        boolean isItThere = false;
        char testChar = 'x';
        testChar = testString.charAt(2);
        int charInt = 0;

        String indexOfTest = "e";
        int indexOftestInt = testString.indexOf(indexOfTest);

        System.out.println("\nmy practice string is: " + testString);
        System.out.println("my practice string .toLowerCase is: " + testString.toLowerCase());
        System.out.println("my practice string .toUpperCase is: " + testString.toUpperCase());

        System.out.println("\n" + indexOfTest + " appears at index of " + indexOftestInt);

        // replace 0 with variable
        System.out.println("\nThe char at 0 is: " + testChar);

        // add an end point variable
        int subStringTestInt = 10;
        String subStringTest = testString.substring(subStringTestInt);
        System.out.println("\nmy subString is: " + subStringTest);

        System.out.println("\nthe length of " + testString + " is " + testInt);

        isItThere = testString.contains("H");

        System.out.println("\nValue of isItThere is: " + isItThere);

        // work on lastIndexOf
        String lastIndexOfTest = "l";
        int letterLastAppearsAt = testString.lastIndexOf(lastIndexOfTest);
        System.out.println("\nthe letter " + lastIndexOfTest + " appears last at index: " + letterLastAppearsAt);

        System.out.println("\nmy practice string contains \"H\" is: " + testString.contains("H"));
        System.out.println("my practice string contains \"BBBBBBBB\" is: " + testString.contains("BBBBBBBB"));

    }
}