import java.util.Scanner;

class CountFactors{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
         int count=0;
        for (int i = 1; i <= num; ++i) {
            if (num % i == 0) {
              count++;
                System.out.print(i);
             if(i!=num)System.out.print(",");
            }
        }
          System.out.println("\n count of"+num+"is"+count);
    }
}