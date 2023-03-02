package filehandling;

import java.io.Serializable;

public class cust implements Serializable
{
/**
 * 
 */
	private static final long serialVersionUID=1L;
	public int id;
	public String name;
	public transient int pin;
	public String cust;
	public String city;
}
