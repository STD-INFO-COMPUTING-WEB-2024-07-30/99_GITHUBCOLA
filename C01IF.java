package CH06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		// 01_IF기본
		// if(조건식)
		// {
		// 참인경우 실행되는 종속문장
		// }
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

		// 02_IF_ELSE
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
//		if (num %3 ==0)
//			System.out.println(num + "는 3의 배수입니다.");
//		
//		System.out.print("정수를 입력하세요");
//		int num1 = sc.nextInt();
//		if ((num1 %3==0)&&(num1 %5==0))
//			System.out.println(num1 +"는 3의 배수이면서 5의배수 입니다.");
//		
//		if(num%3==0) {
//			if(num%5==0) {
//				System.out.println(num+" 은 3의 배수이면서 5의 배수 입니다.");
//			}else {
//				System.out.println(num+" 은 3의 배수 입니다.");
//			}
//			}

//		if(num%3==0 && num%5==0) {
//			//3의배수 이면서 5의 배수인경우
//			System.out.println(n+" 은 3의 배수이면서 5의 배수 입니다.");
//		}else {
//			//3-o / 5-x
//			//3-x / 5-o
//			//3-x / 5-x
//			if(num%3==0) {
//				System.out.println(n+" 은 3읜 배수입니다.");
//			}

//		
//			
//			System.out.println("정수1를 입력해주세요 :");
//			System.out.println("정수2를 입력해주세요 :");
//			int n1 = sc.nextInt();
//			int n2 = sc.nextInt();
//			
//			if(n1>n2) {
//				System.out.println(n1);
//			}
//			else {
//				System.out.println(n2);
//			
//			
//			}
//			
//		System.out.println("정수1를 입력해주세요");
//		System.out.println("정수2를 입력해주세요");
//		System.out.println("정수3를 입력해주세요");
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int n3 = sc.nextInt();
//
//		int sum = (n1 + n2 + n3);
//		int avarge = (sum / 3);
//
//		System.out.println("세 개의 정수의 합은:" + sum);
//		System.out.println("세 개의 평균 값은 :" + avarge);
//
//		if (n1 >= n2 && n1 >= n3) {
//			System.out.println("큰수 : "+n1);
//
//		}
//		if (n2 >= n1 && n2 >= n3) {
//			System.out.println("큰수 : "+n2);
//
//		}
//		if(n3>=n1 && n3>=n2) {
//			System.out.println("큰수 : "+n3);
//			
//		} 
		
		
		
		
		 
        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = sc.nextInt();
        
        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = sc.nextInt();
        
        System.out.print("세 번째 정수를 입력하세요: ");
        int num3 = sc.nextInt();
        
        
        int max = num1;
        int min = num1;
        
        
        if (num2 > max) {
            max = num2;
        }
        if (num2 < min) {
            min = num2;
        }
        
        
        if (num3 > max) {
            max = num3;
        }
        if (num3 < min) {
            min = num3;
        }
        
       
        System.out.println("가장 큰 수: " + max);
        System.out.println("가장 작은 수: " + min);
        
        
        sc.close();
    }
}

	}

}
