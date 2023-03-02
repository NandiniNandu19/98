package variable;
class Bank
{
	public void transfer()
	{
		System.out.println("Transfer");
	}
}
class Maths
{
	public void add()
	{
		System.out.println("Add");
	}
}
public class ep2 implements Runnable 
{
	public void run()
	{
		try
		{
			Bank b=new Bank();
			b.transfer();
			Thread.sleep(2000);
			Maths m=new Maths();
			m.add();
		}
		catch (Exception  e)
		{
			e.printStackTrace();
		}
	}
public static void main(String[] args) throws Exception 
	{
ep2 t1=new ep2();
Thread t2=new Thread(t1);
t2.start();
t2.join();
	}

}
