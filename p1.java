class Demo{
public static int add(int a,int b){
return a+b;
}
public static void main(String args[]){
int n1=Integer.parseInt(args[0]);
int n2=Integer.parseInt(args[1]);
int res=Demo.add(n1,n2);
System.out.println(res);
}
}
