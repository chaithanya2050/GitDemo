package encapsulation;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank obj=new Bank();
		//obj.pinNo=2222;
		
		obj.updatePin(123456, 1234, 3333);
		
		obj.withdrawAmount(123456,3333, 10000);
		
	}

}
