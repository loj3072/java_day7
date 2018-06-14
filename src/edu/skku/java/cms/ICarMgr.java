package edu.skku.java.cms;

public interface ICarMgr {

	void add(Car c);

	void print();

	void busList();

	void truckList();

	//소유한 버스들의 총 좌석수 구해서 리턴하기
	int getBustSeats();

	//소유한 차들 중 파라메터로 전달된 가격 이상인 차들의 개수 구하기
	int getCount(int price);

	//소유한 차들 중 파라메터로 전달된 가격 이상인 차들의 정보를 구해서 리턴
	Car[] getCars(int price);

}