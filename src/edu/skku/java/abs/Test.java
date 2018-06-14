package edu.skku.java.abs;

public class Test {

	public static void main(String[] args) {
		Car c=new Bus(); //Car가 abstract이니까 이렇게 쓰는 것이 가능.
		//new Car();는 안되지만 타입으로 오는 것은 가능.
		c.start(); //Bus의 start오버라이드
		c.stop();//Car에밖에 stop이 없으니까 Car의 stop

	}

}
