package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		int[] arr = new int[9];

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			arr[i] += i + 1;

		}

		for (int j = 0; j < arr.length; j++) {

			System.out.print(arr[j] + " ");

			if (j % 2 == 0) {
				sum += arr[j];
			}
		}

		System.out.println("\n짝수 번째 인덱스 합 :" + sum);

	}

	public void practice2() {

		int[] arr = new int[9];

		int sum = 0;

		for (int i = 9; i > 0; i--) {

			arr[9 - i] = i;
		}

		for (int j = 0; j < 9; j++) {

			System.out.print(arr[j] + " ");

			if (j % 2 != 0) {
				sum += arr[j];
			}
		}

		System.out.println("\n홀수 번째 인덱스 합 : " + sum);

	}

	public void practice3() {

		System.out.print("양의 정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 1; i <= num; i++) {

			arr[i - 1] = i;

		}

		for (int j = 0; j < arr.length; j++) {

			System.out.print(arr[j] + " ");

		}

	}

	public void practice4() { // 인덱스 값 다시 생각하기!

		int[] arr = new int[5];

		boolean flag = false;

		for (int i = 0; i < 5; i++) {

			System.out.printf("입력 %d :", i);

			int input = sc.nextInt();

			arr[i] = input;
		}

		System.out.print("검색할 값 : ");
		int find = sc.nextInt();

		for (int a = 0; a < arr.length; a++) {

			if (arr[a] == find) {
				flag = true;
				System.out.println("인덱스 : " + a);
			}
		}

		if (!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}

	}

	public void practice5() {

		System.out.print("문자열 : ");
		String str = sc.next();

		char[] arr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {

			arr[i] = str.charAt(i);

		}

//		System.out.println(Arrays.toString(arr)); //확인용 

		System.out.print("문자 : ");
		char spe = sc.next().charAt(0);

		int count = 0;

		System.out.printf("%s에 %s가 존재하는 위치(인덱스) :", str, spe);

		for (int j = 0; j < arr.length; j++) {

			if (spe == arr[j]) {

				System.out.print(j + " ");
				count++;
			}
		}
		System.out.println("\n" + spe + "개수 : " + count);
	}

	public void practice6() {

		System.out.print("정수 :");
		int arrLength = sc.nextInt();

		int[] arr = new int[arrLength];

		int sum = 0;

		for (int i = 0; i < arrLength; i++) {

			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
		}

		for (int j = 0; j < arr.length; j++) {

			sum += arr[j];

			System.out.print(arr[j] + " ");

		}

		System.out.println("\n총합 : " + sum);

	}

	public void practice7() { // 디테일 추가시키기 ( 자리수 이상나오면 다시 하라고 if문

		System.out.print("주민등록번호 (-포함) : ");
		String RRN = sc.next();

		char[] arr = new char[RRN.length()];

		for (int i = 0; i < RRN.length(); i++) {

			arr[i] = RRN.charAt(i);

		}

		for (int j = 0; j < arr.length; j++) {
			if (j > 7) {
				System.out.print("*");
			} else {
				System.out.print(arr[j]);
			}

		}

	}

	public void practice8() {
		
		// 1. 3이상인 홀수를 입력 받음. (== 배열의 길이)  (3미만 or 짝수는 다시 입력하라고 하고 다시 정수 받도록 함.)
		// 2. 중간 값까지 1씩 오름차순 
		// 3. 중간 이후 값은 1씩 내림차순

		System.out.print("정수 :");

		int num = sc.nextInt();
		int [] arr = new int[num];
		
		if( num < 3 || num %2 == 0) {
			System.out.println("다시 입력하세요.");
			
		}else {
			
			int half = num /2 +1 ; // 홀수면 , 중간값의 + 1  5/2 = 2 +1 ( 3 까지) 
			
			for( int i = 0; i < half; i++) {
				
				arr[i] = i+1;

			}
			
			for( int j = half-1; j < num ; j++) {
				
				arr[j] = j -1;				
			}
		
			System.out.println(Arrays.toString(arr));
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
