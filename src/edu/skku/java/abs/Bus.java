package edu.skku.java.abs;

public class Bus extends Car {

	@Override//(오버라이딩:이름, 리턴타입, 파라미터가 일치하는지 확인해달라는 의미)
	void start() {//abstract(미완성)이니까 강제 오버라이딩
		System.out.println("버스 출발~");
	}

}
