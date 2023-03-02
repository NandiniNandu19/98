package nandini;
class raju
{
	static int x=1345454;
	void display()
	{
		x++;
		System.out.println("x="+x);
	}
}
public class staticmethod 
{

public static void main(String[] args) 
{
	raju s1=new raju();
	s1.display();
	raju s2=new raju();
	s2.display();

	}

}
