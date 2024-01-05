import java.util.Scanner;
class Dif{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int diff=Math.abs(num1-num2);
System.out.println(diff);
}
}