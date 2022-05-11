//ArrayList Class
import java.util.*;
public class Demo16{
public static void main(String[]args){
ArrayList<String>ar;
ar=new ArrayList<>();
System.out.println(ar.size());
ar.add("A");
ar.add("B");
ar.add("C");
ar.add("D");
ar.add("E");
System.out.println(ar.get(0));
ar.add(1,"X");
System.out.println(" by using for loop....");
for(int i=0;i<ar.size();i++){
System.out.println(ar.get(i));
}
System.out.println(" by using for each loop....");
for(String s:ar){
System.out.println(s);
}
System.out.println(" by using Iterator");
Iterator<String>it;
it=ar.iterator();
while(it.hasNext()){
System.out.println(it.next());
}
System.out.println(" by using ListIterator");
ListIterator it1;
it1=ar.listIterator();
System.out.println(" forward...");
while(it1.hasPrevious()){
System.out.println(it1.previous());
}
}
}








