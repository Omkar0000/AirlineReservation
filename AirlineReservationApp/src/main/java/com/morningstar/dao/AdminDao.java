package com.morningstar.dao;

import java.sql.SQLException;
import java.util.List;

import com.morningstar.model.User;

public interface AdminDao {
public List<User> getAllUsers() throws SQLException;
}
