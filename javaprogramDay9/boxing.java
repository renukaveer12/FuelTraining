import java.util.*;
class Wrapper{
public static void main(String[] args){
//boxing
int x=102;
Integer ob = new Integer(x);
//unboxing
int y;
y= ob.intValue();
//autoboxing
int p=104;
Integer ob2=p;
// autounboxing
int a;
a = ob2;

System.out.println(y);
Sytstem.out.println(p);
System.out.println(a);
}
}
