import java.util.Scanner;
class Countdig
{
static boolean checkDigit(char c)
{
boolean b;
if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9')
{
b=true;
}
else
{
b=false;
}
return b;
}
public static void main(String args[]){
String str;
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("");
System.out.println("enter a String:");
str=sc.nextLine();
System.out.println("");
for(int i=0;i<str.length();i++)
{
if(checkDigit(str.charAt(i)))
{
count++;
}
}
System.out.println(count);
}
}