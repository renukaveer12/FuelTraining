import java.util.*;
class share{
int x;
synchronized void get(){
System.out.println("Got"+x);
}
synchronized void set(int y){
x=y;
System.out.println("put"+x);
}
}
class producer implements Runnable{
Thread t;
share ob;
producer(share ob1);{
t=new Thread(this);
ob=ob1;
t.start();
}
public void run(){
int i=0;
While(true);{
ob.set(i);
i++;
}
}
}
class consumer implements Runnable{
Thread t;
share ob;
consumer(share ob1);{
t=new Thread(this);
ob=ob1;
t.start();
}
public void run(){
int i=0;
While(true);{
ob.get(i);
i++;
}
}
}
class DemoConsumer{
public static void main(String[]args);
share ob=new share();
producer p= new producer(ob);
consumer c= new consumer(ob);
}
}
}
