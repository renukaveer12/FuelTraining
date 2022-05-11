// file reader
import java.io.*;
public class BufferedReader{
public static void main(String[]args) throws Exception{
FileReader fin;
fin= new FileReader("C:\\Users\\CIVIL LAB\\Desktop\\java(45251)//Test5.txt");
bufferedReader bin;
bin=new BufferedReader(fin);
String s1="";
while((s1=bin.readLine())!=null){
System.out.println(s1);
}
bin.close();
}
}