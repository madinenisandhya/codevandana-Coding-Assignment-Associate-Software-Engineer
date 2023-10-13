public class PangramChecker {
    public static boolean isPangram(String input) {
        // Define an array to track the occurrence of each alphabet letter
        boolean[] alphabet = new boolean[26];

        // Convert the input to lowercase to make the check case-insensitive
        input = input.toLowerCase();

        // Iterate through the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Check if the character is a lowercase letter
            if (c >= 'a' && c <= 'z') {
                // Mark the corresponding index in the alphabet array
                alphabet[c - 'a'] = true;
            }
        }

        // Check if all alphabet letters have been marked
        for (boolean letter : alphabet) {
            if (!letter) {
                return false; // If any letter is not marked, it's not a pangram
            }
        }

        return true; // All letters were marked, so it's a pangram
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
