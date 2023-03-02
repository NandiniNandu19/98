package filehandling;

import java.io.FileWriter;

public class writetest 
{
public static void main(String[] args) throws Exception
{
	FileWriter fw=new FileWriter("src/write.txt");
	String msg="this is char stream file write operation";
	fw.write(msg);
	fw.flush();
	System.out.println("done.");
	

	}

}
