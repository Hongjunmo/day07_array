package day07_array;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		String name[] = new String[3];
		
		for(int i = 0; i<name.length; i++) {
			System.out.println(i+1+"��° �̸� �Է� : ");
			name[i] = scan.next();
		}
	
		for(int i = 0; i<name.length; i++) {
			System.out.println(i+1+"��° �̸� : " + name[i]);
		}
	
	
	
	
	
	
	}
}
