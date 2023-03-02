package nandini;
abstract class bhavs
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
}
abstract class navya extends bhavs
{
	void m1()
	{
		System.out.println("high school street");
	}
	void m2()
	{
		System.out.println("chowdepalli");
	}
}
class praveen extends navya
{
	void m3()
	{
		System.out.println("chittoor");
	}
}
public class sice 
{
public static void main(String[] args) 
{
praveen p=new praveen();
p.m1();
p.m2();
p.m3();
}
}
