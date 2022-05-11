// WAP to copy the content of one file to another by using CHAR IO classes
import java.io.*;
import java.util.*;
public class CopyContent{
public static void main(String[]args)throws Exception
{
FileReader fin= new FileReader("C:\\Users\\CIVIL LAB\\Desktop\\test8.txt");
BufferedReader bin= new BufferedReader(fin);
FileWriter fout=new FileWriter("C:\\Users\\CIVIL LAB\\Desktop\\Test9.txt");
BufferWriter bout= new BufferWriter(fout);
int x;
do
{
x=fin.read();
if(x!=-1)
{
fout.Write(x);  
}
}
while(x!=-1);
fin.close();
fout.close();
System.out.println("File copied");
}
}