package loop;

import java.io.DataInputStream;
import java.io.IOException;

public class array1 
{
public static void main(String[] args) throws IOException
{
DataInputStream r=new DataInputStream(System.in);
System.out.println("enter n value");
int n=Integer.parseInt(r.readLine());
int a[]=new int[n];
System.out.println("enter elements one by one");
for(int i=0;i<n;i++)
	a[i]=Integer.parseInt(r.readLine());
System.out.println("entered elements are");
for(int i=0;i<n;i++)
	System.out.println(a[i]);
	}

}
