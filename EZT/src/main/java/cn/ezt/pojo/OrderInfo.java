package cn.ezt.pojo;

/**
 * 订单详细状态信息
 * @author 37247
 *
 */
public class OrderInfo {
	private String stateId; //状态ID
	private String reasonId; //原因ID
	private String stateStr; //状态详细信息
	private Reason reason; //具体原因
	public String getStateId() {
		return stateId;
	}
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}
	public String getReasonId() {
		return reasonId;
	}
	public void setReasonId(String reasonId) {
		this.reasonId = reasonId;
	}
	public String getStateStr() {
		return stateStr;
	}
	public void setStateStr(String stateStr) {
		this.stateStr = stateStr;
	}
	public Reason getReason() {
		return reason;
	}
	public void setReason(Reason reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "OrderInfo [stateId=" + stateId + ", reasonId=" + reasonId + ", stateStr=" + stateStr + ", reason="
				+ reason + "]";
	}
	
	
}
