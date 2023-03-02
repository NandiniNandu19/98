package nandini;

public class method1 
{
	void add(int d)
{
	System.out.println("single arguments");
}
void add(float y,double x)
{
	System.out.println("double arguments");
}
void add(float y)
{
	System.out.println("type of arguments");
}
	public static void main(String[] args) 
	{
		method1 m=new method1();
		m.add(30);
		m.add(54,3.5f);
		m.add((int)2.5);
		m.add(23.456f);

	}

}
