package nandini;
class anju
{
void m1()
{
System.out.println("high school street");
}
void m2()
{
System.out.println("village");
}
}
class anji extends anju
{
void m3()
{
System.out.println("chowdepalli");
}
}
public class inheritance2 
{
public static void main(String[] args) 
{
anji i=new anji();
i.m1();
i.m2();
i.m3();
anju a=new anju();
a.m1();
a.m2();
}}
