package javaleads.lesson2;

public class Car extends Vehicle{
/* Create a child class “Car” and extend the abstract class “Vehicle”. 
 * Add new private member variable “engineCount”.Override the method “printVehicleDetails” 
 * in the child class and make a call to parent method using keyword ”super”.
 * Implement the method “runVehicle”
 */
	 private int engineCount = 120;

   @Override
	public  void printVehicleDetails() {	
		super.printVehicleDetails();
	}

	@Override
	public void runVehical() {
		System.out.println("Car run fast");
	}
	 
}
