package com.biz.classes;

public class ClassExec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass myClass; // MyClass라는 객체로 선언만 한 것
		myClass = new MyClass(); // myClass라는 객체를 초기화
		
		MyClass myClass01 = new MyClass(); // 선언과 초기화를 동시에 한 것 
		
		
		myClass.hello(); // method 호출,실행
		myClass01.hello(); // method 호출, 실행
		
		
		MyClass myClass02 = new MyClass();
		// MyClass형으로 myClass02 객체를 선언하고
		// MyClass에 (감춰진)method인 MyClass()를 호출, 실행해서
		// 객체를 초기화한다.
		
		
		
		myClass02.hello();
		myClass02.hello("홍길동");
			
		
		MyClass myClass03 = new MyClass("이몽룡");
		
		

	}

}
