package nandini;

public class overiding 
{
overiding()
{
	System.out.println("harshitha computers");
}
overiding (int i)
{
	System.out.println("i="+i);
}
overiding (char a,int i)
{
	System.out.println(a+"-------"+i);
}
public static void main(String[] args) 
{
	overiding o1=new overiding();
	overiding o2=new overiding(109);
	overiding o3=new overiding('a',977100);

	}

}
