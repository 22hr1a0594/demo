import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0')
System.out.println("IT IS A DIGIT");
else
System.out.println("IT IS NOT A DIGIT");
}
}