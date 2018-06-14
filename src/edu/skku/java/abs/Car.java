package edu.skku.java.abs;

public abstract class Car { //클래스 앞에도 abstract를 붙여야 에러안남
	String num;
	int price;
	
	abstract void start(); // {};로 끝나면 구현됨. 안끝나서 구현덜됨
	void stop() {
		System.out.println("멈춤");
	} //구현됨
}
