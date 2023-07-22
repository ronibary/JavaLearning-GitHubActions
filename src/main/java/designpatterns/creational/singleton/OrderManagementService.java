package designpatterns.creational.singleton;

public class OrderManagementService {
	
	private static OrderManagementService instance;
	
	private OrderManagementService() {
	}

	// An implementation of double checked
	// locking of Singleton. Intention is to reduce cost
	// of synchronization and improve performance, by only
	// locking critical section of code, the code which
	// creates instance of Singleton class.
	public static OrderManagementService getInstance()
	{
		if (instance == null) {
			synchronized (OrderManagementService.class)
			{
				if (instance == null) {
					instance = new OrderManagementService();
				}
			}
		}
		return instance;
	}
	
//	public static synchronized OrderManagementService getInstance() {
//		if (instance == null) {
//			instance = new OrderManagementService();
//		}
//		return instance;
//	}
	
	public void placeOrder() {
		System.out.println("Place order method is invoked");
	}

}
