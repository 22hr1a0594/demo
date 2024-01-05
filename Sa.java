import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);
        if (Character.isLetter(input)) {
            System.out.println(input + " is an alphabet.");
        } else {
            System.out.println(input + " is not an alphabet.");
        }

        scanner.close();
    }
}