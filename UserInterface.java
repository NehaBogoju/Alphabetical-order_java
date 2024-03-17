import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sentence
        System.out.println("Enter the sentence:");
        String sentence = scanner.nextLine();

        // Check if the sentence contains only alphabets and spaces
        if (!isValidInput(sentence)) {
            System.out.println(sentence + " is an invalid input");
            scanner.close();
            return;
        }

        // Arrange the letters in alphabetical order for each word
        String arrangedSentence = arrangeLettersAlphabetically(sentence);

        // Output the arranged sentence
        System.out.println(arrangedSentence);

        scanner.close();
    }

    private static boolean isValidInput(String sentence) {
        // Check if the sentence contains only alphabets and spaces
        for (char c : sentence.toCharArray()) {
            if (!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }

    private static String arrangeLettersAlphabetically(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        StringBuilder arrangedSentence = new StringBuilder();

        // Arrange the letters in alphabetical order for each word
        for (String word : words) {
            char[] letters = word.toCharArray();
            java.util.Arrays.sort(letters);
            arrangedSentence.append(new String(letters)).append(" ");
        }

        return arrangedSentence.toString().trim();
    }
}
