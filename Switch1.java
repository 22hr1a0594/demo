import java.util.Scanner;
class Switch1
{
public static void displayDay(int n)
{
switch(n)
{
case 0:System.out.println("JANNUARY");
break;
case 1:System.out.println("FEBRUARY");
break;
case 2:System.out.println("MARCH");
break;
case 3:System.out.println("APRIL");
break;
case 4:System.out.println("MAY");
break;
case 5:System.out.println("JUNE");
break;
case 6:System.out.println("JULY");
break;
case 7:System.out.println("AUGEST");
break;
case 8:System.out.println("SEPTMEMBER");
break;
case 9:System.out.println("OCTOBER");
break;
case 10:System.out.println("NOV");
break;
case 11:System.out.println("DEC");
break;
default:System.out.println("INVALID");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int dn;
dn=sc.nextInt();
displayDay(dn);
}
}