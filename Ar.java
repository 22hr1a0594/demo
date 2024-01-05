import java.util.Scanner;

class Ar {
    public static void printPattern(char c, int n) {
        int i = 1;
        while (i <= n) {
            printLine(c, i);
            i++;
        }
        i = n - 1;
        while (i >= 1) {
            printLine(c, i);
            i--;
        }
    }

    public static void printLine(char c, int col) {
        int j = 1;
        while (j <= col) {
            System.out.print(c);
            j++;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int row = sc.nextInt();
        printPattern(ch, row);
    }
}