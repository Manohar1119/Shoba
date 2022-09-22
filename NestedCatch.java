package ExceptionClass;

public class NestedCatch {
	public static void main(String[]args) {
		try {
			String[] values= {"manu","sagar","shoba","sameer"};
			System.out.println(values[7]);
			System.out.println(values[1].charAt(10));
			int num=Integer.parseInt(values[1]);
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai);
		}
		catch(StringIndexOutOfBoundsException si) {
			System.out.println(si);
		}
		catch(NumberFormatException nf) {
			System.out.println(nf);
		}
	}

}
