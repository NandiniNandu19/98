package variable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class exp7
{

	public static void main(String[] args)
	{
Map<String,Integer>d=new HashMap<>();
d.put("lenovo",234);
d.put("sony",435);
d.put("apple",333);
d.put("asus",223);
d.put("dell",344);
d.put("sony",234);
d.put("mac",234);
System.out.println(d);
Map<String,Integer>data=new LinkedHashMap<>();
data.put("lenovo",234);
data.put("apple",435);
data.put("sony",435);
d.put("asus",223);
d.put("sony",456);
d.put("mac",234);
d.put("sony",456);
System.out.println(data);
Iterator<Entry<String, Integer>> itr;
Iterator<Entry<String,Integer>>et=itr=d.entrySet().iterator();
while(itr.hasNext())
{
	Entry<String,Integer>et1=itr.next();
	System.out.println(et1.getKey()+""+et1.getValue());
	}
System.out.println(d.get("mac"));
for(String k:d.keySet())
{
	System.out.println(k+""+d.get(k));
}
for(Integer vl:d.values())
{
	System.out.println(vl);
}
	}

}
