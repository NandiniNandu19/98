package nandini;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class frame
{
	public static void main(String[] args)
{
List<String> h=new ArrayList<String>();
h.add("apple");
h.add("banana");
h.add("orange");
h.add("apple");
Iterator b=h.iterator();
while(b.hasNext())
{
	System.out.println(b);
}
	}

}
