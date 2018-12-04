package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class ClassExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum1 = 0;
		int intNum2 = intNum1;  
		
		// 일반변수(int, float..)는 선언만 했을 경우
		// 반드시 최초 한번은 어떤 값이든 저장을 해 주어야 한다.
		// 최초에는 값을 저장(쓰기)만 가능하다
		int intNum3;
		intNum3 = 100;
		
		List<String> stList = new ArrayList(); // 클래스를 이용해서 만든 객체는 초기화를 하지 않으면 쓰기자체도 불가능하다.
												// new ArrayList()로 초기화한다.
		stList.add("문자열추가");
		
		
	}

}
