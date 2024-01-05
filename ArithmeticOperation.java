import java.util.Scanner;
class ArithmaticOperation{
public static void main(String ags[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Frist number:");
int num1=sc.nextInt();
System.out.println("Enter a Second number:");
int num2=sc.nextInt();
int sum=num1+num2;
int difference=num1-num2;
int product=num1*num2;
int div=num1/num2;
int quotient=num1%num2;
System.out.println("The sum of two number:"+sum);
System.out.println("The difference of two number:"+difference);
System.out.println("The product of two number:"+product);
System.out.println("The div of two number:"+div);
System.out.println("The quotient of two number:"+quotient);
}
}





