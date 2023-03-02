package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class readtest
{

	public static void main(String[] args) throws Exception
	{
FileReader fr=new FileReader("src/write.txt");
BufferedReader br=new BufferedReader(fr);
System.out.println(br.readLine()+"\n");
	}

}
