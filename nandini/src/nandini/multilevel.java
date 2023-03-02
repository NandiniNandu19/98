package nandini;
class student
{
	int no;
	void getdata(int a)
	{
		no=a;
	}
	void putdata()
	{
		System.out.println("student no="+no);
	}
}
class test extends student
{
	int m1,m2;
	void gettest(int x,int y)
	{
		m1=x;
		m2=y;
	}
	void puttest()
	{
		System.out.println("m1="+m1+"m2="+m2);
	}
}
class result extends test
{
	int total;
	void putresult()
	{
		total=m1+m2;
		System.out.println("total="+total);
	}
}
public class multilevel 
{
public static void main(String[] args) 
{
result r=new result();
r.getdata(100);
r.putdata();
r.gettest(85,90);
r.puttest();
r.putresult();
	}
}
