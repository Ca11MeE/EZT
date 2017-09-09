package cn.ezt.mapper;

import java.util.List;

import cn.ezt.pojo.Order;

public interface OrderMapper {

	void createOrder(Order order);

	List<Order> findAll();

}
