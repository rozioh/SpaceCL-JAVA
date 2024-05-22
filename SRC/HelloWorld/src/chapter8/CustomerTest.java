package chapter8;

public class CustomerTest {
	public static void main(String[] args) {
		VIPCustomer vip = new VIPCustomer();
		vip.calcPrice(100);
		System.out.println(vip.showCustomerInfo());
		
//		Customer cu = new Customer();
//		cu.calcPrice(200);
//		System.out.println(cu.showCustomerInfo());
		
//		// 사용하는 모양 = new 생성하는 모양
//		Object cpp = new Customer();
//		VIPCustomer cp2 = (VIPCustomer) cpp; // 이렇게는 안된다.
		
		System.out.println(vip);
		
		Customer cc = new Customer();
		System.out.println(cc);
	}
	
}
