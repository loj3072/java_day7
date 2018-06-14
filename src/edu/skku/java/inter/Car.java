package edu.skku.java.inter;

public interface Car {
	final int COUNT=100;//상수는 모두 대문자로
	int k=5;//오잉 final 안붙였는데 에러 안나!
	
	public abstract void start();//미완성 메서드
	void stop();//오잉 abstract 안붙였는데 에러안나! 
	
	//final, abstract 굳이 안 써도 final, abstract 취급해줌

}
