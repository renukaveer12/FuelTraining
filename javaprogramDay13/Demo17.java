// remove and sublidt
import java.util.*;
public class Demo17{
public static void main (String[]args){
ArrayList<String>ar;
ar=new ArrayList<>();
ar.add("X");
ar.add("A");
ar.add("B");
ar.add("A");
ar.add("C");
ar.add("D");
ar.add("E");
System.out.println(ar);
ar.remove(3);
System.out.println(ar);
}
}
