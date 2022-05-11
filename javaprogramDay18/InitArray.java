import java.util.*;
class InitArray
{
public static void main(String []args)
{
int[][]arr={{10,20,30},{40,50,60},{70,80,90}};
Scanner sc= new Scanner (System.in);
int i,j;
System.out.println("enter your array");
for(i=0;i<3;i=i+1)
{
for( j=0;j<3;j=j+1)
{
arr[i][j]= sc.nextInt();
}
}
System.out.println("your array");
for(i=0;i<3;i=i+1)
{
for(j=0;j<3;j=j+1)
{
System.out.print(" "+arr[i][j]);
}
System.out.println();
}
}
}
