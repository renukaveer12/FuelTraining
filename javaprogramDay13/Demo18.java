//indexof and lastindexof, contains
//isempty
import java.util.*;
public class Demo18{
public static void main(String[]args){
ArrayList<String>ar;
ar=new ArrayList<>();
ar.add("X");
ar.add("A");
ar.add("B");
ar.add("A");
System.out.println(ar.indexOf("A"));
System.out.println(ar.lastIndexOf("A"));
System.out.println(ar.lastIndexOf("Hello"));
String item="X";
if(ar.contains(item)){
System.out.println("Item present");
}
else{
System.out.println("Item not  present");
}
System.out.println(ar.isEmpty());
ar.clear();
System.out.println(ar.isEmpty());
}
}











