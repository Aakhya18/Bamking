package bImplementation;

public class Account {
//account_holder_name,acc_no,pincode,balance
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank P1=new Bank("Aman",1234,10000);
		P1.account_details();
		P1.withdrawl();
		P1.deposit();
		P1.pin_change(5678);
		System.out.println();
		
		Bank P2=new Bank("Akash",2345,12000);
		P2.account_details();
		P2.withdrawl();
		P2.deposit();
		P2.pin_change(8976);
		P2.withdrawl();
		P2.deposit();
		P2.account_details();
	}

}
