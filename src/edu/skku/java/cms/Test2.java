package edu.skku.java.cms;

public class Test2 {

	public static void main(String[] args) {

		ICarMgr mgr=new CarManager();
		mgr.add(new Bus("11ȣ1245",5000,45));//add �޼��忡�� Car�� �޶�� ������ Bus�� Truck�� Car�� �����Ƿ�
		mgr.add(new Bus("33��2343",9000,15));
		mgr.add(new Truck("55��9783",7000,3));
		mgr.print();
		System.out.println("======= Bus List =======");
		mgr.busList();
		System.out.println("�� ������ �¼���:"+mgr.getBustSeats());
		System.out.println("5000���� �̻��� ���� ��:"+mgr.getCount(6000));
		Car[] re=mgr.getCars(6000);
		for(Car c: re) { //re�� �ִ� �������� ������ŭ ������ ����. �迭�� �� ���ֱ� ������.
			System.out.println(c);
		}
	}

}
