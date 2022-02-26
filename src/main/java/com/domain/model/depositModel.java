package com.domain.model;



public class depositModel {
	private long destinationAccountNumber;
    private long amount ;
    private long sourceAccountNumber;
    

    public depositModel() {
    }

    public depositModel(long amount) {
        this.amount = amount;
    }



	public long getDestinationAccountNumber() {
		return destinationAccountNumber;
	}

	public void setDestinationAccountNumber(long destinationAccountNumber) {
		this.destinationAccountNumber = destinationAccountNumber;
	}

	public long getSourceAccountNumber() {
		return sourceAccountNumber;
	}

	public void setSourceAccountNumber(long sourceAccountNumber) {
		this.sourceAccountNumber = sourceAccountNumber;
	}

	
	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "depositModel [destinationAccountNumber=" + destinationAccountNumber + ", amount=" + amount
				+ ", sourceAccountNumber=" + sourceAccountNumber + "]";
	}

  
    
}
