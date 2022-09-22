package ExceptionClass;

public class Divide {
	public static void main(String[]args) {
		System.out.println("Welcome");
		int num=10;
		int num1=0;
		int num3=100;
		try {
			int num2=num*num3/num1;
			System.out.println(num2);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("num can't be divide with 0");
			}
		System.out.println("ThankYou");
	}

}
