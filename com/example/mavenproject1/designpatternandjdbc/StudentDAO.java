package com.example.mavenproject1.designpatternandjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.example.mavenproject1.p1.Read;

public class StudentDAO {
//	private ResultSet performquery(String query) {
//		
//	}
	public List<StudentDTO> getallStudent() throws Exception{
		Connection con=Dbconnector.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from student");
		//ps.executeQuery();//the data will be received in resultset
		ResultSet rs=ps.executeQuery();
		List<StudentDTO> l1=new ArrayList<>();
		while(rs.next()) {
			l1.add(new StudentDTO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
		}
		return l1;
		
		
	}
	public StudentDTO getbyid(StudentDTO ob) throws Exception{
		Connection con=Dbconnector.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from student where sroll=?");
		ps.setInt(1,ob.getSroll());
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			//means row available
			ob.setFirstname(rs.getString(2));
			ob.setLname(rs.getString(3));
			ob.setDob(rs.getString(4));
			ob.setGender(rs.getString(5));
			
		}else {
			throw new Exception("sroll "+ob.getSroll()+" does not exist");
		}
		return ob;

	}
	public int insert(StudentDTO ob) throws Exception{
		Connection con=Dbconnector.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?)");
		ps.setInt(1,ob.getSroll());
		ps.setString(2, ob.getFirstname());
		ps.setString(3, ob.getLname());
		ps.setString(4, ob.getDob());
		ps.setString(5,ob.getGender());
		int rs=ps.executeUpdate();
		return rs;
		
	}
	public int deletebyid(StudentDTO ob) throws Exception{
		Connection con=Dbconnector.getConnection();
		PreparedStatement ps=con.prepareStatement("delete from student where sroll=?");
		ps.setInt(1, ob.getSroll());
		int rs=ps.executeUpdate();
		return rs;
		
		
		
	}
	
}
