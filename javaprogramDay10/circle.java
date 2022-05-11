import java.util.*;
class circle
{
float radius,area;
void setRadius(float x)
{
radius=x;
}
void calculateArea()
{
Area=3.14f*radius*radius;
System.out.println("area is"+area);
}
}
public class DemoClass
{
public static void main (String[]args[])
{
circle ob1=new circle();
circle ob2= new circle();
ob1.setRadius(1.2f);
ob2.setRadius(3.4f);
ob1.calculateArea();
ob2.calculateArea();
}
}

