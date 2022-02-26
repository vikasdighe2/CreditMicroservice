package com.domain.model;

import java.time.Instant;

import com.domain.Customer;

public class AccountModel {
	private long accountNumber;
    private long balance ;
    private Instant creationDate;
    private Customer customer;
    

    public AccountModel() {
    }

    public AccountModel(long accountNumber,long balance,Instant creationDate,Customer customer) {
    	this.accountNumber=accountNumber;
        this.balance = balance;
        this.creationDate=creationDate;
        this.customer=customer;
    }

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}



	public Instant getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Instant creationDate) {
		this.creationDate = creationDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "AccountModel [accountNumber=" + accountNumber + ", balance=" + balance + ", creationDate="
				+ creationDate + ", customer=" + customer + "]";
	}


  
    
}
