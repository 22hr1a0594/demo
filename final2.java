class Bike{
final void run(){System.out.println("running safely with 100kmph");}
}
class Honda extends Bike{
public static void main(String args[]){
new Honda().run();
}
}