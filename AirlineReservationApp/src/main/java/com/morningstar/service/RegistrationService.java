package com.morningstar.service;

 

import java.sql.SQLException;

import com.morningstar.model.User;

 

public interface RegistrationService{
	public boolean addUser(User p);
    public int checkUserInfo(String emailId, String password);
}