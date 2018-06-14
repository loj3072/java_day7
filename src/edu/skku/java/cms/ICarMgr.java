package edu.skku.java.cms;

public interface ICarMgr {

	void add(Car c);

	void print();

	void busList();

	void truckList();

	//������ �������� �� �¼��� ���ؼ� �����ϱ�
	int getBustSeats();

	//������ ���� �� �Ķ���ͷ� ���޵� ���� �̻��� ������ ���� ���ϱ�
	int getCount(int price);

	//������ ���� �� �Ķ���ͷ� ���޵� ���� �̻��� ������ ������ ���ؼ� ����
	Car[] getCars(int price);

}