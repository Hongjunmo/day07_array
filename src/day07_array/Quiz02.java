package day07_array;

import java.util.*;

public class Quiz02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> ph = new ArrayList<>();

		String name = null;
		while (true) {
			System.out.println("1.����ó���");
			System.out.println("2.����ó����");
			System.out.println("3.����ó����");
			System.out.println("4.��� ����ó ����");
			System.out.println("5.����");
			System.out.print(">>>");
			int select = scan.nextInt();
			switch (select) {
			case 1:
				System.out.print("�̸� �Է� : ");
				name = scan.next();
				if (names.indexOf(name) == -1) {
					System.out.print("��ȣ �Է�: ");
					String num = scan.next();
					names.add(name);
					ph.add(num);
				} else {
					System.out.println("�̸��� ������");
				}
				break;

			case 2:
				System.out.print("ã�� �̸� �Է� :");
				name = scan.next();
				int result = names.indexOf(name);
				if (result == -1) {
					System.out.println(name + "���� ��Ͽ� �����ϴ�");
				} else {
					System.out.print(names.get(result) + ":");
					System.out.println(ph.get(result));
				}
				break;
			case 3:
				System.out.println("������ �̸� �Է�:");
				name = scan.next();
				int result2 = names.indexOf(name);
				if (result2 == -1) {
					System.out.println("������ ����� ����");
				} else {
					names.remove(result2);
					ph.remove(result2);
					System.out.println("�����Ϸ�");
				}
				break;
			case 4:
				for (int i = 0; i < names.size(); i++) {
					System.out.print(names.get(i) + ":");
					System.out.println(ph.get(i));
				}
				break;

			case 5:
				System.out.println("�����մϴ�.");
				System.exit(0);

			default:
				System.out.println("�߸� �Է�!");
				continue;
			}

		}

	}
}
