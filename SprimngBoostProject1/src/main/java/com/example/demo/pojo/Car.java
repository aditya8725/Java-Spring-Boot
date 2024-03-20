package com.example.demo.pojo;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="car_tbl2")
public class Car 
{
	@Id
	@Column(name="car_no")
	private int carNumber;
	
	@Column(name="car_name")
	private String carName;
	
	@Column(name="car_price")
	private int carPrice;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int f) {
		this.carPrice = f;
	}
	
	
	
	

}
