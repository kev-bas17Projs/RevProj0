package com.revature.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.User;
import com.revature.utils.ConnectionUtil;

public class UserDaoDB implements UserDao {
	
	ConnectionUtil conUtil = ConnectionUtil.getConnectionUtil();
	
	public List<User> getAllUsers(){
		List<User> userList = new ArrayList<User>();
		
		try {
			Connection conn = conUtil.getConnection();
			String sql = "select * from users";
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				userList.add(new User(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
			
			return userList;
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public User getUserByUsername(String username) {
		User user = new User();
		
		try {
			Connection conn = conUtil.getConnection();
			
			String sql = "select * from users where users.username = ' " + username + "'";
			Statement stmt  = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				user.setFirstName(rs.getString(1));
				user.setLastName(rs.getString(2));
				user.setUsername(rs.getString(3));
				user.setPassword(rs.getString(4));
			}
			return user;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void createUser(User u) throws SQLException{
		Connection conn = conUtil.getConnection();
		String sql = "insert into users(first_name, last_name, username, password) values " + "(?, ?, ?, ?)";
		
		PreparedStatement PrepStmt = conn.prepareStatement(sql);
		
		PrepStmt.setString(1, u.getFirstName());
		PrepStmt.setString(2, u.getLastName());
		PrepStmt.setString(3, u.getUserName());
		PrepStmt.setString(4, u.getPassword());
		
		PrepStmt.execute();
	}
	
	public void updateUser(User u) {
		try {
			Connection conn = conUtil.getConnection();
			String sql = "update users set first_name = ?, last_name = ?, username = ?, password = ? " + " where users.username = ?";
			PreparedStatement PrepStmt = conn.prepareStatement(sql);
			
			PrepStmt.setString(1, u.getFirstName());
			PrepStmt.setString(2, u.getLastName());
			PrepStmt.setString(3, u.getUserName());
			PrepStmt.setString(4, u.getPassword());
			
			PrepStmt.execute();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteUser(User u) {
		
		try {
			Connection conn = conUtil.getConnection();
			String sql = "delete from users users.username = ?";
			PreparedStatement PrepStmt = conn.prepareStatement(sql);
			
			PrepStmt.setString(3, u.getUserName());
			
			PrepStmt.execute();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}
	

