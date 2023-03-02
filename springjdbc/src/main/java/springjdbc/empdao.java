package springjdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class empdao 
{
private JdbcTemplate jdbcTemplate;
public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
{
this.jdbcTemplate=jdbcTemplate;
}
public int save(employee emp)
{
String sql="insert into stu values("+emp.getId()+",'"+emp.getName()+"','"+emp.getCmp()+"')";
return jdbcTemplate.update(sql);
}
public int update(employee emp)
{
	String sql="update stuset name='"+emp.getName()+"',where id="+emp.getId()+"'";
	return jdbcTemplate.update(sql);	
}
public int delete(employee emp)
{
	String sql="delete";
	return jdbcTemplate.update(sql);
}
public int listemployee()
{
String sql="select";
return jdbcTemplate.update(sql);
}
}
