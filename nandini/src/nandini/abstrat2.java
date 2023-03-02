package nandini;

public class abstrat2 
{
	static int a;
	int b;
	void values (int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void add()
	{
		System.out.println(a+b);
	}
	void mul()
	{
		System.out.println(a*b);
	}
public static void main(String[] args) 
{
abstrat2 n=new abstrat2();
n.values(1430,2540);
n.add();
n.mul();
	}

}
