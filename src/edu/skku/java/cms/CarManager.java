package edu.skku.java.cms;

public class CarManager implements ICarMgr {//�ڵ����� �����ϴ� Ŭ����

	//������ ���, Ʈ���� ���... Car �迭�� ����� ������!
	Car[] cars=new Car[100];
	int index=0;
	
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#add(edu.skku.java.cms.Car)
	 */
	@Override
	public void add(Car c) {
		cars[index]=c;
		index++;
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#print()
	 */
	@Override
	public void print() {
		for(int i=0; i<index; i++) {
			System.out.println(cars[i]);//c.toString
		}
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#busList()
	 */
	@Override
	public void busList() {
		for(int i=0; i<index; i++) {
			if(cars[i] instanceof Bus) //instanceof: ������Ʈ Ȯ��. �޸𸮿� Bus�� �ֳ�?
				System.out.println(cars[i]);//c.toString
		}
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#truckList()
	 */
	@Override
	public void truckList() {
		for(int i=0; i<index; i++) {
			if(cars[i] instanceof Truck) //instanceof: ������Ʈ Ȯ��. �޸𸮿�Truck�� �ֳ�?
				System.out.println(cars[i]);//c.toString
		}
	}
	//������ �������� �� �¼��� ���ؼ� �����ϱ�
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#getBustSeats()
	 */
	@Override
	public int getBustSeats() {
		int sum=0;//������ �������� ����� ����!
		for(int i=0; i<index; i++) {
			if(cars[i] instanceof Bus) { //instanceof: ������Ʈ Ȯ��. �޸𸮿� Bus�� �ֳ�?
				Bus b=(Bus)cars[i];
				sum+=b.getSeat();
			}
		}
		return sum;
	}
	//������ ���� �� �Ķ���ͷ� ���޵� ���� �̻��� ������ ���� ���ϱ�
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#getCount(int)
	 */
	@Override
	public int getCount(int price) {
		int cnt=0;
		for(int i=0; i<index; i++) {
			if(cars[i].getPrice()>=price) { 
				cnt++;
			}
		}
		return cnt;
	}
	//������ ���� �� �Ķ���ͷ� ���޵� ���� �̻��� ������ ������ ���ؼ� ����
	/* (non-Javadoc)
	 * @see edu.skku.java.cms.ICarMgr#getCars(int)
	 */
	@Override
	public Car[] getCars(int price) {
		Car[] result=new Car[getCount(price)];//������ ���ϰ� �迭�� ũ�⸦ ����. / ���� Ŭ���������� �޼��带 �׳� �ҷ��� �� �� ����
		int n=0;
		for(int i=0; i<index; i++) {
			if(cars[i].getPrice()>=price) { 
				result[n++]=cars[i];//n++:���� ������ ���� / ++n:�����ϱ� ���� ����
				//n++;
			}
		}
		return result;
		
	}
	
}
