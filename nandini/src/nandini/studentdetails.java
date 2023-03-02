package nandini;
import java.io.*;
public class studentdetails 
{
public static void main(String[] args) throws IOException
{
	DataInputStream  r=new  DataInputStream(System.in);
	System.out.println("enter student no");
	int  no=Integer.parseInt(r.readLine());
	System.out.println("enter gender");
	char  gender=(char)System.in.read();
	System.out.println("enter name");
	String  name=r.readLine();
	System.out.println("student  no="+no);
	System.out.println("student name="+name);
	System.out.println("student gender="+gender);
}
}
