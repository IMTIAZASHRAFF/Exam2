package Overloading_Overriding;

public class Honda {
	public void demo(int a) {
		System.out.println("this is the number");
	}
	public void demo (String b) {
		System.out.println("Enter words");
	}
	public void demo (int a , String b) {
		System.out.println("this is the number");
		System.out.println("Enter words");
	}
	public void demo (String b , int a) {
		System.out.println("Enter words");
		System.out.println("this is the number");
		}
	public void demo(int a , int b) {
		System.out.println("this is the number :" + (a+b)+ " " + (a*b));
	
	}
}
