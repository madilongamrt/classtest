package model;

import java.math.BigDecimal;

import entities.TransactionEntity;

public class Transaction {
	private static final long serialVersionUID = 1L;
	
	private String Name;
	private String SourcePassport;
	private String DestinationPassport;
	private String DestinationBank;
	private String DestationCountry;
	private Long AccountNumber;
	private BigDecimal Amount;
	private Long TransactionCode;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSourcePassport() {
		return SourcePassport;
	}

	public void setSourcePassport(String sourcePassport) {
		SourcePassport = sourcePassport;
	}

	public String getDestinationPassport() {
		return DestinationPassport;
	}

	public void setDestinationPassport(String destinationPassport) {
		DestinationPassport = destinationPassport;
	}

	public String getDestinationBank() {
		return DestinationBank;
	}

	public void setDestinationBank(String destinationBank) {
		DestinationBank = destinationBank;
	}

	public String getDestationCountry() {
		return DestationCountry;
	}

	public void setDestationCountry(String destationCountry) {
		DestationCountry = destationCountry;
	}

	public Long getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		AccountNumber = accountNumber;
	}

	public BigDecimal getAmount() {
		return Amount;
	}

	public void setAmount(BigDecimal amount) {
		Amount = amount;
	}

	public Long getTransactionCode() {
		return TransactionCode;
	}

	public void setTransactionCode(Long transactionCode) {
		TransactionCode = transactionCode;
	}
	
	
	public TransactionEntity getEntity()
	{
		TransactionEntity transactionEntity = new TransactionEntity();
		transactionEntity.setDestinationPassport(DestinationPassport);
		transactionEntity.setName(Name);
		transactionEntity. setSourcePassport(SourcePassport);
		transactionEntity.setDestinationBank(DestinationBank);
		transactionEntity.setDestationCountry(DestationCountry);
		transactionEntity.setAccountNumber(AccountNumber);
		transactionEntity.setAmount(Amount);
		transactionEntity.setTransactionCode(TransactionCode);
		
		return transactionEntity;
	}
	
	

}
