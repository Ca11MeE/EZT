package cn.ezt.service;

import java.util.List;

import cn.ezt.pojo.Order;
import cn.ezt.pojo.User;

public interface OrderService {

	void createOrder(Order order, User user);

	List<Order> findAll();
	
}
