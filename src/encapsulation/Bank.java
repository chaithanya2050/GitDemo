package encapsulation;

public class Bank {

	
	public int  accountno=123456;
	private int pinNo=1234;
	private double balanceAmount=100000;
	
	
	
	public double getBalanceAmount() {
		return balanceAmount;
	}


	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}


	public int getAccountno() {
		return accountno;
	}


	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}


	public void withdrawAmount(int accNo,int pin,int amount)
	{
		if(accNo==accountno && pin==pinNo)
		{
			if(amount<=balanceAmount)
			{
				balanceAmount=balanceAmount-amount;
				System.out.println("amount withdrwal  :"+amount);
				
			}
			else
			{
				System.out.println("insufficient balance  !!");
			}
			
		}
		else
		{
			System.out.println("invalid credentials");
		}
	}
	
	
	public void updatePin(int accNo, int oldPin, int newPin)
	{
		if(accNo==accountno && oldPin==pinNo)
		{
			pinNo=newPin;
			
			System.out.println("pin changed successfully  !");
		}
		else
		{
			System.out.println("invalid credentials");
		}
	}
	
	public double depositCash(int accNo,int pin,double amount)
	{
		if(accNo==accountno && pin==pinNo)
		{
			balanceAmount=balanceAmount+amount;
			 return balanceAmount;
			 		
		}
		else
		{
			System.out.println("invalid credentials");
			return balanceAmount;
		}
		
	}
	
}
