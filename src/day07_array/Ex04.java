package day07_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		
	int num;
	String addnum;
	System.out.println("���� ������ ���� �Է�");
	num=scan.nextInt();
	for(int i = 0; i<num; i++) {
		System.out.println("�߰��� �� �Է� : ");
		addnum= scan.next();
		arr.add(addnum);
	}
	System.out.println("-----���� �� ���----");
	for(int i = 0 ; i<arr.size(); i++) {
		String s  = (String)arr.get(i);
		System.out.println(s);
	}
	

	
	
	
	}
}
