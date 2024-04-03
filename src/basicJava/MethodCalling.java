package basicJava;

public class MethodCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodCalling m=new MethodCalling();
		m.go();
		m.go1();
		m.go2();
		
		//go3();
	}
	
	
	// 
	
	public static void go3() {
		
		System.out.println("indise go3 method");

	}

	public void go() {

		System.out.println("indise go method");
		go1();

	}

	public void go1() {

		System.out.println("indise go1 method");

		go2();
	}

	public void go2() {

		System.out.println("indise go2 method");

	}

}
