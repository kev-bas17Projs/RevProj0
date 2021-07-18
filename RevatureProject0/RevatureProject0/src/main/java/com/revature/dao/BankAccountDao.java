package com.revature.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.BankAccount;

public interface BankAccountDao {
	
	void createAccountNum(BankAccount accountNumber);
	 BankAccount getBalance();

}
