import java.util.*;
import java.util.Map.Entry;
class DemomapEntry1{
public static void main(String[]args){
HashMap<Integer,String>map1;
map1=new HashMap<>();
map1.put(10,"A");
map1.put(20,"B");
map1.put(40,"C");
System.out.println(map1);
// Read All Keys
Set<Integer>keys;
keys=map1.keySet();
System.out.println("keys....");
for(Integer k:keys){
System.out.println(k);
}
// Read All Values
Collection<String>values;
values=map1.values();
System.out.println("values...");
for(String v:values){
System.out.println(v);
}
// Read keys+Values
System.out.println("Items");
Set<Entry<Integer,String>>items;
items= map1.entrySet();
for(Entry<Integer,String>e1:items){
System.out.println(e1.getKey()+"."+e1.getValue());
}
}
}
