package CH06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		//01_IF기본
		//if(조건식)
		//{
		// 참인경우 실행되는 종속문장
		//}
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나의 :");
//		int age = sc.nextInt();
//		if(age >=8)
//			System.out.println("학교에 다닙니다.");
//		System.out.println("천번째 If 블럭 종료");
//		if(age<8)
//			System.out.println("학교에 다니지 않습니다.");
//		System.out.println("두번째 IF 블럭 종료");
//		System.out.println("프로그램을 종료합니다.");

		
		
		
		//02_IF_ELSE
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나의 :");
//		int age = sc.nextInt();
//		if(age >=8)
//			System.out.println("학교에 다닙니다.");
//		else
//			System.out.println("학교에 다니지 않습니다.");
//		System.out.println("두번째 IF 블럭 종료");
//		System.out.println("프로그램을 종료합니다.");
	
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요");
		int num = sc.nextInt();
		if (num %3 ==0)
			System.out.println(num + "는 3의 배수입니다.");
		
		System.out.print("정수를 입력하세요");
		int num1 = sc.nextInt();
		if ((num1 %3==0)&&(num1 %5==0))
			System.out.println(num1 +"는 3의 배수이면서 5의배수 입니다.");
		 
	}

}
