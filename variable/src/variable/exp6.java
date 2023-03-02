package variable;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import java.util.Iterator;

public class exp6 
{

	public static void main(String[] args) 
	{
Map<String,Integer> na=new TreeMap<String,Integer>();
na.put("dell",20);
na.put("lenovo",30);
na.put("sony",256);
na.put("asus",65980);
na.put("dell",57767);
na.put("apple",576650);
System.out.println(na);
Iterator<Entry<String,Integer>> itr=na.entrySet().iterator();
while (itr.hasNext())
{
Entry<String,Integer>et=itr.next();
System.out.println(et.getKey()+""+et.getValue());
}
for(String key:na.keySet())
{
System.out.println(key+""+na.get(key));	
}
	}

}
