package variable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class exp8
{

	public static void main(String[] args) 
	{
Map<Employee,Integer>n=new HashMap<Employee,Integer>();
/*n.put(new Employee(1,"King","Blr"),234);
 * n.put("lenovo",474);
 * n.put("asus",123);
 * n.put("dell",256);
 * n.put("sony",567);
 * n.put("apple",456);
 * n.put("mac",647);
 * System.out.println(n);
 */
LinkedHashMap<String,Integer>data=new LinkedHashMap<>();
data.put("sony",234);
data.put("lenovo",474);
data.put("asus",123);
data.put("dell",256);
data.put("sony",567);
data.put("lonovo",474);
System.out.println(data);
Iterator<Entry<String,Integer>>itr=data.entrySet().iterator();
while(itr.hasNext())
{
	for(String k:data.keySet())
	{
		System.out.println("Key:"+k+"Value:"+data.get(k));
	}
	for(Integer val:data.values())
	{
		System.out.println(val);
	}
}
	}

}
