package nandini;

public class overloading1 
{
private
int a,b;
public void display(int x, int y)
{
	a=x;
	b=y;
	
}
public void output()
{
	System.out.println("a="+a);
	System.out.println("b="+b);
}
	public static void main(String[] args) 
	{
overloading1 t=new overloading1();
t.display(1210,7620);
t.output();
	}

}
