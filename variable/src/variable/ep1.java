package variable;

public class ep1 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("i am from run():"+Thread.currentThread().getName());
	}
	public static void main(String[] args) 
	{
ep1 t1=new ep1();
//t1.start();
ThreadGroup g1=new ThreadGroup("Bank");
Thread t2=new Thread(g1,t1,"pen,AC");
Thread t3=new Thread(g1,t1,"withdraw");
Thread t4=new Thread(g1,t1,"pen,AC");
ThreadGroup g2=new ThreadGroup("Maths");
Thread t5=new Thread(g2,t1,"ADD");
Thread t6=new Thread(g2,t1,"SUB");
Thread t7=new Thread(g2,t1,"MUL");
t4.start();
t6.start();
System.out.println("Threadgroup1:"+g1.activeCount());
System.out.println("Threadgroup1:"+g2.activeCount());
System.out.println(g1);
	}

}
