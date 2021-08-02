package day07_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		
	int num;
	String addnum;
	System.out.println("만들 공간의 개수 입력");
	num=scan.nextInt();
	for(int i = 0; i<num; i++) {
		System.out.println("추가할 수 입력 : ");
		addnum= scan.next();
		arr.add(addnum);
	}
	System.out.println("-----저장 값 출력----");
	for(int i = 0 ; i<arr.size(); i++) {
		String s  = (String)arr.get(i);
		System.out.println(s);
	}
	

	
	
	
	}
}
