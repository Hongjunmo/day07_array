package day07_array;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int arr[] = new int[] { 10, 54, 13, 17, 25, 30 };

//		for(int i =0 ; i<arr.length; i++){
//			if(arr[i]%2==0) {
//				System.out.println("¦�� : " + arr[i]);
//			}else {
//				System.out.println("Ȧ�� : " + arr[i]);
//			}
//			
//		}

		String s = null;
		System.out.println("¦��,Ȧ���Է� : ");
		s = scan.next();

		for (int i = 0; i < arr.length; i++) {
			if (s.equals("¦��")) {
				if (arr[i] % 2 == 0) {
					System.out.println("¦��: " + arr[i]);
				}

			} else if (s.equals("Ȧ��")) {
				if (arr[i] % 2 == 1) {
					System.out.println("Ȧ��: " + arr[i]);
				}

			} else {
				System.out.println("�߸� �Է� ! ");
				break;
			}
		}

	}
}
