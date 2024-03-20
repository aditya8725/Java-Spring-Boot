package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.pojo.Car;

public interface carrepository extends CrudRepository<Car,Integer> {

}
