package ExceptionClass;

public class Flipkrt {
	public static void main(String[]args) {
	int price=9000;
		
	try{
		if(price<=10000) {
	
			throw new ProductNotFoundException("for below 10000 price no ac is there");
		}
		else{
			System.out.println("product List");
		}
	} catch(ProductNotFoundException e) {
		e.printStackTrace();
		System.out.println("products not found");
	}
		
		
		
	}

}
