package nandini;
class ram
{
	int a,b;
	void accept(int x,int y)
	{
		a=x;
		b=y;
	}
	void display()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
public class takingargus 
{
public static void main(String[] args) 
{
	ram r=new ram();
	r.accept(10,20);
	r.display();
}

}
