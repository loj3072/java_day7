package edu.skku.java.abs;

public abstract class Car { //Ŭ���� �տ��� abstract�� �ٿ��� �����ȳ�
	String num;
	int price;
	
	abstract void start(); // {};�� ������ ������. �ȳ����� ��������
	void stop() {
		System.out.println("����");
	} //������
}
