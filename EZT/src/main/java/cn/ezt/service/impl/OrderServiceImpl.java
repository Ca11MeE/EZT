package cn.ezt.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ezt.mapper.OrderMapper;
import cn.ezt.mapper.UserOrderMapper;
import cn.ezt.pojo.Order;
import cn.ezt.pojo.User;
import cn.ezt.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderMapper orderMapper;
	@Autowired
	UserOrderMapper userOrderMapper;
	
	public void createOrder(Order order,User user) {
		String userId = user.getUserId();
		order.setOrderId(UUID.randomUUID().toString());
		//设定状态-----已提交
		order.setStateId("0");
		order.setCreateTime(new Date());
		order.setCreateBy(order.getCreaterName());
		order.setUpdateBy(order.getCreaterName());
		order.setUpdateTime(order.getCreateTime());
		userOrderMapper.createUserOrder(order.getOrderId(),userId);
		orderMapper.createOrder(order);
	}

	@Override
	public List<Order> findAll() {
		return orderMapper.findAll();
	}

}
