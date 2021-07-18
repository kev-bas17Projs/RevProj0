package com.revature.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Transaction;
public interface TransactionDao {
	List<Transaction> getAllTransactions();
	
	Transaction getSenderID(Transaction senderID);
	void getSenderFirstName(Transaction senderFirstName);
	void getSenderLastName(Transaction senderLastName);
	Transaction getSenderUsername(Transaction senderUsername);
	
	void getRecepientID(Transaction recepientID);
	void getRecepientFirstName(Transaction recepientFirstName);
	void getRecepeientLastName(Transaction recepientLastName);
	Transaction getRecepientUsername(Transaction recepientUsername);
	
	
}
