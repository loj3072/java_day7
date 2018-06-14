package edu.skku.java.bank;

public class Account {
	private String num;//���¹�ȣ
	private int password;//��й�ȣ
	private long balance;//�ܾ�
	
	
	public Account() {
		super();
	}
	
	public Account(String num, int password, long balance) {
		//super(); //������ �����Ϸ��� ���߿� �������
		setNum(num);//���¹�ȣ�� �´���
		setPassword(password);//��й�ȣ�԰��� �´���
		setBalance(balance);
	}


	//(���¹�ȣ�� Ȯ���� ��)�Ա�
	public void deposit(int money) {
		balance +=money;
	}
	//��й�ȣ üũ
	public boolean checkPassword(int password) {
		//return this.password.equals(password);// ��й�ȣ�� ���ڿ��϶�
		return this.password==password;
	}
	//���
	public void withdraw(int password, int money) {
		if (checkPassword(password) && balance>=money) {
			balance -= money;//balance = balance-money
			System.out.println("���� ���~");
		}else {
			System.out.println("��й�ȣ ���� �Ǵ� �ܾ� ����~");
		}
	}
	
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	private int getPassword() {//�н������ �����༱ �ȵ�!
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [num=" + num + ", balance=" + balance + "]"; //�н������ ������!
	}
	
	

}
