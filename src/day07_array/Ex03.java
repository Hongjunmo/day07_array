package day07_array;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {

			/*      
			 ---List---
			 
			  -ArrayList
			  - LinkedList
			  - stack..등이 있다
			  
			  ArrayList
			  -데이터에 대한 순서가 있따. index로 접근 가능
			  -중복된 데이터를 저장할 수 있따
			  -배열과는 다르게 서로 다른 자료형도 넣을 수 있다
			  -가변의 크기를 갖는다.
			 */
	
			
			ArrayList arr = new ArrayList();
			
			arr.add("123");
			arr.add("456");
			arr.add("444");
			arr.add("555");

			System.out.println(arr.indexOf("555"));
			System.out.println("============");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		System.out.println(arr.size());
	
		System.out.println(arr.contains("123"));
		System.out.println(arr.remove("123"));
		System.out.println(arr);
	System.out.println(arr.get(0));
	
	
	arr.clear();
	System.out.println("삭제후:"+arr);
	
	}
}
