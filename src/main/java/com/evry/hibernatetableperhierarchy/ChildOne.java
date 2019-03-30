package com.evry.hibernatetableperhierarchy;

import javax.persistence.*;

@Entity
@Table(name="childOne")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name",column=@Column(name="name")),
	@AttributeOverride(name="accountNo",column=@Column(name="accountNo")),
	@AttributeOverride(name="balance",column=@Column(name="balance"))
})
public class ChildOne extends Bank{
	
	@Column(name = "childOneID")
	private int id;
	@Column(name = "accountNo")
	private int accountNo;
	@Column(name = "balance")
	private float balance;
	
}
