package edu.skku.java.bank;

public class BankManager implements IBankMgr {
	Account[] as=new Account[50];
	int index=0;//명시
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#add(edu.skku.java.bank.Account)
	 */
	@Override
	public void add(Account a) {
		as[index++]=a;
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#search()
	 */
	@Override
	public void search() {//전체출력
		for(int i=0; i<index; i++) {
			System.out.println(as[i]);//as[i].toString()
		}
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#search(java.lang.String)
	 */
	@Override
	public Account search(String num) { //메소드의 이름이 갖고 파라메터가 다름 = 오버로딩
		for(int i=0; i<index; i++) {
			if(num.equals(as[i].getNum())) return as[i];
		}
		return null;//못찾았으면 null! 조건이 만족하든 안하든 반드시 리턴이 있어야 함
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#searchMinus()
	 */
	@Override
	public void searchMinus() {
		for(int i=0; i<index; i++) {
			if(as[i] instanceof Minus) {
				System.out.println(as[i]);
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#getTotal()
	 */
	@Override
	public int getTotal() {
		int sum=0;
		for(int i=0; i<index; i++) {
			sum+=as[i].getBalance();
		}
		return sum;		
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#deposit(java.lang.String, int)
	 */
	@Override
	public void deposit(String num, int money) {
		Account a=search(num);
		if(a == null) {
			System.out.println("계좌번호가 존재하지 않음");
			return;//return 뒤에 값이 없어도 오케이 void
		}
		a.deposit(money);	
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#withdraw(java.lang.String, int, int)
	 */
	@Override
	public void withdraw(String num, int password, int money) {
		Account a=search(num);
		if(a != null) {
			a.withdraw(password, money);
		}else {
			System.out.println("계좌번호가 존재하지 않음");
		}
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#trans(java.lang.String, int, int, java.lang.String)
	 */
	@Override
	public void trans(String num, int password, int money, String num2) {
		
		withdraw(num, password, money);
		deposit(num2, money);
		/*
		Account a=search(num);
		Account b=search(num2);
		if(a == null || b == null) {
			System.out.println("계좌번호가 존재하지 않음");
			return;//return 뒤에 값이 없어도 오케이 void
		}
		a.withdraw(password, money);
		b.deposit(money);
		*/
		
	}

	
	

}
