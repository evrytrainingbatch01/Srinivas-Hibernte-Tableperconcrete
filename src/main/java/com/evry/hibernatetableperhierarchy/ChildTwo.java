package com.evry.hibernatetableperhierarchy;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name="childOne")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name",column=@Column(name="name")),
	@AttributeOverride(name="accountNo",column=@Column(name="accountNo")),
	@AttributeOverride(name="balance",column=@Column(name="balance"))
})
public class ChildTwo  extends Bank{

	@Column(name = "childTwoID")
	private int id;
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
