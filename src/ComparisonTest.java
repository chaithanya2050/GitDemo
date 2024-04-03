
public class ComparisonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name1="Automation";
		String name2="Automation";
		
//		System.out.println(name1==name2);  //true
//		System.out.println(name1.equals(name2));//true
//	
		int x=100;
		int y=100;
		
		
		String name_1=new String("Automation");
		String name_2=new String("Automation");
		
//		System.out.println(name_1.equals(name_2));
//		System.out.println(name_1==name_2);
//		
		
		SingleTonTest s1=SingleTonTest.getInstance();
		
		SingleTonTest s=SingleTonTest.getInstance();
		
		System.out.println(s==s1);
	}

}
