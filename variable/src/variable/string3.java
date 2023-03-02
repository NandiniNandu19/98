package variable;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;

public class string3 
{
public static void main(String[] args) 
{
Set data=new HashSet();
data.add("hello");
data.add(20);
data.add("java");
data.add(3.8f);
data.add(39.76);
data.add(false);
data.add("java");
boolean b=data.add(20);
System.out.println(b);
System.out.println(data);
LinkedHashSet dat=new LinkedHashSet();
dat.add("hello");
dat.add(20);
dat.add("java");
dat.add(3.8f);
dat.add(39.76);
dat.add(false);
dat.add("java");
System.out.println(dat);
Iterator itr=dat.iterator();
while (itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
