package edu.skku.java.cms;

public class Test {

	public static void main(String[] args) {
		Car c = new Car();
		Car c1 = new Car("11��1234",5000);
		Car c2 = new Bus(); //Car�� ��ӹ޾����� Ÿ���� ����Ÿ���� Car�� �ٲ㵵 ok!
		Car c3 = new Bus("44ȣ6543",8000,45);
		Car c4 = new Truck("74��3645",9000,3); //Truck�� ��ӹ��� DumpTruck�̾��ٰ� �ص� ok/ �޸𸮿��� DumpTruck, Truck, Car�� �ö�. �޸𸮿� �ִ� ���� �� �� �� �ִ�.
		
		c.start();//Car�� start()
		c1.start();//Car�� start()
		c2.start();//Bus�� start()
		c3.start();//Bust�� start()
		c4.start();//Truck�� �� start() //DumpTruck�� start() (Car, Truck, DumpTruck... ���������� �������̵� �� ��)
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

	}

}
