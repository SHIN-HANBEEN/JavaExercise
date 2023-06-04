package inheritance;

public class VIPCustomerExtends extends Customer{
	private int agentID;
	double saleRatio;
	
	public VIPCustomerExtends(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		customerGrade = "VIP";   // 상위 클래스에서 private 변수이므로 오류 발생
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomerExtends(int customerID, String customerName, int agentID) 생성자 호출 ");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + "담당 상담원 아이디는" + agentID + "입니다.";
	}

	@Override
	public int calcPrice(int price) {
		this.bonusPoint += (int)(price * bonusRatio);
		return price - (int)(price * saleRatio);
	}
	
	
}
