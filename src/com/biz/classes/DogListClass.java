package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class DogListClass {
	
	List<String> dogList;
	String strName;
	
	//1번째 생성자
	public DogListClass() {
		 dogList = new ArrayList();
		 this.strName = "몽이";
	}

	
	// 2번째 생성자
	public DogListClass(String strName) {
		dogList = new ArrayList();
		this.strName = strName;
		dogList.add(this.strName);
		
	}
}
