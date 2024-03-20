package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.carrepository;
import com.example.demo.pojo.Car;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	carrepository carRepo;
	@Override
	public void createNewService(Car car) {
		// TODO Auto-generated method stub
		carRepo.save(car);

	}

}
