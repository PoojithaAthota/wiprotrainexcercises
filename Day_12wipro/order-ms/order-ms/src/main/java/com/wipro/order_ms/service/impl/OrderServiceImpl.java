package com.wipro.order_ms.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.order_ms.entity.Order;
import com.wipro.order_ms.repo.OrderRepo;
import com.wipro.order_ms.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepo orderRepo;
	
	@Override
	public void save(Order order) {
		 
		orderRepo.save(order);
	}

	@Override
	public List<Order> findAll() {
		 
		return orderRepo.findAll();
	}

}
