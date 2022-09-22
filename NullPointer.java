package ExceptionClass;

public class NullPointer {
	public static void main(String[]args) {
		System.out.println("welcome");
	String value=null;
	try {
		System.out.println(value.length());
	}catch(NullPointerException e) {
		System.out.println("no length for null value");
	}
	System.out.println("thankyou");
	}

	
	

}
