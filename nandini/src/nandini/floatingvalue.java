package nandini;
import java.io.DataInputStream;
public class floatingvalue 
{
public static void main(String[] args) 
{ 
Float  x;
DataInputStream r=new DataInputStream(System.in);
try
{
	System.out.println("enter floating values");
	x=Float.valueOf(r.readLine());
	System.out.println("x value="+x);
	}
catch  (Exception   e)
{
}
}
}
