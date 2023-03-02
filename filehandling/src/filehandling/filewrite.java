package filehandling;

import java.io.File;
import java.io.FileOutputStream;

public class filewrite 
{

	public static void main(String[] args) throws Exception
	{
File file=new File("src/simple.txt");
FileOutputStream fos=new FileOutputStream(file);
String msg="hi this file write operationusing byte stream";
fos.write(msg.getBytes());
System.out.println("done.");
	}

}
