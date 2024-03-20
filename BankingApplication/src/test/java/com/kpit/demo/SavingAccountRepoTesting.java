package com.kpit.demo;

import java.util.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kpit.demo.pojo.SavingAccount;
import com.kpit.demo.repo.SavingAccountRepo;

@SpringBootTest
public class SavingAccountRepoTesting 
{
	@Autowired
	SavingAccountRepo savingAccRepo;
	
	@Test
	public void insertTest()
	{
		SavingAccount sav = new SavingAccount();
		sav.setAccountNumber(1234);
		sav.setAccountName("abcd");
		sav.setAccountSalary(12345);
		
		savingAccRepo.save(sav);
	}
	
	
	@Test
	public void updateTest()
	{
		SavingAccount sav = new SavingAccount();
		sav.setAccountNumber(123);
		sav.setAccountName("Aditya");
		sav.setAccountSalary(1200000);
		
		savingAccRepo.save(sav);
	}
	
	@Test
	public void deleteTest()
	{
		SavingAccount sav = null;
		Optional<SavingAccount> box =savingAccRepo.findById(1234);
		if(box.isPresent())
		{
			sav = box.get();
		}
		
		savingAccRepo.delete(sav);
	}
	
	@Test
	public void selectTest()
	{
		SavingAccount sav = null;
		Optional<SavingAccount> box =savingAccRepo.findById(123);
		if(box.isPresent())
		{
			sav=box.get();
		}
		System.out.println(sav);
	}
	
	@Test
	public void selectAllTest() {

		List<SavingAccount> list = null;
		list = savingAccRepo.findAll();
		for (SavingAccount savingAccount : list) 
		{
			System.out.println(savingAccount);
			
		}
	}
}
