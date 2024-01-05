import java.util.Scanner;
class Input2{
public static double div(int a,int b)
{
double c=a/b;
return c;
}
public static int add(int a,int b)
{double c=(double)a+(double)b;
return c;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("enter a number:");
int num1;
num1=sc.nextInt();
System.out.println("enter a number:");
int num2;
num2=sc.nextInt();
System.out.println(num1+"+"+num2+"="+add(num1,num2));
System.out.println(num1+"/"+num2+"="+div(num1,num2));
}
}

