import java.util.*;
class Circle
{
float radius,area;
void setRadius(float x)
{
radius=x;
}
void calculateArea()
{
area=3.14f*radius*radius;
System.out.println("area is"+area);
}
}
public class DemoClass
{
public static void main (String[]args[])
{
Circle ob1=new Circle();
Circle ob2= new Circle();
ob1.setRadius(1.2f);
ob2.setRadius(3.4f);
ob1.calculateArea();
ob2.calculateArea();
}
}

