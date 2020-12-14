package javaleads.lesson2;

public class Boat extends Vehicle {
	/*Create a child class “Boat” and extend the abstract class “Vehiclel”. 
	 * Add new private member variable “engineCount”. Override the method “printVehicleDetails” 
	 * in the child class and make a call to parent method using keyword ”super”. 
	 * Implement the method “runVehicle
	 */
		private int engineCount =100;
		@Override
		public void printVehicleDetails() {
			super.printVehicleDetails();
		}
		@Override
		public void runVehical() {
			System.out.println("Boat runs on water");
			
		}
		
	}


