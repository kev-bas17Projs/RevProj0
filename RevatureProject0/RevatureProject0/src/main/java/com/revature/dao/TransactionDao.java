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
	
	Transaction getTransactionID(Transaction transactionID);
	
	Transaction getSenderID(Transaction senderID);
	//Transaction getSenderFirstName(Transaction senderFirstName);
	//Transaction getSenderLastName(Transaction senderLastName);
	Transaction getSenderUsername(Transaction senderUsername);
	
	Transaction getRecepientID(Transaction recepientID);
	//Transaction getRecepientFirstName(Transaction recepientFirstName);
	//Transaction getRecepeientLastName(Transaction recepientLastName);
	Transaction getRecepientUsername(Transaction recepientUsername);
	
	Transaction getSenderAccountNum(Transaction senderAccoutNum);
	
	Transaction getRecepientAccountNum(Transaction recepientAccountNum);
	
	
}
