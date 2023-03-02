package variable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>
{
private int id;
private String name;
private int age;
public Employee (int id,String name,int age)
{
this.id=id;
this.name=name;
this.age=age;
}
	public int getId() 
	{
	return id;
}
public void setId(int id) 
{
	this.id = id;
}
public String getName() 
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public int getAge() 
{
	return age;
}
public void setAge(int age) 
{
	this.age = age;
}
@Override
public int compareTo(Employee o)
{
return this.id-o.id;	
}
}
class NameComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1,Employee o2)
	{
	return o2.getName().compareTo(o1.getName());	
		}
}
public class string2
{
public static void main(String[] args) 
{
List<Employee> e1=new ArrayList<Employee>();
e1.add(new Employee(11,"dell",12));
e1.add(new Employee(15,"lenovo",32));
e1.add(new Employee(31,"apple",52));
e1.add(new Employee(89,"sony",42));
Collections.sort(e1, new NameComparator());
	for(Employee e:e1)
		
{
		System.out.println(e.getId()+""+e.getName()+""+e.getAge());
		}
}

}
