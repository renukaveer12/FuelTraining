// Factory Pattern
abstract class Account{
abstract void calculateInterest();
}
class Saving extends Account{
void calculateInterest(){
System.out.println("calculate interest of saving");
}
}
class Loan extends Account{
void calculateInterest(){
System.out.println("calculate interest of Loan");
}
}
class AccountFactory{
static Account getAccount(string type){
Account obj=null;
if(type.equalsIgnoreCase("saving")){
obj=new Saving();
}else if(type.equalsIgnorecase("loan")){
obj=new Loan();
}
return obj;
}
public class DemoFactory{
public static void main(String[]args){
Account ob1=AccountFactory.getAccount("loan");
Account ob2=AccountFactory.getAccount("saving");
ob1.calculateInterest();
ob2.calculateInterest();
}
}
}




