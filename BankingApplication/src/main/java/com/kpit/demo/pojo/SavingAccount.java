package com.kpit.demo.pojo;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="Saving_tbl")
public class SavingAccount 
{				
	@Id
	@Column(name="accno")
	private int accountNumber;
	
	@Column(name="accname")
	private String accountName;
	
	@Column(name="accSalary")
	private int accountSalary;

	public SavingAccount() {
		super();
		System.out.println("Saving Account Constructor...");
	}

	
	
	public int getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getAccountName() {
		return accountName;
	}



	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}



	public int getAccountSalary() {
		return accountSalary;
	}



	public void setAccountSalary(int accountSalary) {
		this.accountSalary = accountSalary;
	}



	@Override
	public String toString() {
		return "SavingAccount [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountSalary="
				+ accountSalary + "]";
	}
	
	
}
