package com.wipro.springmvc1.impl;

import com.wipro.springmvc1.repo.CarRepo;
import com.wipro.springmvc1.service.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepo carRepo;

    @Override
    public List<String> getAllCars() {
        return carRepo.fetchCars();
    }
}

