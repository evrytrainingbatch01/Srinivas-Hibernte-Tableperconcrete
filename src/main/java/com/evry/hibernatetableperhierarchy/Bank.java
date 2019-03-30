package com.evry.hibernatetableperhierarchy;

import javax.persistence.*;

@Entity
@Table(name = "bank")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "accountNo")
	private int accountNo;
	@Column(name = "balance")
	private float balance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	
}
