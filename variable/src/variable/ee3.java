package variable;
import java.util.Scanner;
public class ee3 
{
public static void main(String[] args) throws ee1 ,ee2 
{
Scanner s=new Scanner(System.in);
System.out.println("enter salary");
double sal=s.nextDouble();
ee4 v=new ee4();
v.checkSal(sal);
	}
}
