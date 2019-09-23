package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.TransactionEntity;

/**
 * Session Bean implementation class TransactionEJB
 */
@Stateless
@LocalBean
public class TransactionEJB {

	@PersistenceContext
	private EntityManager trans;
	
    public TransactionEJB() {
        
    }
    
    public void addNewTrans(TransactionEntity transactionEntity)
    {
    	System.out.println("============transaction================");
    	System.out.println(transactionEntity.getName());
    	trans.persist(transactionEntity);
    }

}
