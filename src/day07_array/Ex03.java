package day07_array;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {

			/*      
			 ---List---
			 
			  -ArrayList
			  - LinkedList
			  - stack..���� �ִ�
			  
			  ArrayList
			  -�����Ϳ� ���� ������ �ֵ�. index�� ���� ����
			  -�ߺ��� �����͸� ������ �� �ֵ�
			  -�迭���� �ٸ��� ���� �ٸ� �ڷ����� ���� �� �ִ�
			  -������ ũ�⸦ ���´�.
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
	System.out.println("������:"+arr);
	
	}
}
