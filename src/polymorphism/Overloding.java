package polymorphism;

public class Overloding {

	
	public static void main(int a) {
		
	}

	

	// varargs
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overloding obj=new Overloding();
		
		obj.addition(10,10,20,30);
		System.out.println();
		
	}
	
	
	public void addition(int ... a)
	{
		int [] var=a;
		//System.out.println(var);
	}

}
