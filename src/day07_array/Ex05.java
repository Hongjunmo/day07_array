package day07_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList food = new ArrayList();

		food.add("����");
		food.add("�ұ�");
		food.add("���");
		food.add("���");
		System.out.println(food);
		System.out.print("ã�� �� �Է�:");
		String n = scan.next();
		System.out.println(n + "��ġ : " + food.indexOf(n));
		
		System.out.println("������ ��ġ �Է� :");
		int num = scan.nextInt();
		System.out.println("���� �� �Է� : ");
		n = scan.next();
		System.out.println("������\n"+food);
		food.set(num, n);
		System.out.println("������\n"+food);

	}
}
