package com.morningstar.service;

 

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 

import com.morningstar.dao.RegistrationDao;
import com.morningstar.model.User;

 

@Service
public class RegistrationServiceImpl implements RegistrationService {
@Autowired
private RegistrationDao dao=null;
    
@Override
public boolean addUser(User p) {
	int result=0;
	try {
		System.out.println("3");
		result=dao.addUser(p);
		System.out.println("4");
	}
	catch(SQLException e){
		e.printStackTrace();
	}
	return result==1?true:false;
}

    @Override
    public boolean checkUserInfo(String emailId, String password) {
        int result=0;
        try
        {
        	User user1=dao.checkUserInfo(emailId, password);
        	System.out.println("Service" + user1);
            if(user1.getEmailId().equals(emailId) && user1.getPassword().equals(password))
                result=1;
        
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return result==1?true:false;
    }

 


}