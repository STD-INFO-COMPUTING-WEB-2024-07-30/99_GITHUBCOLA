package C06;

import java.util.Scanner;

import C00.C01System_out;

public class C01IF {

	public static void main(String[] args) {
//		String a = "ㅎㅇㅎㅇ";
//		String b = "ㅎㅇㅎㅇㅇ";
//
//		System.out.println(a.equals(b));
//		if (a.equals(b)) {
//			System.out.println("일치함");
//		} else {
//			System.out.println("불일치함");
//		}
//
		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 :");
//
//		int age = sc.nextInt();
////		if (age>=8) {
////			System.out.println("맞음");
////		}else {
////			System.out.println("ㄴㄴㄴ");
////		}
////
//		if(age>=15) {
//			System.out.println("고딩");
//
//
//		}else if(age>10&&age<15){
//			System.out.println("중딩");
//		}else {
//			System.out.println("어린이");
//		}

//		int num = sc.nextInt();
//		if (num % 3 == 0 && num % 5 == 0) {
//			System.out.printf("%d는 3의 배수이면서 5의배수", num);
//		} else if (num % 3 == 0) {
//			System.out.printf("%d 는 3의 배수임 ㅇㅇ", num);
//		} else if (num % 5 == 0) {
//			System.out.printf("%d 는 5의 배수임;;", num);
//		} else {
//			System.out.println("둘다 ㄴㄴ");
//		}


		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

//		if(a>b) {
//			System.out.println(a);
//		}
//		if(b>a) {
//			System.out.println(b);
//		}
//		else {
//			System.out.println("두수가 같다");
//		}

//		-----------------------------------

		int max = a;

		if(a>b) {
			max = a;
		}if(a<b) {
			max=b;
		}if(b<c) {
			max=c;
		}
		System.out.println(max);

//		String result = (a>b)? "a" : "b";

}}
