package springjdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test 
{
public static void main(String[] args) 
	{
ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
empdao  e=(empdao)ctx.getBean("edao");
employee emp=new employee();
emp.setId(102);
emp.setName("surodeep");
emp.setCmp("Dell");
e.save(emp);
//e.update(emp);
System.out.println("done");
	}

}
