package nandini;
abstract class bhavana
{
	double dim1,dim2;
	bhavana(double a,double b)
	{
		dim1=a;
		dim2=b;
	}
	abstract double area();
}
class siddu extends bhavana
{
	siddu(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		return dim1*dim2;
	}
}
class kumar extends bhavana
{
	kumar(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		return dim1*dim2/2;
	}
}
public class naveen 
{

public static void main(String[] args) 
{
	siddu s=new siddu(1043,2870);
	kumar k=new kumar(565,287);
	System.out.println(s.area());
	System.out.println(k.area());
}
}
