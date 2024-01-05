import java.util.Scanner;

class Factors{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printFactors(n);
    scanner.close();
    }

    private static void printFactors(int num) {
        for (int i = 1; i <= num; ++i) {
            if (num % i == 0) {
                System.out.print(i);
             if(i!=num)System.out.print(",");
            }
        }
    }
}