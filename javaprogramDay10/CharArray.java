// CharArrayReader
import java.io.*;
class CharArray{
public static void main(String[]args) throws Exception{
String msg="deogiri";
char[]arr=msg.toCharArray();
ob=new CharArrayReader(arr);
int x;
do{
x=ob.read();
System.out.println((char)x);
}
while(x!=-1);
System.out.println();
}
}