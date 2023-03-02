package variable;

public class exp1 
{
public static void main(String[] args) 
{
	try
	{
		System.out.println(10/0);
		String[]ar= {"java",".net","php"};
		String str="java";
		System.out.println(str.charAt(3));
		String s="hello";
		System.out.println(s.charAt(7));
		System.out.println("hello");
		}
	catch (ArithmeticException e)
	{
		System.out.println("arithmetic errors");
	}
	catch (ArrayIndexOutOfBoundsException e)
	{
		System.out.println("arrayindexed errors");
	}
	catch (NullPointerException e)
	{
		System.out.println("nullpoint errors");
	}
	catch (Exception e)
	{
		System.out.println("check your inputs");
	}
	finally
	{
		System.out.println("finally");
	}
System.out.println("");
}
}
