package com.wipro.orderms.service;


import java.util.List;

import com.wipro.orderms.dto.Order;
import com.wipro.orderms.dto1.OrderWithPaymentDto;

public interface OrderService {
	
	void save(Order order);
	
	List<OrderWithPaymentDto> findAll();

}