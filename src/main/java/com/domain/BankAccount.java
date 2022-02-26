package com.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;



@Entity
@Table(name = "account")
public class BankAccount implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private long accountNumber;

    private long balance;
    
    private  Instant creationDate;
    
	
	  @OneToOne
	  @JoinColumn(name = "customerId",referencedColumnName = "customerId")
	   private Customer customer;
	 
    
    
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount( long balance, Instant creationDate, Customer customer) {
		super();
		this.balance = balance;
		this.creationDate = creationDate;
		this.customer = customer;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Instant getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Instant creationDate) {
		this.creationDate = creationDate;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public long getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", creationDate=" + creationDate
				+ ", customer=" + customer + "]";
	}
    
    
    
}