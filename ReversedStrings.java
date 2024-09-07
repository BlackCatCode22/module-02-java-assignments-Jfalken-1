public class ReversedStrings {
    public static void main(String[] args) {
        // Initial string to be reversed
        String forwardStr = "Hello World!";

        // Empty string to hold the reversed version of forwardStr
        String reverseStr = "";

        // Loop to reverse the string by iterating from the last character to the first
        for (int i = forwardStr.length() - 1; i >= 0; i--) {
            // Add each character from the end of forwardStr to reverseStr
            reverseStr += forwardStr.charAt(i);
        }

        // Loop to display each character in forwardStr and its corresponding character in reverseStr
        for (int i = 0; i < forwardStr.length(); i++) {
            System.out.println("Forward: " + forwardStr.charAt(i) + " |" + " Reverse: " + reverseStr.charAt(i));
        }
        
    }
}
