import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.kpit.pojo.Car;
import com.kpit.repo.CarRepository;
import com.kpit.repo.CarRepositoryImpl;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:carsConfig.xml"})
public class CarRepositoryTesting {

	@Autowired
	CarRepository carRepo;
	
	@Autowired
	Car carObj;
	
	@Test
	public void createCarTest() {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("carsConfig.xml");
//		CarRepository carRepo = ctx.getBean(CarRepository.class);
//		Car carObj = new Car();
		System.out.println("Test Cases ");
		carObj.setCarNumber(103);
		carObj.setCarModel("Audi");
		carObj.setCarPrice(600000);
		carRepo.createCar(carObj);
	}
	
	@Test
	public void updateCarTest() {

		System.out.println("Test Cases ");
		carObj.setCarNumber(104);
		carObj.setCarModel("BMW");
		carObj.setCarPrice(1200000);
		carRepo.createCar(carObj);
	}
}