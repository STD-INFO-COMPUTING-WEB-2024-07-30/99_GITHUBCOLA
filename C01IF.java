package CH06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//01
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 :");
//		int age = sc.nextInt();
//		if(age >= 8) {
//			System.out.println("학교에 다닙니다.");
//		System.out.println("첫번째 IF블럭 종료.");
//		}
//		if(age < 8) {
//			System.out.println("학교에 다니지 않습니다.");
//		System.out.println("두번째 IF블럭 종료.");
//		System.out.println("프로그램을 종료합니다..");
//		}
		
		
//		//02
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 :");
//		int age = sc.nextInt();
//		if(age >= 8) {
//			System.out.println("학교에 다닙니다.");}
//			else {
//			System.out.println("학교에 다니지 않습니다.");
//			
//		System.out.println("두번째 IF블럭 종료.");
//		System.out.println("프로그램을 종료합니다..");
//		}
		
		// 문제 
		// 1) 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요
		// 2) 3의 배수이면서 5의 배수라면 출력
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		
//		System.out.println("정수를 입력하시오 :");
//		int num = sc.nextInt();
//		
//		
//			
//			System.out.println("정수를 입력하시오 :");
//			int num = sc.nextInt();
//			
//			if(num%5 != 0 && num%3 == 0) {
//				System.out.printf("%d은 3의 배수 입니다.: \n",num);
//			}else if(num%5==0 && num%3 == 0){
//				System.out.printf("%d은 3과 5의 배수 입니다.: \n",num);
//			}else { System.out.printf("%d는 3과 5의 배수가 아닙니다. \n",num);
//			
//		}
		
		// 문제 
		// 1) 두수를 입력받아 두 수중에 큰 수를 출력
		
		// 2) 세 개의 정수를 입력받아 해당수의 합과 평균을 출력
		
		// 3) 문제
		// 세개의 정수를 입력받아 가장 큰수와 가장 작은 수를 각각 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하시오 :");
		int num = sc.nextInt();
		System.out.println("두번째 정수를 입력하시오 :");
		int num1 = sc.nextInt();
		System.out.println("세번째 정수를 입력하시오 :");
		int num2 = sc.nextInt();
		
		
		if (num >= num1) {
			if (num >= num2) { 
				System.out.print("최대값: "+ num);
			}
			if (num2 > num) {
				System.out.print("최대값: "+ num2);
			}
			
			if(num1 >= num2) {
				System.out.print("최소값: " +num2);
			} else {
				System.out.print("최소값: " +num1);
			}
		}
		
		if (num < num1) {
			if (num1 >= num2) { 
				System.out.print("최대값: "+ num1);
			}
			if (num2 > num1) {
				System.out.print("최대값: "+ num2);
			}
			
			if(num >= num2) {
				System.out.print("최소값: " +num2);
			} else {
				System.out.print("최소값: " +num);
			}
		}
		
		
		
		
		
	}	

}
