package day02;

import java.util.Scanner;

public class quiz08 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("수 입력 :");
	int a = input.nextInt();
	String b =(a%02==0)?a+"짝수" : a+"짝수가 아니다";
	String c =(a%03==0)?a+"3의 배수이다" : "3의 배수가아니다";
	System.out.println(b);
	System.out.println(c);
	System.out.print("두 수 입력 :");
	int num1 = input.nextInt();
	int num2 = input.nextInt();
//	System.out.print("num1 :"+num1);
//	System.out.println(",num2 :"+num2);
	System.out.printf("num1 : %d, num2 : %d\n",num1,num2);
	String d =(num1>num2)? 
			"num1이 num2보다 크다" : "num2가 num1보다 크다";
	System.out.println(d);
	
}
}
