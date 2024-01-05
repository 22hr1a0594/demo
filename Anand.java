import java.util.Scanner;
class Anand{
public static int add(int a,int b){
return a+b;
}
public static void printTable(int a){
for(int i=0;i<=10;i++)
System.out.println(a+"*"+i+"="+a*i);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int res=Anand.add(n1,n2);
System.out.println(res);
Anand.printTable(n1);
Anand.printTable(n2);
}
}