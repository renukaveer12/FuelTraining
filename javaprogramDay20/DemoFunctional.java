// FunctionalInterface
import java.util.*;
interface A<T>{
T add( T x, T y);
}
public class DemoFunctional{
public static void main(String[]args){
A<Integer>ob=(x,y)->x+y;
System.out.println(ob.add(200,500));
}
}
