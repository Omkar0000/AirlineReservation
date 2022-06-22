package com.morningstar.dao;
//rutuja
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.morningstar.model.User;
@Repository
public class AdminDaoImpl implements AdminDao {
	 @Autowired
	    private JdbcTemplate template=null;
	    
	    public JdbcTemplate getTemplate() {
	        return template;
	    }

	 

	    public void setTemplate(JdbcTemplate template) {
	        this.template = template;
	    }
	@Override
	public List<User> getAllUsers() {
		List<User> list;
		String query = "select * from person";
				list = template.query(query, new AirlineRowMapper());
				return list;

	}

}
