import java.util.Scanner;

class Pattern3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int row = sc.nextInt();
        printPattern(ch, row);
    }

    public static void printPattern(char c, int n) {
        for (int i = 0; i < n; i++) {
            printLine(c, i);
        }
    }

    public static void printLine(char c, int col) {
        System.out.println();
        for (int j = 0; j <= col; j++) {
            System.out.print(c);
        }
    }
}