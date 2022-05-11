import java.util.*;
class Test implements Runnable{
Thread t;
Test(){
t= new Thread(this);
t.start();
}
public void run(){
try{
for(int i=0;i<5;i++){
System.out.println(" child thread" +1);
Thread.sleep(500);
}
}
catch(Exception e){
// tobo :handled exception
}
}
}
public class Demo{
public static void main(String[] args){
Test t1= new Test();
try{
for(int i=0;i<5;i++){
System.out.println(" main thread" +i);
Thread.sleep(1000);
}
}
catch(InterruptedException e){
}
}
}