package day07_array;

public class Ex01 {
	public static void main(String[] args) {

		/*
		 * - 배열 -
		 * 
		 * -자료형 [] 변수명(배열명) -자료형 배열명(변수명) [] -index(청자) : 0부터 시작
		 */

		int[] arr = new int[5];

		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		
		System.out.println("arr 0 :" + arr[0]);
		System.out.println("arr 1 :" + arr[1]);
		System.out.println("arr 2 :" + arr[2]);
		System.out.println("arr 3 :" + arr[3]);
		System.out.println("arr 4 :" + arr[4]);

		System.out.println(arr.length);
		System.out.println("=====================");
		for(int i :arr) {
			System.out.println(i);
		}
		System.out.println("=====================");
		
		
		int arr01 [] = new int[] {10,20,30,40,50};
 		
		
		for(int i :arr01) {
			System.out.println(i);
		}
		
		
		
	}
}
