package variable;
class Item
{
	int value;
	boolean valSet=false;
	public synchronized void putItem(int i)
	{
		try
		{
		if(valSet)
		{
			wait();
		}
		System.out.println("producer produced item->"+value);
		valSet=true;
		notify();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public synchronized void getItem()
{
	try
	{
		if(!valSet)
		{
			wait();
		}
		System.out.println("-> consumer consumed item->"+value);
		valSet=false;
		notify();
	}
	catch (Exception  e)
	{
		e.printStackTrace();
	}
}
}
class producer extends Thread
{
	int i;
	Item item;
	public producer(Item item)
	{
		this.item=item;
	}
	public void run()
	{
		try
		{
		while (true)
		{
			Thread.sleep(1000);
			item.putItem(i++);
		}
			}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Consumer extends Thread
{
	Item item;
	public Consumer(Item item)
	{
		this.item=item;
	}
	public void run()
	{
		try
		{
			while (true)
			{
			Thread.sleep(500);
			item.getItem();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class ep3 
{
public static void main(String[] args) 
{
Item item=new Item();
producer pr=new producer(item);
Consumer cr=new Consumer(item);
pr.start();
cr.start();
	}

}
