import java.util.Scanner;

class Pattern4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int row = sc.nextInt();
        printReversePattern(ch, row);
    }

    public static void printReversePattern(char c, int n) {
        for (int i = 0; i < n; i--) {
            printLine(c, i);
        }
    }

    public static void printLine(char c, int col) {
        System.out.println();
        for (int i = 1; j <= col; i++) {
            System.out.print(c);
        }
    }
}