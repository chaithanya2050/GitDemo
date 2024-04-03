package reflectionExample;

import java.lang.reflect.Method;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t=new Test();
		
		Class clazz=t.getClass();
		
		System.out.println(clazz.getSimpleName());
		
	   Method[] arraMethods= clazz.getDeclaredMethods();
	   
	   System.out.println(arraMethods.length);
	   
	   for(Method m:arraMethods)
	   {
		   System.out.println(m.getName());
	   }
	}

}
