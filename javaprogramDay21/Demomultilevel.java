// multi level programs
import java.util.*;
class Student{
private int id;
private String name;
Student( int id, String name){
this.id=id;
this.name=name;
}
int getId(){
return id;
}
String getName(){
return name;
}
}
class mark extends Student{
float m1,m2;
mark( int id, String name, float m1, float m2){
super(id,name);
this.m1=m1;
this.m2=m2;
}
float getM1(){
return m1;
}
float getM2(){
return m2;
}
}
class result extends mark{
result( int id, String name, float m1, float m2){
super(id,name,m1,m2);
}
void show(){
System.out.println("id:"+getId());
System.out.println("name:"+getName());
System.out.println(m1);
System.out.println(m2);
}
}
public class Demomultilevel{
public static void main(String[] args){
result ob;
ob= new result(2, "abc", 80, 86);
ob.show();
}
}



