package edu.skku.java.bank;

public class Minus extends Account {
	private int limit;
	
	
	public Minus() {
		super();
	}
	

	public Minus(String num, int password, long balance, int limit) {
		super(num, password, balance);
		setLimit(limit);
	}



	//�������̵� ��Ģ!!
	@Override
	public void withdraw(int password, int money) {
		if (checkPassword(password) && getBalance()+limit>=money) {//balance�� ������ �ȵǴ� getBalance setBalance��
			setBalance(getBalance()-money);
			System.out.println("���� ���~");
		}else {
			System.out.println("��й�ȣ ���� �Ǵ� �ܾ� ����~");
		}
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}


	@Override
	public String toString() {
		return "Minus [" + super.toString() + ", limit=" + limit + "]";
	}

	
	

}
