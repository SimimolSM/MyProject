package com.ust;

public interface AccountInterface {
	public abstract void insert();

	public abstract void newAccDetails();
	public abstract void inputDetails();
	public abstract void displayAll();

	public abstract boolean search(String acno);
	public abstract void checkBalance();
	public abstract void deposit();
	public abstract void withdrawAmount();
	
	public abstract void statement() ;
	public abstract void delete() ;
}
