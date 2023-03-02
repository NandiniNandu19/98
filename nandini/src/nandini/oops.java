package nandini;

class ravi 
{
	int i,j;
	void main()
	{
System.out.println("i+j="+(i+j));
 }
}
class nandini1 extends ravi
{
int k;
void nandini1()
{
	System.out.println("k="+k);
}
void sum()
{
	System.out.println("i+j+k="+(i+j+k));
}
}
public class oops
{
public static void main(String[] args) 
{
ravi p=new ravi();
p.i=20;
p.j=15;

nandini1 a=new nandini1();
a.i=10;
a.j=15;
a.k=20 ;
a.nandini1();
System.out.println("sum=");
a.sum();
	}
}
