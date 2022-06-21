package com.morningstar.dao;

 

import java.sql.SQLException;
import java.util.List;

import com.morningstar.model.User;

 

public interface RegistrationDao{
    public int addUser(User u) throws SQLException;
    public User checkUserInfo(String emailId,String password)  throws SQLException;
}
 