package filehandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class serialdemo 
{
public static void main(String[] args) throws Exception
{
	FileOutputStream fos=new FileOutputStream("src/customer.txt");
	ObjectOutputStream os=new ObjectOutputStream(fos);
	cust cc=new cust();
	cc.id=11;
	cc.name="hero";
	cc.cust="blr";
	cc.pin=560069;
	os.writeObject(cc);
	System.out.println("done.");
	}

}
