package cn.ezt.pojo;

/**
 * 订单状态
 * @author 37247
 *
 */
public class OrderState {
	private String stateId; //状态ID
	private String stateName; //状态名
	private OrderInfo orderInfo; //订单详细状态
	public String getStateId() {
		return stateId;
	}
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public OrderInfo getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(OrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}
	@Override
	public String toString() {
		return "OrderState [stateId=" + stateId + ", stateName=" + stateName + ", orderInfo=" + orderInfo + "]";
	}
	
	
	
}
