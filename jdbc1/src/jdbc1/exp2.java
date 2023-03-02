package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class exp2 
{
public static void main(String[] args) throws Exception
{

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/harsha5","root","Nandu@1998");
	/*
	 PreparedStatement pst=con.prepareStatement("insert into nandu1(?,?,?)");
	 pst.setInt(1,111);
	 pst.setString(2,"Apple");
	 pst.setString(3,"tpt");
	 pst.execute();
	 PreparedStatement pst1=con.prepareStatement("update nandu1 set name=? where id=?");
	 pst1.setInt(2,111);
	 pst1.setString(1,"grapes");
	 pst1.execute();
	*/

	PreparedStatement pst=con.prepareStatement("select * from nandu1");
	ResultSet rs=pst.executeQuery();
	while(rs.next())
	{
	System.out.println("sno:"+rs.getInt(1)+"sname:"+rs.getString(2)+"scity:"+rs.getString(3)+"saddress:"+rs.getString(4));	
	}

	System.out.println("nandini");
	}

}
