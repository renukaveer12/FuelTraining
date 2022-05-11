import java.util.*;
class Lastchance
{
public static void main(String arg[])
{
Scanner sc= new Scanner(System.in);
int cap,grd,ml;
int tnk;
int gslft;
int mlslft;
System.out.println("tank capacity");
tnk=sc.nextInt();
System.out.println(" gage reading");
grd=sc.nextInt();
System.out.println("meals per gallian");
ml=sc.nextInt();
gslft=(tnk+grd)/100;
mlslft=gslft*ml;
if(mlslft<200)
{
System.out.println("get gas!!!");
}
System.out.println("safe toproceed");
}
}






























