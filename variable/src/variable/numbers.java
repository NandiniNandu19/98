package variable;

public class numbers 
{
static String str="harsha";
	public static void main(String[] args) 
	{
		try 
		{
			Integer.parseInt(str);
			}
		catch (NumberFormatException e)
		{
		System.out.println(e);	
		}

	}

}
