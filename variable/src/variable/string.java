package variable;

public class string 
{
static String str;
public static void main(String[] args) 
{
	try
	{
		System.out.println(str.length());
	}
	catch (NullPointerException e)
	{
		System.out.println(e);
	}
}
	}

