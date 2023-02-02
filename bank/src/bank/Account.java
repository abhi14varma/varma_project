package bank;

public abstract class Account 
{
	String accno;
	String name;
	protected double balance;
	
	public Account() {
		
	}

	public Account(String accno, String name, double balance) {
	
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public abstract void withdraw(double amt);

	@Override
	public String toString() {
		return "Account \n[accno=" + accno + ", \nname=" + name + ", \nbalance=" + balance + "]";
	}
	
	public abstract double calBalance();
	
	
	

}
