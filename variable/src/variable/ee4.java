package variable;

public class ee4 
{
public void checkSal(double sal)throws ee1,ee2
{
	if(sal>0)
	{
		ee2 e=new ee2("valid salary");
		throw(e);
	}
	
else
{
	ee1 e=new ee1("invalid salary");
	throw(e);
}
}
}
