package strings;

public class str21 implements Cloneable
{
	int a=10;
	int b=20;
public static void main(String[] args) throws CloneNotSupportedException
{
	str21 t1=new str21();
	str21 t2=(str21)t1.clone();
	t1.a=100;
	t1.b=200;
	System.out.println(t1.a+"---"+t1.b);
	System.out.println(t1.a+"---"+t2.b);

	}

}
