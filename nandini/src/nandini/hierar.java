package nandini;
class animal
{
void eat()
{
System.out.println("eating");
}
}
class dog extends animal
{
	void bark()
	{
		System.out.println("barking");
	}
}
class cat extends animal
{
	void memow()
	{
		System.out.println("memowing");
	}
}
public class hierar 
{

public static void main(String[] args) 
{
	dog d=new dog();
	cat c=new cat();
	d.eat();
	d.bark();
	c.memow();
}
}
