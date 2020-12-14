package Interface;

public class classA implements Product {



	@Override
	public void addStock(String productname, int quantity) {
		System.out.println("Product name: "+ productname + "" +" Quantity:"+ quantity);
		
		
	}

	

}
