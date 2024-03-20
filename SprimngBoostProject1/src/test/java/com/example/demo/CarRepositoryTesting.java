package com.example.demo;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.pojo.Car;
import com.example.demo.repo.carrepository;



@SpringBootTest
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(locations = {"classpath:carConfig.xml"})
public class CarRepositoryTesting {

	@Autowired
	carrepository carRepo;
	
	@Autowired
	Car carObj;
	
	@Test
	public void createCarTest() {

		System.out.println("Test Cases ");
		carObj.setCarNumber(107);
		carObj.setCarName("BMW");
		carObj.setCarPrice(600000);
		carRepo.save(carObj);
		 
	}
	@Test
	public void findCarTest()
	{
		Car car = null;
		Optional<Car>box = carRepo.findById(106);
		if(box.isPresent())
		{
			car = box.get();
		}
		System.out.println(car.getCarName()+" "+car.getCarPrice());
	}
	
	
}