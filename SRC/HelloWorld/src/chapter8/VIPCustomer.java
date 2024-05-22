package chapter8;

public class VIPCustomer extends Customer {
	private int agentID; // VIP 고객 상담원 아이디
	double saleRatio; // 할인율
	
	public VIPCustomer() {
//		자식의 default 생성자는 부모의 default 생성자를 기본적으로 호출한다. 그렇지만 생략되어 있다.
//		super();
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자");
	}
	
	public VIPCustomer(int agentId) {
		super(agentId);
		this.agentID = agentId;
		System.out.println("VIPCustomer(int agentId) 생성자");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public void calcPrice2() {
		super.calcPrice(100);
	}
	
	@Override // 어노테이션 : 표식이면서 코드
	public int calcPrice(int price) {
		return 0;
	}
	
	@Override
	public String toString() {
		return "안녕 나는 VIPCustomer 클래스야";
	}
	
}
