package edu.skku.java.cms;

public class Car {
	private String num;
	private int price; //int 32bit 21�����
	
	public Car() {
		super();//������ �����Ϸ��� �����ϸ鼭 �˾Ƽ� �������
	}
	public Car(String num, int price) {
		super();
		setNum(num);
		setPrice(price); // ���� �ִ� �ͺ��ٴ� set �޼��带 ���ؼ� ����ϴ� ���� �ξ� �� ����. set�޼��忡�� üũ�ϰ� ���� �� �����Ƿ�.
	}
	
	public void start() {
		System.out.println("���~");
	}
	public void stop() {
		System.out.println("����~");
	}
	
	public String getNum() {
		//���� �ùٸ��� üũ
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [num=" + num + ", price=" + price + "]";
	}

	
	
	

}
