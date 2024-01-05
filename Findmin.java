import java.util.*;
class Findmin{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int min;
if(a<b)
{
if(a<c)min=a;
else min=c;
}
else
{
if(b<c)min=b;
else min=c;
}
System.out.println("minimum no is"+min);
}
}