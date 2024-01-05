import java.util.Scanner;
class Armstrong2{
public static int lenDigit(int n){
int len=0;
while(n>0){len++;n=n/10;}
return len;
}
public static boolean checkArmstrong(final int n){
int sum=0;
int exp=lenDigit(n);
int num=n;
while(num>0)
{
sum+=(int)Math.pow((num%10),exp);
num=num/10;
}
return n==sum;
}
public static void main(String args[]){
for(int i=1000;i<9999;i++){
if(checkArmstrong(i))System.out.print(i+"");}
}
}
