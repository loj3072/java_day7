package edu.skku.java.bank;

public interface IBankMgr {

	void add(Account a);

	void search();

	Account search(String num);

	void searchMinus();

	int getTotal();

	void deposit(String num, int money);

	void withdraw(String num, int password, int money);

	void trans(String num, int password, int money, String num2);

}