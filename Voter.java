package ExceptionClass;

public class Voter {
	public static void main(String[] args) {
		int age=10;
		try {
			if(age<18) {
				throw new VoterNotFoundException("age is below 18");
				
			}
			else {
				System.out.println("valid voter");
			}
		}catch (VoterNotFoundException vnf) {
			vnf.printStackTrace();
			System.out.println("invalid voter");
		}
		
	}

}
