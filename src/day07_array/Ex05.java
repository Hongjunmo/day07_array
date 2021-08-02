package day07_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList food = new ArrayList();

		food.add("설탕");
		food.add("소금");
		food.add("라면");
		food.add("계란");
		System.out.println(food);
		System.out.print("찾응 값 입력:");
		String n = scan.next();
		System.out.println(n + "위치 : " + food.indexOf(n));
		
		System.out.println("변경할 위치 입력 :");
		int num = scan.nextInt();
		System.out.println("변경 값 입력 : ");
		n = scan.next();
		System.out.println("변경전\n"+food);
		food.set(num, n);
		System.out.println("변경후\n"+food);

	}
}
