package car_Dealership;

public class Customer {
	private String name;
	private int number;
	private double cashOnhand;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumbe() {
		return number;
	}
	public void setNumbe(int numbe) {
		this.number = numbe;
	}
	public double getCashOnhand() {
		return cashOnhand;
	}
	public void setCashOnhand(double cashOnhand) {
		this.cashOnhand = cashOnhand;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void speak(Vehicle vehicle) {
	System.out.println("Hi, I am here to buy a " + vehicle);
	
	}
	
	public String walk(String name, double cashOnhand) {
		return "I am " + name + ". and i have " + cashOnhand + " in hand.";
	}
	
}
