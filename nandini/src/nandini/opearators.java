package nandini;
class shape
{
	void draw()
	{
		System.out.println("drawing");
	}
}
class rectangle extends shape
{
	void draw()
	{
		System.out.println("drawing rectangle");
	}
}
class circle extends shape
{
	void draw()
	{
		System.out.println("drawing circle");
	}
}
class triangle extends shape
{
	void draw()
	{
		System.out.println("drawing triangle");
	}
}
public class opearators 
{

public static void main(String[] args) 
{
shape s;
s=new rectangle();
s.draw();
s=new circle();
s.draw();
s=new triangle();
s.draw();
	}

}
