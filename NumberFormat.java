package ExceptionClass;

public class NumberFormat {
	public static void main(String[]args) {
		String value="hi";
		try {
			int num=Integer.parseInt(value);
			System.out.println(num);
		}catch(NumberFormatException n) {
			n.printStackTrace();
			System.out.println(n);
			System.out.println("invalid length");
		}
		System.out.println("thankyou");
		
	}

}
