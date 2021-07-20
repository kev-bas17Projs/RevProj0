package com.revature.models;

public class Transaction {

	private int transactionID;
	private int senderID;
	private int recepientID;
	private String senderFirstName;
	private String senderLastName;
	private String senderUsername;
	private String recepientFirstName;
	private String recepientLastName;
	private String recepientUsername;
	private int senderAccoutNum;
	private int recepientAccountNum;
	private boolean TransactionStatus;
	
	public Transaction() {}
	
	public Transaction(int transactionID, int senderID, int recepientID, String senderFirstName, String senderLastName, String senderUsername, String recepientFirstName, String recepientLastName, String recepientUsername, int senderAccoutNum, int recepientAccountNum) {
		this.transactionID = transactionID;
		
		this.senderID = senderID;
		this.senderAccoutNum = senderAccoutNum;
		this.senderFirstName = senderFirstName;
		this.senderLastName = senderLastName;
		this.senderUsername = senderUsername;
		
		
		this.recepientID = recepientID;
		this.recepientAccountNum = recepientAccountNum;
		this.recepientFirstName = recepientFirstName;
		this.recepientLastName = recepientLastName;
		this.recepientUsername = recepientUsername;
		
		this.TransactionStatus = TransactionStatus;
	}
	
	/*public Transaction(int transactionID, int senderID, int recepientID, String senderFirstName, String senderLastName, String senderUsername, String recepientFirstName, String recepientLastName, String recepientUsername, int senderAccoutNum, int recepientAccountNum) {
		this.transactionID = transactionID;
		
		this.senderID = senderID;
		this.senderAccoutNum = senderAccoutNum;
		this.senderFirstName = senderFirstName;
		this.senderLastName = senderLastName;
		this.senderUsername = senderUsername;
		
		
		this.recepientID = recepientID;
		this.recepientAccountNum = recepientAccountNum;
		this.recepientFirstName = recepientFirstName;
		this.recepientLastName = recepientLastName;
		this.recepientUsername = recepientUsername;
		
		}*/
	
	
	
	
	public int getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
	public int getSenderID() {
		return senderID;
	}
	public void setSenderID(int senderID) {
		this.senderID = senderID;
	}
	public int getRecepientID() {
		return recepientID;
	}
	public void setRecepientID(int recepientID) {
		this.recepientID = recepientID;
	}
	public String getSenderFirstName() {
		return senderFirstName;
	}
	public void setSenderFirstName(String senderFirstName) {
		this.senderFirstName = senderFirstName;
	}
	public String getSenderLastName() {
		return senderLastName;
	}
	public void setSenderLastName(String senderLastName) {
		this.senderLastName = senderLastName;
	}
	public String getSenderUsername() {
		return senderUsername;
	}
	public void setSenderUsername(String senderUsername) {
		this.senderUsername = senderUsername;
	}
	public String getRecepientFirstName() {
		return recepientFirstName;
	}
	public void setRecepientFirstName(String recepientFirstName) {
		this.recepientFirstName = recepientFirstName;
	}
	public String getRecepientLastName() {
		return recepientLastName;
	}
	public void setRecepientLastName(String recepientLastName) {
		this.recepientLastName = recepientLastName;
	}
	public String getRecepientUsername() {
		return recepientUsername;
	}
	public void setRecepientUsername(String recepientUsername) {
		this.recepientUsername = recepientUsername;
	}
	public int getSenderAccoutNum() {
		return senderAccoutNum;
	}
	public void setSenderAccoutNum(int senderAccoutNum) {
		this.senderAccoutNum = senderAccoutNum;
	}
	
	public int getRecepientAccountNum() {
		return recepientAccountNum;
	}
	
	public void setRecepientAccountNum() {
		this.recepientAccountNum = recepientAccountNum;
	}
	public boolean isTransactionStatus() {
		return TransactionStatus;
	}
	public void setTransactionStatus(boolean transactionStatus) {
		TransactionStatus = transactionStatus;
	}
	@Override
	public String toString() {
		return "Transaction [transactionID=" + transactionID + ", senderID=" + senderID + ", recepientID=" + recepientID
				+ ", senderFirstName=" + senderFirstName + ", senderLastName=" + senderLastName + ", senderUsername="
				+ senderUsername + ", recepientFirstName=" + recepientFirstName + ", recepientLastName="
				+ recepientLastName + ", recepientUsername=" + recepientUsername + ", senderAccoutNum="
				+ senderAccoutNum + ", TransactionStatus=" + TransactionStatus + "]";
	}
	
	
	

	
	

}
