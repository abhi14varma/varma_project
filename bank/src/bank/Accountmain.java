package bank;

import java.util.Scanner;

public class Accountmain {

	public static void main(String[] args)
	{
	Account [] a = new Account[1];
	 Scanner sc =  new Scanner(System.in);
	 
	 for(int i = 0 ; i < a.length ;i++)
	 {
		 System.out.println("enter the Account number =  ");
		 String accno = sc.next(); 
		 System.out.println("enter the Account holder name =  ");
		 String name = sc.next(); 
		 System.out.println("enter the Account balance  =  ");
		 double balance = sc.nextDouble(); 
		 System.out.println("enter the Amount  =  ");
		 double Amount = sc.nextDouble(); 
		 System.out.println("enter the installment  =  ");
		 double install = sc.nextDouble(); 
		 
		 System.out.println("enter 1 if your account is saving account  =  "); 
		 System.out.println("enter 2 if your account is recurring  account  =  ");
		  
		 int n = sc.nextInt();
		 switch(n)
		 {
		 case 1: 
			 a[i]=new Saving_acc(accno, name, balance);
			 
			 a[i].withdraw(Amount);
			 
			 System.out.println(a[i].toString());
			 break;
		 case 2:
               a[i]=new Recurring_acc(accno, name, balance,install);
			 
			 a[i].withdraw(Amount);
			 
			 System.out.println(a[i].toString());
			 break;
		 }
		
	 }
	 
	}

}
