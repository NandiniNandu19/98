package nandini;
import java.io.DataInputStream;
public class singlecharacter 
{
public static void main(String[] args) 
{
char  n;
DataInputStream r=new DataInputStream(System.in);
try
{
	System.out.println("enter single character");
	n=(char)System.in.read();
	switch(n)
	{
	case 'a':
	System.out.println("mother");
	break;
	case 'b':
	System.out.println("father");
	break;
	case 'c':
	System.out.println("brother");
	break;
	case 'd':
	System.out.println("sister");
	break;
	default:
	System.out.println("not matching");
	}
	}
catch (Exception  e)
{
}
}
}