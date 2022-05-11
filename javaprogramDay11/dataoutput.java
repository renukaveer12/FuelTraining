//DataOutputStream
import java.io.*;
public class dataoutput{
public static void main(String[] args)throws Exception{
FileOutputStream fout;
fout= new FileOutputStream("C:\\Users\\CIVIL LAB\\Desktop\\java(45251\\Test3.txt");
DataOutputStream dout;
dout=new DataOutputStream(fout);
dout.writeInt(102);
dout.writeBoolean(true);
dout.writeDouble(1.2);
dout.close();
}
}



