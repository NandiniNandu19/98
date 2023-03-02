package nandini;

public class method3 
{
static int atmpin=5425;
static int pincode=517257;
static void display()
{
	System.out.println(pincode);
	method3 m=new method3();
	System.out.println(m.atmpin);
}
void show()
{
	System.out.println(atmpin);
	System.out.println(method3.pincode);
	
}
public static void main(String[] args) 
{
method3 t=new method3();
t.display();
t.show();

	}

}
