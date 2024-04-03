package basicJava;

public class Calculator {
	
	
	
	/*ClassName--TheDarkNight
	 * methodName---theDarkNight
	 * 
	 * 
	 * ctrl+shift+f---align
	 * 
	 * 
	 */
public Calculator() {
	System.out.println("calling Constructor");
}

	public void add() {
		int a=10,b=20,c=a+b;
		System.out.println("add some numbers"+c);
	}
	public void sub() {
		System.out.println("SUB some numbers");
	}
	public void mul() {
		System.out.println("MUL some numbers");
	}
	public void div() {
		System.out.println("DIV some numbers");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calc=new Calculator();
		calc.add();
//		calc.mul();
//		calc.sub();
//		calc.div();
		new Calculator();
		new Calculator().add();
		new Calculator().sub();
		new Calculator().mul();
		
		Calculator1 calc1=new Calculator1();
		int i=calc1.getSum(10, 20);
		System.out.println("the sum is"+i	);
		
		
		
	}

}
