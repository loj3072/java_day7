package edu.skku.java.abs;

public class Test {

	public static void main(String[] args) {
		Car c=new Bus(); //Car�� abstract�̴ϱ� �̷��� ���� ���� ����.
		//new Car();�� �ȵ����� Ÿ������ ���� ���� ����.
		c.start(); //Bus�� start�������̵�
		c.stop();//Car���ۿ� stop�� �����ϱ� Car�� stop

	}

}
