package cn.ezt.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import cn.ezt.pojo.User;

public interface UserOrderMapper {

	@Insert("insert into order_user(order_id,user_id) values (#{orderId},#{userId})")
	void createUserOrder(@Param("orderId")String orderId,@Param("userId")String userId);

}
