package com.kpit.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component //its a spring object
@Entity
@Scope("prototype") //plus its JPA 
@Table(name="car_tbl")
public class Car 
{
	@Id
	@Column(name="car_id")
	private int carNumber;
	
	@Column(name="car_model")
	private String carModel;
	
	@Column(name="car_price")
	private float carPrice;

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

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public float getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(float carPrice) {
		this.carPrice = carPrice;
	}
	
	
	
}
