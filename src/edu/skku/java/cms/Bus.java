package edu.skku.java.cms;

public class Bus extends Car {
	private int seat;
	
	public Bus() {
		super(); //��ӹ��� ���� Ŭ������ ������ Car()�� �θ�
	}
	
	public Bus(String num, int price, int seat) {
		super(num, price); //super=Car�� �θ�/ ��ӹ��� ���� Ŭ������ ������ Car(String num, int price)�� ȣ��
		setSeat(seat);
	}
	
	public void start() {
		System.out.println("���� ���~");
	}
	
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	

	@Override
	public String toString() {
		return "Bus [getNum()=" + getNum() + ", getPrice()=" + getPrice() + ", seat=" + seat + "]";
	}
	
	
}
