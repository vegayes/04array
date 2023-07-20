package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {

	/*
	 * 배열(Array) => 같은 자료형의 변수를 하나의 묶음으로 다루는 것. => 묶여진 변수들은 하나의 배열명으로 불러지고 구분은
	 * index를 이용함. (index는 0부터 시작하는 정수)
	 */

	Scanner sc = new Scanner(System.in);

	public void ex1() {

		// 변수 vs 배열

		// 변수 선언
		int num;
		// stack 영역에 int 자료형을 저장할 수 있는 공간 4byte를 할당하고
		// 그 공간에 num이라는 이름을 부여.

		// 변수 대입
		num = 10;
		// 생성된 num이라는 변수 공간에 10을 대입.

		// 변수 사용
		System.out.println("num에 저장된 값 : " + num);
		// num이 저장된 자리에 num에 저장된 값을 읽어와서 출력

		// ---------------------------------------------------------------------
		// 배열 선언
		int[] arr;
		// stack영역에 int[] (int배열) 자료형 공간을 4byte 할당하고
		// 그 공간에 arr이라는 이름을 부여.
		// ** 해당 변수는 참조형으로 주소값만을 저장할 수 있다."

		// 배열 할당
		arr = new int[3];

		// new : "new 연산자"라고 하며
		// Heap 메모리 영역에 새로운 공간(배열, 객체)을 할당.

		// int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열

		// new int[3] : heap영역에 int 3칸 짜리 int[]을 생성 (할당)
		// ** 생성된 int[]에는 시작 주소가 지정된다!!**

		// arr = new int[3];
		// (int[]) (int[]) -> 같은 자료형 == 연산 가능

		// heap영역에 생성된 int[]의 시작주소를
		// stack영역에 생성된 arr 변수에 대입

		// -> arr변수가 int[]을 참조하게 됨
		// 그래서 arr을 참조형이라고 함.

		// 배열 요소 값 대입
		// arr은 int[] 참조형 변수 이지만 (결국 arr변수 안에는 값이 저장되어 있지 않음.?)
		// arr[0]은 각각 int 자료형 변수이기 때문에 정수값을 대입할 수 있다.

		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 1000;

		System.out.println("arr의 주소값 ? : " + arr);

		// 배열 요소 값 읽어오기
		System.out.println(arr[0]); // arr이 참조하고 있는 배열의 0번 인덱스 값을 얻어옴
		System.out.println(arr[1]); // arr이 참조하고 있는 배열의 1번 인덱스 값을 얻어옴
		System.out.println(arr[2]); // arr이 참조하고 있는 배열의 2번 인덱스 값을 얻어옴

	}

	public void ex2() {

		// 배열 선언 및 할당
		int[] arr = new int[4];

		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;

		// 배열의 길이 (몇 칸인가?) : 배열명.length
		System.out.println("배열의 길이 : " + arr.length);

		// 배열과 for문

		for (int i = 0; i < arr.length; i++) {

			System.out.printf("arr[%d]에 저장된 값: %d\n", i, arr[i]);

		}

	}

	public void ex3() {

		// 5명의 키(cm)를 입력받고 평균 구하기

		// 1번 키 입력 : 170.5
		// 2번 키 입력 : 165.7
		// 3번 키 입력 : 182.9
		// 4번 키 입력 : 143.8
		// 5번 키 입력 : 192.1

		// 평균 : 171.00cm

		double[] height = new double[5];
		// double[] 자료형 참조 변수 height를 stack영역에 생성하고
		// height에 heap영역에 새로 생성된 double 5 칸짜리 double[]의 시작주소를 대입

		double avg = 0;

		for (int i = 0; i < height.length; i++) {

			System.out.printf("%d번 키를 입력해주세요 : ", i + 1); // 1 2 3 4 5
			height[i] = sc.nextDouble(); // 0 1 2 3 4
			// 각 인덱스에 입력 받은 값을 대입(초기화)

//			sum += height[i]; // 여기서 처리해도 무방. 

		}

		double sum = 0;

		for (int i = 0; i < height.length; i++) {

			sum += height[i]; // 배열에 저장된 값을 sum에 누적

		}
		System.out.printf("\n평균 : %.2f\n", sum / height.length);

	}

	public void ex4() {

		System.out.print("입력 받을 인원 수 : ");
		int num = sc.nextInt();

		// 배열 선언 및 할당
		// 할당할 배열의 크기는 입력받은 크기 만큼 (num)
		int scoreArray[] = new int[num];

		int sum = 0;

		for (int i = 0; i < scoreArray.length; i++) {

			System.out.printf("%d번 점수 입력 : ", i + 1);
			scoreArray[i] = sc.nextInt();

			sum += scoreArray[i];
		}

		// 최저 / 최고점 구하기

		int max = scoreArray[0];
		int min = scoreArray[0];

		// 아래 for문을 이용해서 score배열에 있는 모든 값과 max, min을 비교
		// score[i] 값이 max보다 크면 max대입
		// score[i] 값이 min보다 작으면 min대입

		for (int i = 0; i < scoreArray.length; i++) {

			if (max < scoreArray[i]) {
				max = scoreArray[i];
			}

			if (min > scoreArray[i]) {

				min = scoreArray[i];
			}

			// 함수 사용시,
			// Math.max(max, scoreArray[i]);
			// Math.min(min, scoreArray[i]);

		}

		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.2f\n", (double) sum / scoreArray.length);
		System.out.printf("최고점: %d\n", max);
		System.out.printf("최저점: %d\n", min);

	}

	public void ex5() {
		// 배열 선언과 동시에 초기화

		char[] arr = new char[5];

		// char[] arr이 참조하는 배열 요소에 A,B,C,D,E 대입하기

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) ('A' + i);

			// A == 65
			// B == 66
			// C == 67
		}

		// **Arrays 클래스
		// ==> math와 비슷하게 Java에서 제공하는 배열과 관련된 기능을 모아둔 클래스

		// Arrays.toString(배열명) : 해당 배열의 모든 요소 값을 출력
		System.out.println(Arrays.toString(arr));

		int[] arr2 = new int[4];

		System.out.println(Arrays.toString(arr2)); // int형을 가지고 있어서 기본값 0을 가지고 있음.

		// 배열 선언과 동시에 ( 할당 및 ) 초기화
		char[] arr3 = { 'A', 'B', 'C', 'D', 'E' };
		// {} (중괄호)는 배열의 리터럴 표기법
		// 들어가는 값 만큼 할당됨.

		System.out.println(Arrays.toString(arr3));

	}

	public void ex6() {
		// 점심 메뉴 뽑기

		String[] menu = { "떡볶이", "튀김", "국밥", "서브웨이", "햄버거" };

		System.out.println("오늘 점심 메뉴  : " + menu[(int) (Math.random() * 4)]);

	}

	public void ex7() {

		// 배열을 이용한 검색

		// 입력받은 정수가 배열에 있는지 없는지 확인
		// 만약 있다면 몇 번 인덱스에 존재하는지 출력

		int[] arr = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };

		System.out.print("정수입력 :");
		int input = sc.nextInt();

		// 신호를 나타내기 위한 변수
		// flag == false : 일치하는 값이 존재하지 않음.
		// flag == true : 일치하는 값이 존재

		boolean flag = false; // 검사 전에는 없다고 가정

		// arr 배열 요소 순차 접근(반복 접근)
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == input) {

				System.out.printf("%d번이 존재하는 인덱스 값은 %d번째 인덱스에 존재 \n", input, i);

				flag = true; // 일치하는 값이 있으므로 true로 변경
			}

		}

		// flag 상태를 검사
		if (!flag) { // flag== false
			System.out.println("존재하지 않음");
		}

	}

	public void ex8() {
		// 입력 받은 값과 일치 값이 있으면 인덱스 번호 출력

		// 없으면 "존재하지 않음"

		String[] arr = { "사과", "딸기", "바나나", "키위", "멜론", "아보카도" };

		System.out.print("과일입력 :");
		String input = sc.next();

		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i].equals(input)) { // ** 문자열이라서 == 안됨.

				System.out.printf("%s는 %d번째 인덱스에 존재함", input, i);

				flag = true;
			}
		}

		if (!flag) {
			System.out.println("존재하지 않음.");
		}
	}

	public void ex9() {
		// 1. 문자열을 입력 받아 한 글자씩 잘라내어 char 배열에 순서대로 저장.

		// 2. 문자 하나를 입력 받아 일치하는 문자가 char 배열에 몇개 존재하는지 확인

		// 3. 단, 일치하는 문자가 없을 경우 "존재하지 않습니다." 출력

		// [사용 해야되는 기술, 기능]
		// 1) 배열 검색
		// 2) String.length() : 문자열의 길이
		// 3) Strign.charAT(index) : 문자열에서 특정 index에 위치한 문자 하나를 얻어옴.
		// 4) count (숫자세기)

		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();

		int count = 0; // 같은 글자 개수를 세기 위한 변수

		boolean flag = false;

		char[] charstr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {

			charstr[i] = str.charAt(i);   // 띄어쓰기도 한 칸으로 받음.

		}
		
//		System.out.println(Arrays.toString(charstr)); // 배열 값 확인 

		System.out.print("검색할 문자 : ");
		String find = sc.next();

		for (int i = 0; i < charstr.length; i++) {

			if (charstr[i] == find.charAt(0)) {
				count++;

				flag = true;
			}

		}

		if (flag) {
			System.out.printf("찾았던 문자 \'%s\'는 %d개 있습니다.", find, count);

		} else {
			System.out.println("존재하지 않습니다.");
		}
		
		/* count로 if문 처리
		 * 
		 * if(count>0){
		 * 		System.out.printf("찾았던 문자 \'%s\'는 %d개 있습니다.", find, count);
		 * } else {
		 * 		System.out.println("존재하지 않습니다.");
		 * }
		 * 
		 */
	}

}
