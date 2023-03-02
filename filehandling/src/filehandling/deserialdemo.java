package filehandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class deserialdemo 
{
public static void main(String[] args) throws Exception
{
FileInputStream fis=new FileInputStream("src/customer.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
cust obj=(cust)ois.readObject();
System.out.println(obj.id+""+obj.name+""+obj.city+""+obj.pin);
	}

}
