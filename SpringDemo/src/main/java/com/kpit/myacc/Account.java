package com.kpit.myacc;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("acc")
@Scope("prototype")
public class Account 
{
	public Account() 
	{
		super();
		System.out.println("Account Created");
	}
	
	void withdraw()
	{
		System.out.println("withdrawing....");
	}
	
	void deposit()
	{
		System.out.println("Depositing...");
	}
	

}
