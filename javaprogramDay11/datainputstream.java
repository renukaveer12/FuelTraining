//DataInputStream
import java.io.*;
public class datainputstream{
public static void main(String[] args)throws Exception{
FileInputStream fin;
fin=new FileInputStream("C:\\Users\\CIVIL LAB\\Desktop\\java(45251)\\Test4.txt");
DataInputStream dout;
din=new DatainputStream(fin);
int x= din.readInt();
boolean y= din.readBoolean();
double z= din.readDouble();
System.out.println(x);
System.out.println(y);
System.out.println(z);
din.close();
}
}
