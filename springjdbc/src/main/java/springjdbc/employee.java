package springjdbc;

public class employee 
{
private String name;
private String cmp;
private int id;


public employee() {
	
}
public employee(String name, String cmp, int id) {
	
	this.name = name;
	this.cmp = cmp;
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCmp() {
	return cmp;
}
public void setCmp(String cmp) {
	this.cmp = cmp;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}

