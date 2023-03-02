package nandini;
class anu
{
	int i,j;
	void anu()
	{
		System.out.println(i+"------"+j);
	}
}
class shekhar extends anu
{
	int k;
	void shekhar()
	{
		System.out.println("k="+k);
	}
	void sum()
	{
		System.out.println("i+j+k="+(i+j+k));
	}
}
public class inheritance1 
{
public static void main(String[] args)
{
	anu a=new anu();
	shekhar s=new shekhar();
	a.i=10;
	a.j=15;
	a.anu();
	s.i=25;
	s.j=14;
	s.k=26;
	s.shekhar();
	System.out.println("sum=");
	s.sum();
}
}

