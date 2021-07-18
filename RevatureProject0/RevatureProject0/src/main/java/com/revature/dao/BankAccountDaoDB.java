package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.BankAccount;
import com.revature.utils.ConnectionUtil;

public class BankAccountDaoDB implements BankAccountDao {
	ConnectionUtil conUtil = ConnectionUtil.getConnectionUtil();
	@Override
	public void createAccountNum(BankAccount accountNumber) {
		/*BankAccount AccNum = new BankAccount();
		Connection conn = conUtil.getConnection();
		String sql = "insert into users(first_name, last_name, username, password) values " + "(?, ?, ?, ?)";
		
		PreparedStatement PrepStmt = conn.prepareStatement(sql);
		
		//PrepStmt.setString(1, u.getFirstName());
		//PrepStmt.setString(2, u.getLastName());
		//PrepStmt.setString(3, u.getUserName());
		//PrepStmt.setString(4, u.getPassword());
		
		PrepStmt.setAccountNumber(1, AccNum.getAccountNumber());
		
		PrepStmt.execute();
		*/
	}
		

	@Override
	public BankAccount getBalance() {
		
		return null;
	}

}
