package edu.skku.java.bank;

public class BankManager implements IBankMgr {
	Account[] as=new Account[50];
	int index=0;//���
	
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
	public void search() {//��ü���
		for(int i=0; i<index; i++) {
			System.out.println(as[i]);//as[i].toString()
		}
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#search(java.lang.String)
	 */
	@Override
	public Account search(String num) { //�޼ҵ��� �̸��� ���� �Ķ���Ͱ� �ٸ� = �����ε�
		for(int i=0; i<index; i++) {
			if(num.equals(as[i].getNum())) return as[i];
		}
		return null;//��ã������ null! ������ �����ϵ� ���ϵ� �ݵ�� ������ �־�� ��
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
			System.out.println("���¹�ȣ�� �������� ����");
			return;//return �ڿ� ���� ��� ������ void
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
			System.out.println("���¹�ȣ�� �������� ����");
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
			System.out.println("���¹�ȣ�� �������� ����");
			return;//return �ڿ� ���� ��� ������ void
		}
		a.withdraw(password, money);
		b.deposit(money);
		*/
		
	}

	
	

}
