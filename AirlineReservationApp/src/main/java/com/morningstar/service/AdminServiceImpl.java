package com.morningstar.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morningstar.dao.AdminDao;
import com.morningstar.model.User;
@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
private AdminDao dao;
	@Override
	public List<User> getAllUsers() {
	List list=null;
		
		try {
			list = dao.getAllUsers();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
