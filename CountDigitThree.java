import java.util.Scanner;

public class CountDigitThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the value of n from the user
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        // Iterate through numbers from 0 to n and count occurrences of digit 3
        for (int i = 0; i <= n; i++) {
            int count = countDigitThree(i);
            System.out.println("Number " + i + ": " + count + " occurrences of digit 3");
        }
        
        scanner.close();
    }

    // Function to count occurrences of digit 3 in a given number
    private static int countDigitThree(int num) {
        int count = 0;
        
        // Convert the number to a string for easier digit extraction
        String numStr = Integer.toString(num);
        
        // Iterate through each character in the string and count occurrences of '3'
        for (char digit : numStr.toCharArray()) {
            if (digit == '3') {
                count++;
            }
        }
        
        return count;
    }
}