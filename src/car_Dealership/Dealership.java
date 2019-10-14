package car_Dealership;

public class Dealership {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		
		c1.setName("Tommy");
		c1.setCashOnhand(13000);
		c1.setEmail("reachtom@gmail.com");
		c1.setNumbe(857123654);
		
		Vehicle v1 = new Vehicle();
		v1.setmake("Toyota");
		v1.setmodel("Camry");
		v1.setyear(2019);
		v1.setprice(13000);
		v1.setcolor("Blue");
		
				
		Employee e1 = new Employee();
		e1.setname("Raj");
		e1.setEmpNum(101);
		
		e1.handleCustomer(c1, v1);
		
		
		
	}

}
