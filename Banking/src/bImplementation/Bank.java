package bImplementation;

import java.util.Scanner;

import bPlanning.Requirement;;

public class Bank implements Requirement {
	static int count = 10000;
	String account_holder_name;

	private int acc_no;
	{
		count++;
		this.acc_no = count;
	}

	public int getAcc_no() {
		return acc_no;
	}

	private int pincode;

	public void setPincode(int pincode) {

		this.pincode = pincode;

	}

	private float balance;

	public float getBalance() {

		return balance;

	}

	public void setBalance(float balance) {
		this.balance = balance;
		System.out.println("Balance is " + balance);
	}

	public void withdrawl() {
		System.out.println("For Withdrawl Enter pin");
		Scanner in = new Scanner(System.in);
		int pin = in.nextInt();
		if (pin == this.pincode) {
			System.out.println("Pin correct. You can withdraw.");
			System.out.println("Enter amount to Withdraw");
			Scanner in2 = new Scanner(System.in);
			float amount = in2.nextFloat();
			if (amount < this.getBalance()) {
				amount = this.getBalance() - amount;
				this.setBalance(amount);
			} else {
				System.out.println("Withdrawing amount is greater than account balance");
			}
		} else {
			System.out.println("Wrong pin");
		}
	}

	public void deposit() {
		System.out.println("Enter pin for Deposit");
		Scanner in = new Scanner(System.in);
		int pin = in.nextInt();
		if (pin == this.pincode) {
			System.out.println("Pin correct. You can deposit.");
			System.out.println("Enter amount to Deposit");
			Scanner in1 = new Scanner(System.in);
			float amount = in1.nextFloat();
			amount = amount + this.getBalance();
			this.setBalance(amount);
		} else {
			System.out.println("Wrong pin");
		}

	}

	public void pin_change(int pincode) {
		// TODO Auto-generated method stub
		System.out.println("Enter old pin for pin change");
		Scanner in = new Scanner(System.in);
		int oldpincode = in.nextInt();
		if (oldpincode == this.pincode) {
			this.setPincode(pincode);
			System.out.println("Pin Changed Successfully");
			System.out.println("Pin is " + pincode);
		} else
			System.out.println("Wrong Pin");
	}

	public void account_details() {
		// TODO Auto-generated method stub
		System.out.println("Account Details");
		System.out.println("Name " + this.account_holder_name);
		System.out.println("Account Number " + this.getAcc_no());
		System.out.println("Enter pin for balance");
		Scanner in = new Scanner(System.in);
		int pincode = in.nextInt();
		if (pincode == this.pincode) {
			this.getBalance();
			System.out.println("Balance " + this.getBalance());
		} else
			System.out.println("Wrong Pin");
		System.out.println();
	}

	Bank(String account_holder_name, int pincode, float balance) {
		super();
		this.account_holder_name = account_holder_name;
		// this.acc_no = acc_no;
		this.pincode = pincode;
		this.balance = balance;
	}

	Bank() {

	}

}
