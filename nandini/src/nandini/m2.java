package nandini;

public class m2 
{
int method (int x,float y)
{
System.out.println("method1");	  
return x;
}
void method2()
{
	System.out.println("method2");
}
void method3()
{
	System.out.println("method3");
}
void method4()
{
	System.out.println("method4");
}
public static void main(String[] args) 
{
m2 t=new m2();
t.method(40,56.78f);
t.method2();
t.method3();
	}

}
