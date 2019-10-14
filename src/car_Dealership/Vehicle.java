package car_Dealership;

public class Vehicle {
	
	private String make;
	private String model;
	private int year;
	private double price;
	private String color;
	
	public String getmake() {
		return make;
	}
	public void setmake(String make) {
		this.make = make; 
	}
	public String getmodel() {
		return model;
	}
	public void setmodel(String model) {
		this.model = model;
	}
	public int getyear() {
		return year;
	}
	public void setyear(int year) {
		this.year = year;
	}
	public double getprice() {
		return price;
	}
	public void setprice(double price) {
		this.price = price;
	}
	
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
}
