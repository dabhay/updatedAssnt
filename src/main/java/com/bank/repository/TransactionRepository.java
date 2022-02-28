package com.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.Transaction;
import com.bank.model.TransactionPrimarykey;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, TransactionPrimarykey> {

	public List<Transaction> findBytransactionprimarykeyAccountNo(int accountNo);

}
