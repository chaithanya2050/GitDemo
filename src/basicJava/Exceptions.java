package basicJava;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("before try ");
		
		try {
			System.out.println("Begining");
			
			int divide=10/0;
			System.out.println(divide);
			
			System.out.println("Ending");
		}

		catch(Exception e)
		{
			System.out.println("Error Occurred");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("After try");
	}

}
