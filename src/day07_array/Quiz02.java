package day07_array;

import java.util.*;

public class Quiz02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> ph = new ArrayList<>();

		String name = null;
		while (true) {
			System.out.println("1.연락처등록");
			System.out.println("2.연락처보기");
			System.out.println("3.연락처삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			System.out.print(">>>");
			int select = scan.nextInt();
			switch (select) {
			case 1:
				System.out.print("이름 입력 : ");
				name = scan.next();
				if (names.indexOf(name) == -1) {
					System.out.print("번호 입력: ");
					String num = scan.next();
					names.add(name);
					ph.add(num);
				} else {
					System.out.println("이름이 존재함");
				}
				break;

			case 2:
				System.out.print("찾을 이름 입력 :");
				name = scan.next();
				int result = names.indexOf(name);
				if (result == -1) {
					System.out.println(name + "님은 목록에 없습니다");
				} else {
					System.out.print(names.get(result) + ":");
					System.out.println(ph.get(result));
				}
				break;
			case 3:
				System.out.println("삭제할 이름 입력:");
				name = scan.next();
				int result2 = names.indexOf(name);
				if (result2 == -1) {
					System.out.println("삭제할 목록이 없음");
				} else {
					names.remove(result2);
					ph.remove(result2);
					System.out.println("삭제완료");
				}
				break;
			case 4:
				for (int i = 0; i < names.size(); i++) {
					System.out.print(names.get(i) + ":");
					System.out.println(ph.get(i));
				}
				break;

			case 5:
				System.out.println("종료합니다.");
				System.exit(0);

			default:
				System.out.println("잘못 입력!");
				continue;
			}

		}

	}
}
