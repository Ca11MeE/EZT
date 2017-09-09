package cn.ezt.pojo;

/**
 * 订单
 * @author 37247
 *
 */
public class Order extends BaseInfo{
	private String orderId;//订单ID
	private String stateId;//状态ID
	private String deptName;//公司名称
	private String deptAddr;//公司地址
	private String createrName; //申办人或申办公司名称
	private String telephone;//联系电话
	private String agentId;//业务员ID
	private OrderState orderState;
	
	
	public OrderState getOrderState() {
		return orderState;
	}
	public void setOrderState(OrderState orderState) {
		this.orderState = orderState;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getStateId() {
		return stateId;
	}
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptAddr() {
		return deptAddr;
	}
	public void setDeptAddr(String deptAddr) {
		this.deptAddr = deptAddr;
	}
	public String getCreaterName() {
		return createrName;
	}
	public void setCreaterName(String createrName) {
		this.createrName = createrName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", stateId=" + stateId + ", deptName=" + deptName + ", deptAddr="
				+ deptAddr + ", createrName=" + createrName + ", telephone=" + telephone + ", agentId=" + agentId
				+ ", orderState=" + orderState + "]";
	}
	
}
