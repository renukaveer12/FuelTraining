import java.util.*;
class Test1{
void add(int x,int y) {
System.out.println("Int Addition");
System.out.println(x+y);
}
void add (float x, float y){
System.out.println("float addition");
System.out.println(x+y);
}
}
public class Demooverload {
public static void main(String args [])
{
Test1 t1=new Test1();
t1.add(1.2f, 2.3f);
t1.add(100, 500);
}
}