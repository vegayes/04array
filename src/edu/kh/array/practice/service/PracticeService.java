package edu.kh.array.practice.service;

import java.nio.file.spi.FileSystemProvider;
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

	public void practice7() { 

		System.out.print("주민등록번호 (-포함) : ");
		String RRN = sc.next();
		
		if(RRN.length() == 14) {

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
		}else {
			
			System.out.println("다시 입력해주세요! (6자리-7자리)");
			
		}

	}

	public void practice8() {

		// 1. 3이상인 홀수를 입력 받음. (== 배열의 길이) (3미만 or 짝수는 다시 입력하라고 하고 다시 정수 받도록 함.)
		// 2. 중간 값까지 1씩 오름차순
		// 3. 중간 이후 값은 1씩 내림차순
		while (true) {

			System.out.print("정수 :");
			int num = sc.nextInt();
			int[] arr = new int[num];

			if (num < 3 || num % 2 == 0) {
				System.out.println("다시 입력하세요.");

				continue;

			} else {

				int half = num / 2 + 1; // 홀수면 , 중간값의 + 1 5/2 = 2 +1 ( 3 까지)

				System.out.println(half);
				for (int i = 0; i < half; i++) {

					arr[i] = i + 1;

				}

				for (int j = half; j < num; j++) {

					arr[j] = (num - j);
				}

				System.out.println(Arrays.toString(arr));
				break;
			}
		}

	}

	public void practice9() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {

			int random = (int) (Math.random() * 10 + 1);

			arr[i] = random;

		}

		System.out.print("발생한 난수 : ");

		for (int j = 0; j < arr.length; j++) {

			System.out.print(arr[j] + " ");

		}

	}

	public void practice10() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {

			int random = (int) (Math.random() * 10 + 1);

			arr[i] = random;

		}

		int max = arr[0];
		int min = arr[0];

		System.out.print("발생한 난수 : ");

		for (int j = 0; j < arr.length; j++) {

			System.out.print(arr[j] + " ");

			if (max < arr[j]) {

				max = arr[j];
			}
			if (min > arr[j]) {

				min = arr[j];
			}
		}

		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

	public void practice11() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {

			int random = (int) (Math.random() * 10 + 1);

			arr[i] = random;

			// 중복 확인
			for (int j = 0; j < i; j++) {

				if (arr[j] == arr[i]) {

					i--;

					break;
				} else {

					arr[i] = random;
				}

			}

		}

		for (int a = 0; a < arr.length; a++) {

			System.out.print(arr[a] + " ");

		}
//		System.out.print(Arrays.toString(arr));

	}

	public void practice12() {

		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {

			int random = (int) (Math.random() * 45 + 1);

			arr[i] = random;

			// 중복확인
			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {

					i--;
					break;
				}

			}

		}

		Arrays.sort(arr);

		for (int a = 0; a < arr.length; a++) {

			System.out.print(arr[a] + " ");
		}
	}

	public void practice13() {
		// 1. 문자열을 입력
		// 2. 문자열을 char형태로 하여 strChar 배열값에 대입
		// 3. 새로 가져오는 인덱스 값이랑 이전에 있는 인덱스 값이 같니?
		// 4. 같으면 그냥 지금 있는거 통과 시켜

		System.out.print("문자열 : ");
		String str = sc.next();

		char[] strChar = new char[str.length()];
		char[] strClone = new char[str.length()];

		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			strClone[i] = str.charAt(i);
		}
		
		System.out.print("문자열에 있는 문자 : ");
		
		for (int i = 0; i < str.length(); i++) {
			
			strChar[i] = str.charAt(i);
			
			for (int j = 0; j <= i; j++) {
				if(strClone[i] == strChar[j] && j != i) { 
					break;
				} else if (i == j) {
					if( strClone.length-1 == j) {
						System.out.print(strClone[i]);
					} else {
						System.out.print(strClone[i]+", ");
						
					}count++;				
				}
			}
		}
		
		System.out.println("\n문자 개수 : "+count);
		
		
		
		
	}

	public void practice14() {

		// 1. 배열의 크기 입력 --> 선언 및 할당 O
		// 2. 배열의 값 :: 사용자 초기화 O
		// 3. 배열의 값 추가 유무 확인 (==> 한번은 무조건 나옴. 그리고 조건에 따라 다시
		// 4. 몇개 더 넣고 싶은지 확인 ( => 방 더 만들기 ???????????)
		// 5. 추가해서 받을 값은 무엇인지
		// 6. 사용자가 더 입력하지 않게다하면, 배열 전체 값 출력

		System.out.print("배열의 크기를 입력하세요 :");
		int size = sc.nextInt();
		sc.nextLine();
		int count = 0;

		String[] strArr = new String[size];

		for (int i = 0; i < strArr.length; i++) {
			count++;
			System.out.printf("%d번째 문자열 :", count);

			strArr[i] = sc.nextLine();
		}
		
		char check;
		String[] newArr = new String[count];

		do {

			System.out.print("더 값을 입력하시겠습니까?(y/n) :");

			check = sc.next().charAt(0);
			sc.nextLine();

			if (check == 'y' || check == 'Y') {
				System.out.print("더 입력하고 싶은 개수 :");
				int more = sc.nextInt();
			
				
				newArr = new String[count + more];
				for(int i = 0; i < strArr.length; i++) {
					newArr[i] = strArr[i];
				}

				for (int j = 0; j < more; j++) {
					count++;
					System.out.printf("%d번째 문자열 :", count);

					newArr[count - 1] = sc.next();
				}
			} else if (check == 'n' || check == 'N') {

				System.out.println(Arrays.toString(newArr));
				break;
			}
		} while (check == 'y');

//		char check = sc.next().charAt(0);
//		
//		if(check == 'y') {
//			
//			System.out.print("더 입력하고 싶은 개수 :");
//			int more = sc.nextInt();
//			
//			for(int j = 0; j < more; j++) {
//				
//				System.out.printf("%d번째 문자열 :",strArr.length+j+1);
//				
//				strArr[strArr.length+j+1] = sc.next();
//				
//			}
//			
//			
//		}

	}
}
