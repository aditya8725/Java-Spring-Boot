package com.kpit.repo;

import org.springframework.stereotype.Repository;
//import java.util.*;

import com.kpit.pojo.Car;

import java.util.List;

@Repository
public interface CarRepository 
{
	void createCar(Car car);
	void updateCar(Car car);
	void deleteCar(int carid);
	Car readCar(int id);
	List<Car> readCars();

}
