package bank;

public  class Recurring_acc extends Account 
{
	
//protected double installment;
//private double installment_amt;
private double no_of_installment;
static double int_rate;


public Recurring_acc() {
	super();
	// TODO Auto-generated constructor stub
}

public Recurring_acc(String accno, String name, double balance,double no_of_installment)
{
	super(accno, name, balance);
	
	this.no_of_installment=no_of_installment;
}

@Override
public  void withdraw(double amt)
{
	System.out.println("installment is =  "+no_of_installment +"  first complete your intallment ");
	System.out.println("withdrawal is not allowed from recurring account ");
}

public  static double calBalance(double installment_amt, double int_rate )
{
	double sum =installment_amt * no_of_installment * int_rate;
	
	return sum ;
}



}
