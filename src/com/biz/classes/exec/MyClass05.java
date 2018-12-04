package com.biz.classes.exec;

public class MyClass05 {
	
	String strName;
	int intAge;
	
	// 1번 기본생성자는 아무런 매개변수 없이
	// 호출되므로 이름의 기본값인 몽이를 2번 생성자에게 전달하는 역할을 한다.
	public MyClass05() { // 기본생성자, blank constructor

		this("몽이");
		
	}
	// 2번 생성자는 매개변수로 받은 값과
	// 나이의 기본값 14를 3번 생성자로 전달하는 역할만 한다.
	public MyClass05(String strName) { // String형 strName을 매개변수로 받는 생성자
		this(strName,14);
		
	}
	
	// 3번 생성자에서 모든 변수를 초기화 전담
	public MyClass05(String strName, int intAge) {
		this.strName = strName;
		this.intAge = intAge;
		
		
	}
}
