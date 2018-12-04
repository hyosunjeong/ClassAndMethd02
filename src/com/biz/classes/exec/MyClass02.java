package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. List<String> stList 객체를 멤버변수 영역에 선언하시오
 * 2. 생성자에서 stList를 초기화 하시오
 * 3. hello()메서드에서 strName을 매개변수로 받아 stList에 추가하시오
 */


public class MyClass02 {

	// member 변수 영역
	List<String> stList;
	
	public MyClass02() { // 생성자 (클래스이름과 같은 이름)
		stList = new ArrayList();
		
	}
		
	public void hello(String strName) { // hello()메서드
	
				stList.add(strName);
		
	}
	
	public void view() {
		
		int intLen = stList.size();
		for(int i = 0; i<  stList.size(); i++ ) {
			System.out.println(stList.get(i));
			
		}
		 for(String s : stList) {
		 System.out.println(s);
		}
	}
	
	
}
