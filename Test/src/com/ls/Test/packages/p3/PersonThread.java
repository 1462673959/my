package com.ls.Test.packages.p3;

public class PersonThread extends Thread {
	public BankAccount bankAccount;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
			bankAccount.getMoney(Thread.currentThread().getName(),200);

	}
	public PersonThread(BankAccount bankAccount) {
		super();
		this.bankAccount = bankAccount;
	}
}
