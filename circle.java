class Circle{
int radius;

void insert(int r){
radius=r;
}
void calculateArea(){
System.out.println(2*3.14*radius*radius);}
}
class Circle1{
public static void main(String args[]){
Circle r1=new Circle();
Circle r2=new Circle();
r1.insert(5);
r2.insert(34);
r1.calculateArea();
r2.calculateArea();
}
}