package nandini;
import java.io.*;
public class onedimjava 
{
public static void main(String[] args) throws IOException
{
	DataInputStream  r=new  DataInputStream(System.in);
	System.out.println("enteer n value");
	int n=Integer.parseInt(r.readLine());
	int a[]=new int [n];
	System.out.println("enter student details one by one");
	for (int  i=0;i<n;i++)
		a[i]=Integer.parseInt(r.readLine());
	System.out.println("entered student details are");
	for (int i=0;i<n;i++)
System.out.println(a[i]+"\t");
	}

}
