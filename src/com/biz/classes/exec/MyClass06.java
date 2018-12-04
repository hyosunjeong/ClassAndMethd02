package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass06 {

	List<Integer> intList;

	public MyClass06() {
		intList = new ArrayList();

	}

	public void add(int num) {

		intList.add(num);

	}

	public void sum() {
		int intLen = intList.size();
		int intSum = 0;
		
		for(int i = 0; i< intLen; i++) {
			int intNum = intList.get(i);
			intSum += intNum;
			
		}
		/*
		 * intSum = 0;
		 * for(int i : intList){
		 * intSum+= i;
		 */
		System.out.println(intSum);
		
	}
}

/*
 * 1. List<Integer> intList선언
 * 2. 생성자에서 intList 초기화
 * 3. add(int num)메서드에서 intList에 num추가
 * 3. sum() 메서드에서 intList의 값을 합산하여 console에 표시
 */

