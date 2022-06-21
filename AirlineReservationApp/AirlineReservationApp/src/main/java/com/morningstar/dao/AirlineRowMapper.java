package com.morningstar.dao;

 

import java.sql.ResultSet;
import java.sql.SQLException;

 

import org.springframework.jdbc.core.RowMapper;
import com.morningstar.model.User;

 


public class AirlineRowMapper implements RowMapper<User>{

 

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user= new User();
        user.setUserId(rs.getInt("USERID"));
        user.setTitle(rs.getString("TITLE"));
        user.setfName(rs.getString("FNAME"));
        user.setlName(rs.getString("LNAME"));
        user.setEmailId(rs.getString("EMAIL"));
        user.setPassword(rs.getString("PASSWORD"));
        user.setDob(rs.getString("DOB"));
        user.setMobile(rs.getLong("MOBILE"));
        user.setRoleId(rs.getInt("ROLEID"));
        return user;
    }

 

}