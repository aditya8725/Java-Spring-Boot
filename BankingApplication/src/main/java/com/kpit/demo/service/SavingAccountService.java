package com.kpit.demo.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.kpit.demo.pojo.SavingAccount;

@Service
public interface SavingAccountService {
	void createService(SavingAccount dept);

	void updateService(SavingAccount dept);

	void deleteService(int id);

	SavingAccount selectService(int id);

	List<SavingAccount> selectAllService();
}