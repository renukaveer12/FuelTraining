// Singlrton patterns
class Sequence{
static Sequence obj=null;
static int count;
private Sequence(){
count=0;
}
static synchronized Sequence getInstance(){
if(obj==null){
obj= new Sequence();
System.out.println("object created");
}
count++;
System.out.println("count is"+count);
return obj;
}
}
public class DemoSingleton{
public static void main(String[]args){
Sequence s1=Sequence.getInstance();
Sequence s2=Sequence.getInstance();
Sequence s3=Sequence.getInstance();
Sequence s4=Sequence.getInstance();
}
}