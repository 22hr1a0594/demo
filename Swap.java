import java.util.Scanner;
class Swap{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1,num2;
num1=sc.nextInt();
num2=sc.nextInt();
int temp;
temp=num1;
num1=num2;
num2=temp;
System.out.println(num1+"\n"+num2);
}
}