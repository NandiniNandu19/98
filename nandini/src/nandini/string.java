package nandini;
import java.io.BufferedReader;
import java.io.DataInputStream;
public class string 
{
public static void main(String[] args)
{
String d;
DataInputStream r=new DataInputStream(System.in);
try
{
	System.out.println("enter any string");
	d=r.readLine();
	System.out.println("d="+d);
} 
catch  (Exception  e)
{
	}
}
}
