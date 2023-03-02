package variable;

public class thread2 extends Thread 
{
public void run()
{
System.out.println("I AM FROM RUN METHOD");
}
public static void main(String[] args) 
{
thread2 t1=new thread2();
thread2 t2=new thread2();
thread2 t3=new thread2();
System.out.println("default thread name:"+t1.getName());
System.out.println("default thread name:"+t2.getName());
System.out.println("default thread name:"+t3.getName());
t1.setName("open AC");
t2.setName("withdraw");
t3.setName("transfer");
System.out.println("thread name:"+t1.getName());
System.out.println("thread name:"+t2.getName());
System.out.println("thread name:"+t3.getName());
System.out.println("default thread priority:"+t1.getPriority());
System.out.println("default thread priority:"+t2.getPriority());
System.out.println("default thread priority:"+t3.getPriority());
System.out.println(MAX_PRIORITY);
System.out.println(NORM_PRIORITY);
System.out.println(MIN_PRIORITY);
t1.setPriority(MAX_PRIORITY);
t3.setPriority(MIN_PRIORITY);
System.out.println("thread priority:"+t1.getPriority());
System.out.println("thread priority:"+t2.getPriority());
System.out.println("thread priority:"+t3.getPriority());
	}

}
