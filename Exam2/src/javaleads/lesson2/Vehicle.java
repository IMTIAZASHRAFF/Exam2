package javaleads.lesson2;

public abstract class Vehicle {
/* Create an abstract class called “Vehicle” under the package “javaleads.lesson2”. 
	The abstract class should have private member variables “type” and “capacity”
	of appropriate data types. This abstract class should have an abstract method”runVehical” 
	and a proper method call “printVehicleDetails”*/
	
	private String type = "Honda accourd";
	 private int capcity = 8;
	
	public abstract void runVehical();
	public  void printVehicleDetails() {
		System.out.println("This from Vehicle");
	}
}
 