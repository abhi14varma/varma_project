package bank;

public class Saving_acc extends Account
{
	static float int_rate;
	
	static
	{
//		int_rate;
	}
	public Saving_acc() 
	{
		super();
		
	}

	public Saving_acc(String accno, String name, double balance) 
	{
		super(accno, name, balance);
			
	}

	@Override
	public void withdraw(double amt) 
	{
		if((balance - amt )>= 2000)
		{
			System.out.println(" withdrawn amount = "+(balance - amt));
		}
		else
		{
			System.out.println("amount is not withdrawn due to insufficient balance!!!!");
		}
	}
		public double calBalance()
		{
			return double;	
		}
	
	

}
