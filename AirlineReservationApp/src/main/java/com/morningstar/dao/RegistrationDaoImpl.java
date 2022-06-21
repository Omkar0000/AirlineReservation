package com.morningstar.dao;

 

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.morningstar.model.User;
@Repository
public class RegistrationDaoImpl implements RegistrationDao{
    @Autowired
    private JdbcTemplate template=null;
    
    public JdbcTemplate getTemplate() {
        return template;
    }

 

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    @Override
    public int addUser(User p) throws SQLException{
    	int result;
         try {  String query="insert into person(USERID,TITLE,FNAME,LNAME,EMAIL,PASSWORD,DOB,MOBILE) values (?,?,?,?,?,?,?,?)";
    	   System.out.println("1");
          result=template.update(query, p.getUserId(),p.getTitle(),p.getfName(),p.getlName(),p.getEmailId(),p.getPassword(),p.getDob(),p.getMobile());
           System.out.println("2");
        return result;}
         catch(RuntimeException e) {
        	 return 2;
         }
    }

 

    @Override
    public User checkUserInfo(String emailId, String password) {
    	 System.out.println("DAO1");
    	 User user1=null;
   String query = "select * from person where email= '" + emailId + "'";
      
//     List<User> list = template.query(query, (ResultSet rs, int rowNum)->{
//	     User user=new User();
//	     user.setUserId(rs.getInt("USERID"));
//	        user.setTitle(rs.getString("TITLE"));
//	        user.setfName(rs.getString("FNAME"));
//	        user.setlName(rs.getString("LNAME"));
//	        user.setEmailId(rs.getString("EMAIL"));
//	        user.setPassword(rs.getString("PASSWORD"));
//	        user.setDob(rs.getString("DOB"));
//	        user.setMobile(rs.getLong("MOBILE"));
//	        user.setRoleId(rs.getInt("ROLEID"));
//		return user;
//	});
   try{
	   user1 = template.queryForObject(query, new AirlineRowMapper());
	   
   }catch (RuntimeException e){
	    user1=new User();
	   user1.setEmailId("not real");
	   user1.setPassword("null");
   }
   
     
    return user1;
}

    	
     
    
}