package cn.ezt.pojo;

/**
 * 原因
 * @author keliyi
 *
 */
public class Reason {
	private String reasonId; //原因ID
	private String reasonStr; //原因详细信息
	public String getReasonId() {
		return reasonId;
	}
	public void setReasonId(String reasonId) {
		this.reasonId = reasonId;
	}
	public String getReasonStr() {
		return reasonStr;
	}
	public void setReasonStr(String reasonStr) {
		this.reasonStr = reasonStr;
	}
	@Override
	public String toString() {
		return "Reason [reasonId=" + reasonId + ", reasonStr=" + reasonStr + "]";
	}
	
	
}
