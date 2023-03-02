package variable;

import java.util.TreeSet;

import java.util.Iterator;

public class exp5 
{
public static void main(String[] args) 
{
	TreeSet<Integer> d=new TreeSet<Integer>();
	d.add(15);
	d.add(11);
	d.add(4);
	d.add(9);
	d.add(3);
	d.add(2);
	d.add(13);
	System.out.println(d);
	TreeSet<String> name=new TreeSet<String>();
	name.add("lenovo");
	name.add("sony");
	name.add("dell");
	name.add("apple");
	name.add("asus");
System.out.println(name);
Iterator<Integer>itrIterator=d.descendingIterator();
	}

}
