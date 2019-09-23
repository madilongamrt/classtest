package entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="transaction_tbl")
public class TransactionEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;
    
	private String Name;
	private String SourcePassport;
	private String DestinationPassport;
	private String DestinationBank;
	private String DestationCountry;
	private Long AccountNumber;
	private BigDecimal Amount;
	
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long TransactionCode;
	
	
	public Long getTransactionCode() {
		return TransactionCode;
	}
	public void setTransactionCode(Long transactionCode) {
		TransactionCode = transactionCode;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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

}
