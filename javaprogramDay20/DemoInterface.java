import java.util.*;
interface A{
void add(int x, int y);
}
class Test implements A{
public void add(int x,int y){
System.out.println(x+y);
}
}
public class DemoInterface{
public static void main(String[]args){
Test t1= new Test();
t1.add(10,20);
A ob1=new A(){
public void add(int x,int y){
System.out.println(x+y);
}
};
ob1.add(100,200);
}
}
