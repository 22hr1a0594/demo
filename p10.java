import java.io.*;
import java.util.*;
class Test{
static public void main(String args[])
{
Scanner sc=new Scanner(System.in);
int inpvar=sc.nextInt();
}
piblic static printDay(int dayno){
String day;
switch(dayno){
case0:
{
day="SUNDAY";
break;
}
case 1:
{
day="MONDAY";
break;
}
case 2:
{
day="TUESDAY";
break;
}
case 3:
{
day="WENSDAY";
break;
}
case 4:
{
day="THURSDAY";
break;
}
case 5:
{
day="FRIDAY";
break;
}
case 6:
{
day="SATURDAY";
break;
}
default:day="invalid";
}
return day;
}
}