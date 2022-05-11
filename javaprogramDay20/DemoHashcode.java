import java.util.*;
class student{
int id;
String name;
student(int a, String b){
id=a;
name=b;
}
public String toString(){
return"("+id+", "+name+")";
}
public int hashcode(){
int code;
code= name.hascode()+id;
return code;
}
public boolean equals( object obj){
boolean f= false;
student st=(student)obj;
if(id==st.id && name.equals(st.name)){
f= true;
}
return f;
}
}
public class DemoHascode{
public static void main(String[]args){
Hashset<student>hs;
hs= new Hashset<>();
student st1= new student(1,"A");
student st2= new student(1,"A");
hs.add(st1);
hs.add(st2);
System.out.println(hs);
System.out.println(st1.hashcode());
System.out.println(st2.hashcode());
}
}



