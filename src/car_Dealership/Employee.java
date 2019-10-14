package car_Dealership;

public class Employee {
	
	private String name;
	private int emp_num;
	
	public String getname() {
		return name;		
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getEmpNum() {
		return emp_num;
	}
	public void setEmpNum(int num) {
		this.emp_num = num;
	}
	
	public void runCreditHistory(Customer cust, Vehicle vehicle) {
		double amount = vehicle.getprice() - cust.getCashOnhand();
		System.out.println("Ran credit history of " + cust.getName() + "for the amount " + amount);
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle) {
		
		System.out.println("Vehicle " + vehicle.getmake() + " is sold to " + cust.getName() + " for " + vehicle.getprice());
	}
	
	public void handleCustomer(Customer cust, Vehicle vehicle) {
		if (cust.getCashOnhand() < vehicle.getprice()) {
			runCreditHistory(cust, vehicle);
			
		}
		else {
			processTransaction(cust, vehicle);
		}
	}
	}
	
	
	
	

