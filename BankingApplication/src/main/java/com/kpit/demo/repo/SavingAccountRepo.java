package com.kpit.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kpit.demo.pojo.SavingAccount;

public interface SavingAccountRepo extends JpaRepository<SavingAccount, Integer> 
{

}
