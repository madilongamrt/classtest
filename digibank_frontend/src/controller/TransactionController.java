package controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Transaction;
import service.TransactionEJB;

@ManagedBean(name = "transactioncontroller")
@SessionScoped
public class TransactionController {
	
	@EJB
    private TransactionEJB transactionEJB;
	
	@ManagedProperty(value="#{transaction}")
    private Transaction transaction;
	
	private List<Transaction> transactionList = new ArrayList<>();
  	
 	 public List<Transaction> getEmployeeList() {
         return transactionList;
     }
 	 
	
	public String addNewTransation() {
  		transactionEJB.addNewTrans(transaction.getEntity());
     //  transactionList = transactionEJB.findTransactions();
       return "transactionList.xhtml";
   }
	
	public Transaction getTransaction() {
		return transaction;
	}

	public void setEmployee(Transaction transaction) {
		this.transaction = transaction;
	} 

}
