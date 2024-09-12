package Ch06;

import java.util.Scanner;

public class C01If {

	public static void main(String[] args) {
		
		//if 기본
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("나이 : ");
//		int age = sc.nextInt();
//		
//		if (age >= 8) 
//			System.out.println("학교에 다닙니다");
//		System.out.println("첫번째 if 블럭 종료");
//		
//		if (age < 8) 
//			System.out.println("학교에 다니지 않습니다.");	
//		System.out.println("두 번째 if 블럭 종료");
//		System.out.println("프로그램을 종료합니다.");
//		
//		
//		
//		System.out.println("수를 입력하세요 ");
//		int n = sc.nextInt();
//		
//		if (n%5 == 0 && n%3 ==0) 
//			System.out.println("3과 5의 배수 : " + n);
//			
//		else if (n%3 == 0)
//			System.out.println( "3의 배수 : " + n);
		
		
		
		System.out.print("정수 3개를 입력해주세요   ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a >= b) {
			if (a >= c) {
				System.out.println("Max : " + a);
				if (b >= c) 
					System.out.println("Min : " + c);
				else
					System.out.println("Min : " + b);
			}
			else {
				System.out.println("Max : " + c);
				System.out.println("Min : " + b);
			}
		}
		else {
			if (b >= c) {
				System.out.println("Max : " + b);
				if (a >= c) 
					System.out.println("Min : " + c);
				else
					System.out.println("Min : " + a);
			}
			else {
				System.out.println("Max : " + c);
				System.out.println("Min : " + a);
			}
		}
		
	}
}
