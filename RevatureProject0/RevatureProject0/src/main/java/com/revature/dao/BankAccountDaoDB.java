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
	public void createAccountNum(BankAccount accountNumber) throws SQLException {
		BankAccount AccNum = new BankAccount();
		Connection conn = conUtil.getConnection();
		String sql = "insert into account number(accountNum) values " + " ?";
		
		PreparedStatement PrepStmt = conn.prepareStatement(sql);
		PrepStmt.setInt(1, AccNum.getAccountNumber());
		
		PrepStmt.execute();
		
	}
		

	@Override
	public BankAccount getBalance() {
		BankAccount balance = new BankAccount();
		try {
			Connection conn = conUtil.getConnection();
			
			String sql = "select * from users where bankaccount.balance = ' " + balance + "'";
			Statement stmt  = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				balance.deposit(rs.getDouble(2));
			}
			return balance;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
