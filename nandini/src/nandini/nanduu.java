package nandini;
class nandi
{
	int i,j;
	void nandi()
	{
		System.out.println("i+j="+(i+j));
	}
}
class harini extends nandi
{
	int k;

	void harini()
	{
		System.out.println("k="+k);
	}
	void sum()
	{
System.out.println("i+j+k="+(i+j+k));
	}
}
public class nanduu 
{
public static void main(String[] args) 
{
nandi n=new nandi();
harini h=new harini();
n.i=5;
n.j=2;
n.nandi();
h.i=10;
h.j=20;
h.k=30;
h.harini();
System.out.println("sum=");
h.sum();
	}
}
