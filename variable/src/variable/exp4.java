package variable;

import java.util.Set;
import java.util.TreeSet;

public class exp4 {

	public static void main(String[] args) 
	{
Set<String> d=new TreeSet<String>();
d.add("java");
d.add("hibernate");
d.add("hello");
d.add("java");
d.add("spring");
d.add("plm");
System.out.println(d);
Set<Integer> data=new TreeSet<Integer>();
data.add(11);
data.add(2);
data.add(32);
data.add(22);
data.add(11);
data.add(3);
data.add(7);
data.add(null);
System.out.println(data);
}

}
