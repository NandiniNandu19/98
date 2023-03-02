package jdbc1;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class exp 
{

public static void main(String[] args) throws Exception
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/naveen3","root","Nandu@1998");
	Statement stmt=con.createStatement();
	String sql="create table anji(sno int,sname varchar(30),sclass varchar(30))";
	//String sql="insert into anji values('10','madhan','btech')";
	//String sql="delete from anji where sno=200";
      //String sql1="update anji set name ='appu' where sno=30";
	String sql1="select * from anji1";
	stmt.execute(sql);
	con.close();
	System.out.println("done");
		
	}

}
