package com.example.beans;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "wallet")
public class Wallet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "wallet_id")
	private int walletId;
	
	private double amount;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "account_number_ref")
	private Account accountNumberRef;

	public Wallet(int walletId, double amount, Account accountNumberRef) {
		super();
		this.walletId = walletId;
		this.amount = amount;
		this.accountNumberRef = accountNumberRef;
	}
	
	public Wallet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getWalletId() {
		return walletId;
	}

	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Account getAccountNumberRef() {
		return accountNumberRef;
	}

	public void setAccountNumberRef(Account accountNumberRef) {
		this.accountNumberRef = accountNumberRef;
	}
	
	
	
}
