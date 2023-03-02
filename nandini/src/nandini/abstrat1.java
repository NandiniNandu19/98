package nandini;
public class abstrat1 
{
	int a=10;
	int b=20;
	void add(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}
public static void main(String[] args) 
{
abstrat1 a=new abstrat1();
a.add(100,200);
	}

}
