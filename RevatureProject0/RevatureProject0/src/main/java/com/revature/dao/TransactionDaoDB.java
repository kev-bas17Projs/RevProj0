package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Transaction;
import com.revature.models.User;
import com.revature.utils.ConnectionUtil;

public class TransactionDaoDB implements TransactionDao {

	ConnectionUtil conUtil = ConnectionUtil.getConnectionUtil();

	@Override
	public List<Transaction> getAllTransactions() {
		List<Transaction> TransactionList = new ArrayList<Transaction>();

		try {
			Connection conn = conUtil.getConnection();
			String sql = "select * from transaction";

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				// TransactionList.add(new Transaction(rs.getInt(1), rs.getInt(2), rs.getInt(3),
				// rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
				// rs.getString(8), rs.getString(9)));
			}

			return TransactionList;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Transaction getSenderID(Transaction senderID) {
		Transaction transaction = new Transaction();

		try {
			Connection conn = conUtil.getConnection();

			String sql = "select * from users where transaction.senderID = ' " + transaction + "'";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				transaction.setSenderID(rs.getInt(1));

			}
			return transaction;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void getSenderFirstName(Transaction senderFirstName) {

	}

	@Override
	public void getSenderLastName(Transaction senderLastName) {

	}

	@Override
	public Transaction getSenderUsername(Transaction senderUsername) {
		Transaction transaction = new Transaction();

		try {
			Connection conn = conUtil.getConnection();

			String sql = "select * from users where transaction.senderUsername = ' " + transaction + "'";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				transaction.setSenderID(rs.getInt(1));
				transaction.setSenderFirstName(rs.getString(2));
				transaction.setSenderLastName(rs.getString(3));
				transaction.setSenderUsername(rs.getString(4));

			}
			return transaction;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void getRecepientID(Transaction recepientID) {

	}

	@Override
	public void getRecepientFirstName(Transaction recepientFirstName) {

	}

	@Override
	public void getRecepeientLastName(Transaction recepientLastName) {

	}

	@Override
	public Transaction getRecepientUsername(Transaction recepientUsername) {
		Transaction transaction = new Transaction();

		try {
			Connection conn = conUtil.getConnection();

			String sql = "select * from users where transaction.recepientUsername = ' " + transaction + "'";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				transaction.setRecepientID(rs.getInt(1));
				transaction.setRecepientFirstName(rs.getString(2));
				transaction.setRecepientLastName(rs.getString(3));
				transaction.setRecepientUsername(rs.getString(4));

			}
			return transaction;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
